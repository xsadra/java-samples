package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of CsvSource Annotation in @ParameterizedTest")
class CsvSourceTest {

    @DisplayName("Csv Source test with two Parameters")
    @ParameterizedTest(name = "{0} is {1} years old")
    @CsvSource({
            "Sadra, 28",
            "Sara,  18",
            "Nana,  33",
            "Nini,   6"
    })
    void csvSourceTestWithTwoParameters(String name, Integer age) {
        assertNotNull(name);
        assertNotEquals(0,age);
    }
}
