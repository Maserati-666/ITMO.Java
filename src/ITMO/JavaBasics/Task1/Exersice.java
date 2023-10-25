package ITMO.JavaBasics.Task1;
import java.util.Scanner;

public class Exersice {
    public static void main(String args[])
    {
        // Задача №1
        System.out.println("Задача №1");
        System.out.println("Я\nхорошо\nзнаю\nJava.\n");

        // Задача №2
        System.out.println("Задача №2");
        double a = (46 + 10) * (10 / 3d);
        int w = 29 * 4 * -15;
        System.out.println("(46 + 10) * (10 / 3) = " + a);
        System.out.println("(29) * (4) * (-15) = " + w + "\n");

        // Задача №3
        System.out.println("Задача №3");
        int number = 3;
        double result = (number / 10d) / 10;
        System.out.println("(number / 10) / 10 = " + result + "\n");

        // Задача №4
        System.out.println("Задача №4");
        result = 3.6 * 4.1 * 5.9;
        System.out.println("3.6 * 4.1 * 5.9 = " + result + "\n");

        // Задача №5
        System.out.println("Задача №5");
        Scanner scaner = new Scanner(System.in);
        int c = scaner.nextInt();
        int d = scaner.nextInt();
        int e = scaner.nextInt();
        System.out.println(c + "\n" + d + "\n" + e + "\n");

        // Задача №6
        System.out.println("Задача №6");
        System.out.println("Введите число: ");
        c = scaner.nextInt();
        if (c % 2 != 0)
        {
            System.out.println("Нечетное");
        }else if (c > 100) {
            System.out.println("Выход за пределы диапазона");
        }else
        {
            System.out.println("Четное");
        }


    }

}
