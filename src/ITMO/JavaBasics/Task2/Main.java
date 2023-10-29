package ITMO.JavaBasics.Task2;

import java.lang.System.*;
import java.io.PrintStream.*;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {
        int a = 2000000000;
        int b = 2000000;
        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.sum(2000000000, 2000000000));
        System.out.println(Calculator.sum(214748364752L, 5));
        System.out.println(Calculator.sum(214748364752L, 5.5));
        System.out.println(Calculator.sum(214748364752d, 5.5));
        System.out.println(Calculator.dif(214748364752L, 5.5));
        System.out.println(Calculator.dif(21000000000000L, 1L));
        System.out.println(Calculator.div(1234567891, 5));
        System.out.println(Calculator.div(123456789100L, 5));
        System.out.println(Calculator.div(21.5, 7.2));
        System.out.println(Calculator.multip(20000000000L, 7));
        System.out.println(Calculator.multip(2, 7));
        System.out.println(Calculator.multip(2.0, 7.0));


        Book book = new Book();
        book.setTitle("Евгений Онегин");
        book.setAuthor("Пушкин А.С.");
        book.setPublishingCompany("Золотая стрела");
        book.setYearPublication(0);
        book.setPrice(-2);
        System.out.println(book);


    }
}
