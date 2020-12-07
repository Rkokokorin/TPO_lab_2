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
        when(trigonometryFuncMock.tan(-0.5)).thenReturn(tan(-0.5));
        when(trigonometryFuncMock.cos(-0.5)).thenReturn(cos(-0.5));
        when(trigonometryFuncMock.sin(-0.5)).thenReturn(sin(-0.5));
        when(trigonometryFuncMock.sec(-0.5)).thenReturn(1.1394939273);
        when(trigonometryFuncMock.csc(-0.5)).thenReturn(-2.0858296429);
        when(trigonometryFuncMock.cot(-0.5)).thenReturn(-1.8304877217);
        when(trigonometryFuncMock.tan(-4.)).thenReturn(tan(-4));
        when(trigonometryFuncMock.cos(-4.)).thenReturn(cos(-4));
        when(trigonometryFuncMock.sin(-4.)).thenReturn(sin(-4));
        when(trigonometryFuncMock.sec(-4.)).thenReturn(1.5298856565);
        when(trigonometryFuncMock.csc(-4.5)).thenReturn(1.3213487088);
        when(trigonometryFuncMock.cot(-4.)).thenReturn(-0.8636911545);
        when(trigonometryFuncMock.tan(-6.)).thenReturn(tan(-6.));
        when(trigonometryFuncMock.cos(-6.)).thenReturn(cos(-6));
        when(trigonometryFuncMock.sin(-6.)).thenReturn(sin(-6));
        when(trigonometryFuncMock.sec(-6.)).thenReturn(1.0414819266);
        when(trigonometryFuncMock.csc(-6.)).thenReturn(3.5788995473);
        when(trigonometryFuncMock.cot(-6.)).thenReturn(3.4363530042);
        when(trigonometryFuncMock.tan(-2.1)).thenReturn(tan(-2.1));
        when(trigonometryFuncMock.cos(-2.1)).thenReturn(cos(-2.1));
        when(trigonometryFuncMock.sin(-2.1)).thenReturn(sin(-2.1));
        when(trigonometryFuncMock.sec(-2.1)).thenReturn(-1.9808016560);
        when(trigonometryFuncMock.csc(-2.1)).thenReturn(-1.1584675035);
        when(trigonometryFuncMock.cot(-2.1)).thenReturn(0.5848478065);
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
        assertEquals(-21.294, mainFunctions.solveNegative(-0.5), DELTA);
    }

    @Test
    void trigonometricalGrowTest() {
        assertEquals(3.957, mainFunctions.solveNegative(-2.1), DELTA);
    }
    @Test
    void trigonometricalFourMinusTest() {
        assertEquals(2.107, mainFunctions.solveNegative(-4.), DELTA);
    }
    @Test
    void trigonometricalSixMinusTest() {
        assertEquals(-114.7822, mainFunctions.solveNegative(-6.), DELTA);
    }





}
