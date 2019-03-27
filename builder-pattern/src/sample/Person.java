package sample;

public class Person {
    private String name;
    private String lastName;
    private int age;

    private Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static PersonBuilder newPerson() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private String lastName;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person create() {
            if (name == null) throw new IllegalArgumentException("Use Name method");
            if (lastName == null) throw new IllegalArgumentException("Use lastName method");
            if (age == 0) throw new IllegalArgumentException("Use age method");
            return new Person(name, lastName, age);
        }

        public void display() {
            System.out.println(create());
        }
    }
}
