package at.sadra.java.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Test of EnumSource Annotation in @ParameterizedTest")
class EnumSourceTest {

    @DisplayName(value = "Normal test: show Days of Week")
    @ParameterizedTest(name = "{index}: {arguments} ")
    @EnumSource(DayOfWeek.class)
    void enumTest(DayOfWeek dayOfWeek) {
        System.out.println(dayOfWeek);
        assertNotNull(dayOfWeek);
    }

    @DisplayName(value = "Enum Test with specific Names (By default INCLUDE mode)")
    @ParameterizedTest(name = "{arguments}")
    @EnumSource(value = DayOfWeek.class, names = {"MONDAY", "WEDNESDAY", "SATURDAY"})
    void enumTestWithSpecificNames(DayOfWeek dayOfWeek) {
        assertNotNull(dayOfWeek);
    }

    @DisplayName(value = "Enum Test with specific Names: EXCLUDE Mode")
    @ParameterizedTest(name = "{arguments}")
    @EnumSource(value = DayOfWeek.class,
            names = {"MONDAY", "WEDNESDAY", "SATURDAY"},
            mode = EnumSource.Mode.EXCLUDE)
    void enumTestWithSpecificNamesAndExcludeMode(DayOfWeek dayOfWeek) {
        assertNotNull(dayOfWeek);
    }

    @DisplayName(value = "Enum Test with specific Names: MATCH_ALL Mode")
    @ParameterizedTest(name = "{arguments}: Start with [T] and end with [SDAY]")
    @EnumSource(value = DayOfWeek.class,
            mode = EnumSource.Mode.MATCH_ALL,
            names = {".+SDAY$","^T.+"})
    void enumTestWithSpecificNamesAndMatchAllMode(DayOfWeek dayOfWeek) {
        assertNotNull(dayOfWeek);
    }


    @DisplayName(value = "Enum Test with specific Names: MATCH_ANY Mode")
    @ParameterizedTest(name = "{arguments}: Start with [T] or end with [SDAY]")
    @EnumSource(value = DayOfWeek.class,
            mode = EnumSource.Mode.MATCH_ANY,
            names = {".+SDAY$","^T.+"})
    void enumTestWithSpecificNamesAndMatchAnyMode(DayOfWeek dayOfWeek) {
        assertNotNull(dayOfWeek);
    }

}
