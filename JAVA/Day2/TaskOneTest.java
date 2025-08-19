import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskOneTest {


@Test


public void testToCalculateTwoAge() {


// Arrange
int fatherAge = 30;
int  sonAge = 10;



TaskOne taskOne  = new TaskOne();
int result = taskOne.ageCalculation(fatherAge, sonAge); 


assertEquals(result, 10);
}

}

