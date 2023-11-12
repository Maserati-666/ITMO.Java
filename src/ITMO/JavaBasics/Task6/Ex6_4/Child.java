package ITMO.JavaBasics.Task6.Ex6_4;

public class Child extends Parent {
    public Child() {
    }

    public void output() {
        System.out.println("Переменная из главного класса - " + super.number);
    }
}
