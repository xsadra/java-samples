package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Test the performance of the Calculator Class")
class CalculatorTest {

    @Autowired
    Calculator calculator;


    @Test
    @DisplayName("The sum of two numbers")
    void sum() {
        Integer actual = calculator.sum(5, 2);
        Integer expected = 7;

        String message = "Sum function for values[7,2] fails.";

        assertEquals(expected, actual, message);
    }

    @Test
    void sub() {
    }

    @DisplayName("The Multiplication of numbers and 1")
    @ParameterizedTest(name = "Multiple of {arguments} and 1")
    @ValueSource(ints = {1, 20, 33, 49, 115, 346, 755, 8000, 9, 0})
    void mul(Integer number) {
        Integer actual = calculator.mul(number, 1);
        String message = "Multiplication of %x and 1 fails.{0}".replace("%x", number.toString());

        assertEquals(number, actual, message);
    }

    @Test
    void div() {
    }

    @Test
    void abs() {
    }


}