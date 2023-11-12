package ITMO.JavaBasics.Task6.Ex6_5;

import java.util.Random;
import java.util.Scanner;

public class Parent {
    protected Scanner scan;
    protected int age;

    public void getUserAge(){
        this.scan = new Scanner(System.in);
        System.out.println("Введите Ваш возраст: ");
        age = scan.nextInt();
    }
}
