package sv.com.farmaciascefafa.test;

import sv.com.farmaciascefafa.service.IOperacionesService;
import sv.com.farmaciascefafa.service.impl.OperacionesServiceImpl;

public class Inicial {

	public static void main(String[] args) {	
		
		IOperacionesService servicio = new OperacionesServiceImpl();
		
		System.out.println("Resultado suma "+servicio.suma(1, 1));
		
		System.out.println("Resultado resta "+servicio.resta(3, 1));
		
		System.out.println("Resultado multiplicacion "+servicio.multiplicacion(2, 1));
		
		System.out.println("Resultado division "+servicio.division(2, 1));

	}

}
