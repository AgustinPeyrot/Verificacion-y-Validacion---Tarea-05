import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;


public class FuncionTest {

    private Funcion fun = new Funcion();

    @Test
    public void fibbonaciTestFalse(){
        boolean result = fun.isFibbonaci(20);
        assertFalse(result);
    }
    @Test
    public void fibbonaciTestTrue(){
        boolean result = fun.isFibbonaci(54);
        assertTrue(result);
    }
    @Test
    public void fibbonaciTestNegative(){
        boolean result = fun.isFibbonaci(-5);
        assertFalse(result);
    }

    @Test
    public void cantCaracteresTest(){
        int result = fun.cantCaracteres("La cantidad de caracteres 'a' en este texto se repite 6 veces",'a');
        assertEquals(result,6);
    }

    @Test
    public void sumaPrimosTest(){
        int result = fun.sumaPrimos(16);
        assertEquals(result,41);
    }
}
