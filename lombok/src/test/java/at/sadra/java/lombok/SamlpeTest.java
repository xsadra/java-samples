package at.sadra.java.lombok;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Sample Class")
class SamlpeTest {

    @Test
    @DisplayName("Create new Person: Nana alam 33.")

    void getNewPerson() {
        Person newPerson = Samlpe.getNewPerson();
        assertAll(
                ()->assertEquals(newPerson.getName(),"Nana","name is wrong."),
                ()->assertEquals(newPerson.getAge(),33)
        );
    }
}