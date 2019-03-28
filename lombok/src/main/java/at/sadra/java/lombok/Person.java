package at.sadra.java.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder(buildMethodName = "create",builderMethodName = "newPerson")
@ToString
public class Person {
    private String name;
    private String family;
    private int age;
}
