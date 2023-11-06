package ITMO.JavaBasics.Task4;

import java.util.Scanner;

// Задача 4.1.3
public class Summa {
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
        boolean bool = oneNumber + twoNumber == threeNumber;
        return bool;
    }



    public static void main(String[] args) {
        Output();
    }
}
