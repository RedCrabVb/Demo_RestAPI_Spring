import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestComponent
public class DemoApplicationTests {

    @Test
    void math() {
        //Assert
        var i = 1;

        //Act
        var result = i + 2;

        //Arrange
        assertTrue(result != i);
    }

}
