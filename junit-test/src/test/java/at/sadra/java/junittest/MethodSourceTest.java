package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of MethodSource Annotation in @ParameterizedTest")
class MethodSourceTest {

    static List<String> namesProvider() {
        return Arrays.asList("Sadra", "Sara", "Nana", "Nini");
    }

    static List<Arguments> personsProvider() {
        return Arrays.asList(
                Arguments.of("Sadra", 28),
                Arguments.of("Sara", 18),
                Arguments.of("Nana", 33),
                Arguments.of("Nini", 6)
        );
    }


    @DisplayName(value = "Normal test: Names")
    @ParameterizedTest(name = "{arguments}")
    @MethodSource("namesProvider")
    void methodTest(String name) {
        System.out.println(name);
        assertNotNull(name);
    }


    @DisplayName(value = "Method test with two Arguments")
    @ParameterizedTest(name = "{0} is {1} years old")
    @MethodSource("personsProvider")
    void methodTestWithTwoArguments(String name, Integer age) {
        assertNotNull(name);
        assertNotEquals(0,age);
    }
}
