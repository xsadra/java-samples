package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
}
