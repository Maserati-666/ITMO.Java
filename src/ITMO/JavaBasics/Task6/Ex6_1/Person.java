package ITMO.JavaBasics.Task6.Ex6_1;

public abstract class Person {
    protected String firstName;
    protected String lastName;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    abstract String outputInfo();

}
