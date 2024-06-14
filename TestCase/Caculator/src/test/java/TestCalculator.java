import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @ParameterizedTest
    @CsvFileSource(resources = "/add.csv", numLinesToSkip = 1)
    void testAdd(double a, double b, double result){
        Calculator math = new Calculator();
        assertEquals(math.add(a,b), result, 0.001);
        //0.001 là sai số có thể cho phép
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/subtraction.csv", numLinesToSkip = 1)
    void testSubtraction(double a, double b, double result){
        Calculator math = new Calculator();
        assertEquals(math.subtraction(a,b), result, 0.001);
        //0.001 là sai số có thể cho phép
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/division.csv", numLinesToSkip = 1)
    void testDivision(double a, double b, double result){
        Calculator math = new Calculator();
        if(!Double.isNaN(result)){
            result = (double) Math.round(result * 100.0) / 100.0;
        }
        assertEquals(math.division(a, b), result, 0.001);
        //0.001 là sai số có thể cho phép
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/time.csv", numLinesToSkip = 1)
    void testTime(double a, double b, double result){
        Calculator math = new Calculator();
        assertEquals(math.time(a,b), result, 0.001);
        //0.001 là sai số có thể cho phép
    }
}
