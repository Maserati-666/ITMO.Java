package ITMO.JavaBasics.Task3;

public class Car {

    private String color;
    private String name;
    private int weight;

    public Car(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }
    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public String CarOutput() {
        return  "Name = " + this.name + " ," +
                "Color = " + this.color + " ," +
                "Weight = " + this.weight;
    }
}

class JavaProg {
    public static void main(String[] args) {
       Car carOne = new Car("Black", "BMW", 2250);
       Car carTwo = new Car("White", "Chery", 1350);
       System.out.println(carOne.CarOutput());
       System.out.println(carTwo.CarOutput());

    }
}
