package ITMO.JavaBasics.Task6.Ex6_5;

public class Child extends Parent{
    @Override
    public void getUserAge() {
        super.getUserAge();
        System.out.println("Введите Ваше имя: ");
        String name = super.scan.next();
        System.out.println("Ваше имя: " + name + " Ваш возраст: " + super.age + " лет");
    }
}
