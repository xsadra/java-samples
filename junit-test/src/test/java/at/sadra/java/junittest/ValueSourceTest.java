package at.sadra.java.junittest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("Test of ValueSource Annotation in @ParameterizedTest")
class ValueSourceTest {

    @DisplayName("Value Source test with int type")
    @ParameterizedTest(name = "Number is {0}")
    @ValueSource(ints = {28, 18, 33, 6})
    void intValueTest(Integer number) {
        assertNotEquals(0, number);
    }


    @DisplayName("Value Source test with String type")
    @ParameterizedTest(name = "Name is {0}")
    @ValueSource(strings = {"Sadra", "Sara", "Nana", "Nini"})
    void stringValueTest(String name, TestInfo testInfo) {
        //        System.out.println(
        //          testInfo.getTestClass().get().getSimpleName() + " - " +
        //          testInfo.getTestMethod().get().getName() + " : " +
        //          name);
        assertNotNull(name);
    }

    @DisplayName("Convert Value Source test: String to Boolean")
    @ParameterizedTest
    @ValueSource(strings = {"true", "true"})
    void booleanConversionValueSourceTest(Boolean parameter) {
        assertTrue(parameter);
    }

    @DisplayName("Convert Value Source test: String to Integer")
    @ParameterizedTest(name = "Number is {0}")
    @ValueSource(strings = {"28", "18", "33", "6"})
    void integerConversionValueSourceTest(Integer number) {
        assertTrue(number > 5);
    }

    @DisplayName("Convert Value Source test: String to Double")
    @ParameterizedTest(name = "Number is {0}")
    @ValueSource(strings = {"28.5", "18.0", "33.1", "6D"})
    void doubleConversionValueSourceTest(Double number) {
        assertTrue(number > 5);
    }

    @DisplayName("Convert Value Source test: String to Enum")
    @ParameterizedTest(name = "Month is {0}")
    @ValueSource(strings = {"FEBRUARY", "MAY", "APRIL", "MARCH"})
    void enumConversionValueSourceTest(Month month) {
        assertNotNull(month);
    }

    @Disabled("LocalDate Conn't Convert String to Date!")
    @DisplayName("Convert Value Source test: String to LocalDate")
    @ParameterizedTest(name = "Month is {0}")
    @ValueSource(strings = {"1990-2-3", "2001-5-6", "1985-4-9", "2013-3-1"})
    void enumConversionValueSourceTest(LocalDate localDate) {
        assertNotNull(localDate);
    }



}
