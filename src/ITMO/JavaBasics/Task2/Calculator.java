package ITMO.JavaBasics.Task2;

public class Calculator {

    //==============МЕТОД СУММА===============

    static long sum(int x, int y) {
        return (long) (x) + (long) (y);
    }

    static long sum(long x, long y) {
        return (x + y);
    }

    static double sum(double x, double y) {
        return (x + y);
    }
    //==========================================

    //==============МЕТОД Вычитание===============
    static long dif(int x, int y) {
        return (long) (x) + (long) (y);
    }

    static long dif(long x, long y) {
        return (x - y);
    }

    static double dif(double x, double y) {
        return (x - y);
    }
    //==========================================

    //==============МЕТОД Деление===============
    static double div(int x, int y) {
        return (double) (x) / (double) (y);
    }

    static double div(long x, long y) {
        return (double) (x) / (double) (y);
    }

    static double div(double x, double y) {
        return (x / y);
    }
    //==========================================

    //==============МЕТОД Умножение===============

    static long multip(int x, int y) {
        return (long) (x) * (long) (y);
    }

    static long multip(long x, long y) {
        return (x * y);
    }

    static double multip(double x, double y) {
        return (x * y);
    }


}
