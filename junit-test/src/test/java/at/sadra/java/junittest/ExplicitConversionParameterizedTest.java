package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of EnumSource Using ConvertWith Annotation in @ParameterizedTest")
class ExplicitConversionParameterizedTest {

    @DisplayName(value = "Convert Enum to String Using Custom Class")
    @ParameterizedTest(name = "Day is {0}")
    @EnumSource(DayOfWeek.class)
    void convertEnumToStringUsingCustomClassTest(@ConvertWith(CustomArgumentsConverter.class) String name) {
        System.out.println(name);
        assertNotNull(name);
    }
}
