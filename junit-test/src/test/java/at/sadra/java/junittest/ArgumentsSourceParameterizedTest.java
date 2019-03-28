package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of ArgumentsSource Annotation in @ParameterizedTest")
class ArgumentsSourceParameterizedTest {

    @DisplayName(value = "Arguments test with two Parameters")
    @ParameterizedTest(name = "{0} is {1} years old")
    @ArgumentsSource(CustomArgumentsProvider.class)
    void CsvFileSourceTestWithTwoParameters(String name, Integer age) {
        assertNotNull(name);
        assertNotEquals(0, age);
    }
}
