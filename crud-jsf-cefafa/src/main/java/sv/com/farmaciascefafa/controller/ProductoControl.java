package sv.com.farmaciascefafa.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import sv.com.farmaciascefafa.entities.Producto;
import sv.com.farmaciascefafa.model.ProductoFacade;

import javax.faces.bean.ViewScoped;

@ManagedBean(name = "productoControl")
@ViewScoped
public class ProductoControl implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
    ProductoFacade productoFacade;
    
    private List<Producto> lstProducto;

    private List<Producto> lstProductoFiltrada;

    private Producto productoSeleccionado;
    
    @PostConstruct
    public void init(){
       lstProducto = new ArrayList<>();
        //lstProductoFiltrada = new ArrayList<>();
        listarProductos();
        productoSeleccionado = new Producto(); 
    }
            
     public void guardarProducto() {//modificar el producto
        try {
            productoFacade.create(productoSeleccionado);
            listarProductos();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void modificarProducto() {//modificar el producto
        try {
            productoFacade.edit(productoSeleccionado);
            listarProductos();
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", "Datos modificados correctamente..!"));
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void eliminarProducto() {
        try {
            productoFacade.remove(productoSeleccionado);
            listarProductos();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", "Datos eliminados correctamente..!"));
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public List<Producto> listarProductos() {
        lstProducto = productoFacade.findAll();
        return lstProducto;
    }

    public List<Producto> getLstProducto() {
        return lstProducto;
    }

    public void setLstProducto(List<Producto> lstProducto) {
        this.lstProducto = lstProducto;
    }

    public List<Producto> getLstProductoFiltrada() {
        return lstProductoFiltrada;
    }

    public void setLstProductoFiltrada(List<Producto> lstProductoFiltrada) {
        this.lstProductoFiltrada = lstProductoFiltrada;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    
}
