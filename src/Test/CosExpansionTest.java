package Test;
import Logic.CosFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CosExpansionTest {
    CosFunction cosFunction = new CosFunction();
    final double DELTA = 0.001;


    @Test
    void testMinusPI(){
        assertEquals(Math.cos(-Math.PI), cosFunction.cos(-Math.PI), DELTA);
    }

   @Test
    void testMinusHalfPI(){
        assertEquals(Math.cos(-Math.PI / 2), cosFunction.cos(-Math.PI / 2), DELTA);
    }

    @Test
    void testMinusOne(){
        assertEquals(Math.cos(-1), cosFunction.cos(-1), DELTA);
    }

    @Test
    void testZero(){
        assertEquals(Math.cos(0), cosFunction.cos(0), DELTA);
    }

    @Test
    void testOne(){
        assertEquals(Math.cos(1), cosFunction.cos(1), DELTA);
    }

    @Test
    void testHalfPI(){
        assertEquals(Math.cos(Math.PI / 2), cosFunction.cos(Math.PI / 2), DELTA);
    }

    @Test
    void testPI(){
        assertEquals(Math.cos(Math.PI), cosFunction.cos(Math.PI), DELTA);
    }




}