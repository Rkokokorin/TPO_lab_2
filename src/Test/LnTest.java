package Test;

import Logic.Ln;
import Logic.LogarithmicFunctions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LnTest {
        Ln  logarithmicFunctions = new Ln();
        final double DELTA = 0.001;
        final double EPS = 0.0001;

        @Test
        void testZero(){
            assertThrows(IllegalArgumentException.class, () -> {
                logarithmicFunctions.ln(0);
            });
        }
    @Test
    void belowZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            logarithmicFunctions.ln(-87);
        });
    }

        @Test
        void testNearZero(){
            assertEquals(Math.log(0.08), logarithmicFunctions.ln(0.08), DELTA);
        }

        @Test
        void testHalf(){
            assertEquals(Math.log(0.5), logarithmicFunctions.ln(0.5), DELTA);
        }

        @Test
        void testOne(){
            assertEquals(Math.log(1), logarithmicFunctions.ln(1.), DELTA);
        }

        @Test
        void testTen(){
            assertEquals(Math.log(10), logarithmicFunctions.ln(10.), DELTA);
        }

    }


