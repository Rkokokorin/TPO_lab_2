package Test;

import Logic.CosFunction;
import Logic.LogarithmicFunctions;
import Logic.TrigonometricFunctions;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class TrigonometricTest {
        static final double DELTA = 0.01;
        static CosFunction cosMock;
        static  TrigonometricFunctions trigonometricFunctions ;

        @BeforeEach
      void setup() {
            cosMock = mock(CosFunction.class);
            when(cosMock.cos(0.0)).thenReturn(1.);
            when(cosMock.cos(PI / 6)).thenReturn(sqrt(3) / 2);
            when(cosMock.cos(PI / 4)).thenReturn(sqrt(2) / 2);
            when(cosMock.cos(PI / 3)).thenReturn(0.5);
            when(cosMock.cos(PI / 2)).thenReturn(0.);
            when(cosMock.cos(PI)).thenReturn(-1.);
            when(cosMock.cos(PI * 5 / 4)).thenReturn(-sqrt(2) / 2);
            when(cosMock.cos(PI * 3 / 2)).thenReturn(0.);
            when(cosMock.cos(3*PI / 4)).thenReturn(-sqrt(2) / 2);
            when(cosMock.cos(PI * 7 / 4)).thenReturn(-sqrt(2) / 2);
            trigonometricFunctions = new TrigonometricFunctions();
        }


    @ParameterizedTest
    @ValueSource(doubles =  {0, PI/2, PI/4, PI*3/4, PI, PI*5/4})
    void SinTest(double x) {
        assertEquals(Math.sin(x), trigonometricFunctions.sin(x), DELTA);
    }
    @ParameterizedTest
    @ValueSource(doubles =  {0, PI/4, PI*3/4, PI, PI*5/4})
    void secTest(double x) {
        assertEquals(1 / Math.cos(x), trigonometricFunctions.sec(x), DELTA);
    }

    @ParameterizedTest
    @ValueSource(doubles =  {0, PI/4, PI*3/4, PI, PI*5/4})
    void tanTest(double x) {
        assertEquals(Math.sin(x) / Math.cos(x), trigonometricFunctions.tan(x), DELTA);
    }
    @ParameterizedTest
    @ValueSource(doubles =  { PI/4, PI*3/4,PI/6, PI/3, PI*5/4})
    void cotTest(double x) {
        assertEquals(Math.cos(x)/Math.sin(x) , trigonometricFunctions.cot(x), DELTA);
    }
    @ParameterizedTest
    @ValueSource(doubles =  { PI/6, PI/4, PI/3, PI/2,3*PI/2})
    void cscTest(double x) {
        assertEquals(1/sin(x) , trigonometricFunctions.csc(x), DELTA);
    }




        }




