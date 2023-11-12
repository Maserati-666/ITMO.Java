package ITMO.JavaBasics.Task6.Ex6_2;

public class BankEmployee extends Person {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String outputInfo() {
        return  "BankEmployeeName = " + this.firstName + " " + this.lastName + " " +
                "BankName = " + this.bankName;
    }
}
