package at.sadra.java.lombok;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Samlpe {
    public Person getNewPerson() {
        return Person.newPerson()
                .name("Nana")
                .family("alam")
                .age(33)
                .create();
    }
}
