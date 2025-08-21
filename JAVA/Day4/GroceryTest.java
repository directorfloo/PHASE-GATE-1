import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {


@Test


public void testToMultiplyTwoNumber() {


// Arrange
int firstNumber = 4;
int secondNumber = 5;



Calculator calculator = new Calculator();
int result = calculator.multiply(firstNumber, secondNumber);


assertEquals(result, 20);
}

}

