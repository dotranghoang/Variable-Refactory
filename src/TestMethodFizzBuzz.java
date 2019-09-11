import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethodFizzBuzz {
    @Test
    @DisplayName("Test FizzBuzz")
    public void testingFizzBuzz() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Test Fizz")
    public void testingFizz() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Buzz")
    public void testingBuzz() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

}
