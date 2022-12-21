import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){

        calculator = new Calculator();

    }

    @Test
    public void calculatorTest_whenResultIs_1090mm(){
        calculator.add(10, "cm");
        calculator.add(1, "m");
        calculator.substract(10, "mm");
        String expectedResult = "1090.0 mm";
        assertEquals(expectedResult, calculator.getResult(),"Result should be 1090 mm");
    }

    @Test
    public void runAllTests(){
       calculatorTest_whenResultIs_1090mm();
    }


}
