package ITMO.JavaBasics.Task4;

import java.util.Scanner;

// Задача 4.1.4
public class Check {
    private static void Output(){
        System.out.print("Введите первое число: ");
        Scanner scaner = new Scanner(System.in);
        int oneNumber = scaner.nextInt();
        System.out.print("Введите второе число: ");
        int twoNumber = scaner.nextInt();
        System.out.print("Введите третье число: ");
        int threeNumber = scaner.nextInt();
        System.out.print("Результат: " + Checking(oneNumber, twoNumber, threeNumber));
    }
    private static boolean Checking(int oneNumber, int twoNumber, int threeNumber) {
        if ((twoNumber > oneNumber) && (threeNumber > twoNumber)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Output();
    }
}
