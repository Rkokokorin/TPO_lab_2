package Test;

import Logic.LogarithmicFunctions;
import Logic.TrigonometricFunctions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.*;
import static org.mockito.Mockito.*;



public class TrigonometricTest {
        static final double EPS = 0.0001;
        static final double DELTA = 0.001;
        static  TrigonometricFunctions trigonometricFunctions ;

//        @BeforeAll
//        static void setup() {
//            sinMock = mock(SinDecomposer.class);
//            when(sinMock.calculate(0.0, EPSILON)).thenReturn(0.0);
//            when(sinMock.calculate(PI / 6, EPSILON)).thenReturn(0.5);
//            when(sinMock.calculate(PI / 4, EPSILON)).thenReturn(sqrt(2) / 2);
//            when(sinMock.calculate(PI / 3, EPSILON)).thenReturn(sqrt(3) / 2);
//            when(sinMock.calculate(PI / 2, EPSILON)).thenReturn(1.0);
//            when(sinMock.calculate(PI, EPSILON)).thenReturn(0.0);
//            when(sinMock.calculate(PI * 5 / 4, EPSILON)).thenReturn(-sqrt(2) / 2);
//            when(sinMock.calculate(PI * 3 / 2, EPSILON)).thenReturn(-1.0);
//            when(sinMock.calculate(PI / 4 + PI/2, EPSILON)).thenReturn(1/sqrt(2));
//            when(sinMock.calculate(PI * 7 / 4, EPSILON)).thenReturn(-sqrt(2) / 2);
//
//            trigonometryFunctions = new TrigonometryFunctions(sinMock);
//        }
//        }



}
