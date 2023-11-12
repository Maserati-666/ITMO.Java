package ITMO.JavaBasics.Task6.Ex6_2;

public class Client extends Person {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String outputInfo() {
        return  "ClientName = " + this.firstName + " " + this.lastName + " " +
                "BankName = " + this.bankName;
    }
}