package at.sadra.java.junittest;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Test of BeforeAll, AfterAll, BeforeEach, AfterEach Annotation")
public class BeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.err.println("## Do this Before All Tests.");
    }

    @AfterAll
    static void afterAll() {
        System.err.println("## Do this After All Tests.");
    }

    @BeforeEach
    void beforeEach() {
        System.err.println("\t-- Do this Before Each Test.");
    }

    @AfterEach
    void afterEach() {
        System.err.println("\t-- Do this After Each Test.");
    }

    @Test
    @DisplayName("First Test")
    void firstTest() {
        System.err.println("\t\t++ Do the First Test.");
    }

    @Test
    @DisplayName("Second Test")
    void secondTest() {
        System.err.println("\t\t++ Do the Second Test");
    }
}
