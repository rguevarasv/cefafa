package sv.com.farmaciascefafa.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sv.com.farmaciascefafa.service.IOperacionesService;
import sv.com.farmaciascefafa.service.impl.OperacionesServiceImpl;

public class AppTest {
	IOperacionesService service = new OperacionesServiceImpl();
	
    @Test
    public void TestSuma(){
        assertTrue( service.suma(1, 1) == 2 );
    }
    
    @Test
    public void TestResta(){
        assertTrue( service.resta(3, 1) == 2 );
    }
    
    @Test
    public void TestMultiplicacion(){
        assertTrue( service.multiplicacion(2, 1) == 2 );
    }
    
    @Test
    public void TestDivision(){
        assertTrue( service.division(2, 1) == 2 );
    }
}
