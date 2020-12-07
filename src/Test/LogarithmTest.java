package Test;

import Logic.Ln;
import Logic.LogarithmicFunctions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.log;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.Math.*;

public class LogarithmTest {
    static final double EPSILON = 0.0001;
    static final double DELTA = 0.001;
    static Ln lnMock;
    static LogarithmicFunctions logFunctions;

    @BeforeAll
    static void setUp() {
        lnMock = mock(Ln.class);
        when(lnMock.ln(0.)).thenReturn(Double.NaN);
        when(lnMock.ln(-1.)).thenReturn(Double.NaN);
        when(lnMock.ln(-10.)).thenReturn(Double.NaN);
        when(lnMock.ln(-0.001)).thenReturn(Double.NaN);
        when(lnMock.ln(-1000.)).thenReturn(Double.NaN);
        when(lnMock.ln(0.2)).thenReturn(log(0.2));
        when(lnMock.ln(0.5)).thenReturn(log(0.5));
        when(lnMock.ln(1.)).thenReturn(0.0);
        when(lnMock.ln(2.)).thenReturn(log(2.0));
        when(lnMock.ln(4.)).thenReturn(log(4.0));
        when(lnMock.ln(8.)).thenReturn(log(8.0));
        when(lnMock.ln(72.)).thenReturn(log(72.0));
        when(lnMock.ln(3.)).thenReturn(log(3.0));
        when(lnMock.ln(5.)).thenReturn(log(5.0));
        when(lnMock.ln(10.)).thenReturn(log(10.0));
        logFunctions = new LogarithmicFunctions();
    }

    @ParameterizedTest
    @ValueSource(doubles = { 0.2, 0.5, 1, 2, 4, 8, 72 })
    void log3ValidValuesTest(double x) {
        assertEquals(logN(x, 3), logFunctions.log3(x), DELTA);
    }


    @ParameterizedTest
    @ValueSource(doubles = {0.2, 0.5, 1, 2, 4, 8, 72  })
    void log10ValidValuesTest(double x) {
        assertEquals(logN(x, 10), logFunctions.log10(x), DELTA);
    }


    static double logN(double x, double base) {
        return log(x) / log(base);
    }
}
