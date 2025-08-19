import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTwoTest {


@Test


public void testToCalculateScore() {


// Arrange
int score1 = 90;
int score2 = 90;
int score3 = 90;



TaskTwo taskTwo  = new TaskTwo();
char result = taskTwo.averageScore(score1, score2, score3); 


assertEquals(result, 'A');
}

}
