package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of CsvFileSource Annotation in @ParameterizedTest")
class CsvFileSourceTest {

    @DisplayName("Csv File Source test with two Parameters")
    @ParameterizedTest(name = "{0} is {1} years old")
    @CsvFileSource(resources = "/persons.csv")
    void csvFileSourceTestWithTwoParameters(String name, Integer age) {
        assertNotNull(name);
        assertNotEquals(0, age);
    }
}
