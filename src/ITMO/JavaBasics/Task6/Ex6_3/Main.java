package ITMO.JavaBasics.Task6.Ex6_3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(10000, "Scania", (char) 51104, 150.0f, 35000, 6);
        truck.outPut();
        truck.newWheels(8);
        System.out.println("============================");
        truck.outPut();
    }
}
