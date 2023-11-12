package ITMO.JavaBasics.Task6.Ex6_2;


public class Main {
    public static void main(String[] args) {
        Person client = new Client("Mike", "Ross", "VTB");
        Person employee = new BankEmployee("Bob", "Dilan", "VTB");
        System.out.println(client.outputInfo());
        System.out.println(employee.outputInfo());
    }
}
