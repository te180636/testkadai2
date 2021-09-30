package jp.te4a.spring.boot.myapp2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @InjectMocks
    HelloController helloController;

    @BeforeEach
    public void each(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        String expected = helloController.index();
        String actual = "taro desu!";
        assertEquals(expected, actual);
    }
}
