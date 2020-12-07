package Test;


import Logic.LogarithmicFunctions;
import Logic.MainFunctions;
import Logic.TrigonometricFunctions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.Math.log;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.*;

public class FunctionTest {

    static final double DELTA = 0.001;

    static TrigonometricFunctions trigonometryFuncMock;
    static LogarithmicFunctions logNFuncMock;
    static MainFunctions mainFunctions;

    @BeforeAll
    static void setUp() {
        trigonometryFuncMock = mock(TrigonometricFunctions.class);
        logNFuncMock = mock(LogarithmicFunctions.class);

        when(trigonometryFuncMock.tan(-PI/4)).thenReturn(-1.);
        when(trigonometryFuncMock.sec(-PI/4)).thenReturn(Math.sqrt(2));
        when(trigonometryFuncMock.cos(-PI/4)).thenReturn(1/Math.sqrt(2));
        when(trigonometryFuncMock.tan(-3.5)).thenReturn(tan(-3.5));
        when(trigonometryFuncMock.sec(-3.5)).thenReturn(-1.06786);
        when(trigonometryFuncMock.cos(-3.5)).thenReturn(cos(-3.5));
        when(trigonometryFuncMock.tan(-5.8)).thenReturn(tan(-5.8));
        when(trigonometryFuncMock.sec(-5.8)).thenReturn(1.12928);
        when(trigonometryFuncMock.cos(-5.8)).thenReturn(cos(-5.8));
        when(trigonometryFuncMock.tan(-4.2)).thenReturn(tan(-4.2));
        when(trigonometryFuncMock.sec(-4.2)).thenReturn(-2.03973);
        when(trigonometryFuncMock.cos(-4.2)).thenReturn(cos(-4.2));
        when(logNFuncMock.ln(1)).thenReturn(log(1));
        when(logNFuncMock.log3(1.)).thenReturn(0.);
        when(logNFuncMock.log10(1.)).thenReturn(0.);
        when(logNFuncMock.ln(3)).thenReturn(log(3));
        when(logNFuncMock.log3(3.)).thenReturn(1.);
        when(logNFuncMock.log10(3.)).thenReturn(0.477121255);
        when(logNFuncMock.ln(50.)).thenReturn(log(50));
        when(logNFuncMock.log3(50.)).thenReturn(3.560876795);
        when(logNFuncMock.log10(50.)).thenReturn(1.698970004);
        when(logNFuncMock.ln(2.)).thenReturn(log(2));
        when(logNFuncMock.log3(2.)).thenReturn(0.630929754);
        when(logNFuncMock.log10(2.)).thenReturn(0.301029996);
        when(logNFuncMock.ln(15)).thenReturn(log(15));
        when(logNFuncMock.log3(15.)).thenReturn(2.464973521);
        when(logNFuncMock.log10(15.)).thenReturn(2.464973521);
         mainFunctions = new MainFunctions();
    }



    @Test
    void LogOneTest() {
        assertEquals(0, mainFunctions.solvePositive(1 ), DELTA);
    }
    @Test
    void Log50Test() {
        assertEquals(2057.510, mainFunctions.solvePositive(50 ), DELTA);
    }
    @Test
    void Log3Test() {
        assertEquals(0.0026, mainFunctions.solvePositive(3 ), DELTA);
    }
    @Test
    void Log2Test() {
        assertEquals(0.002675, mainFunctions.solvePositive(2 ), DELTA);
    }
    @Test
    void Log15Test() {
        assertEquals(92.628, mainFunctions.solvePositive(15), DELTA);
    }

  @Test
    void trigonometricHalfTest() {
        assertEquals(-28.25927, mainFunctions.solveNegative(0.5), DELTA);
    }

    @Test
    void trigonometricalGrowTest() {
        assertEquals(1.418, mainFunctions.solveNegative(2.1), DELTA);
    }

    @Test
    void trigonometricalNegativeTest(){
        assertEquals(-7.0355, mainFunctions.solveNegative(-PI/4), DELTA);

    }





}
