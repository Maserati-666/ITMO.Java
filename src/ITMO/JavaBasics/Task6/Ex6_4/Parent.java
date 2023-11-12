package ITMO.JavaBasics.Task6.Ex6_4;

import java.util.Scanner;

public class Parent {
    public int number;

    public Parent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scan.nextInt();
        this.number = number;
    }
}

