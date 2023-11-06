package ITMO.JavaBasics.Task4;

// Задача 4.1.2
public class DivisorNumber {

    private static void divNumber(int Number) {
        for (int i = 1; i <= 100; i++) {
            if (i % Number == 0) {
                System.out.print(i);
                if (i + Number <= 100) {
                    System.out.print(", ");
                }
            }
        }
    }

    private static void divTwoNumbers(int oneNumber, int twoNumber) {
        int comDivisor;
        if (Math.max(oneNumber, twoNumber) % Math.min(oneNumber, twoNumber) == 0) {
            comDivisor = Math.max(oneNumber, twoNumber);
        } else {
            comDivisor = oneNumber * twoNumber;
        }
        divNumber(comDivisor);
    }

    private static void input(int oneNumber, int twoNumber) {
        System.out.print("Делится нацело на " + oneNumber + ": ");
        divNumber(oneNumber);
        System.out.print("\nДелится нацело на " + twoNumber + ": ");
        divNumber(twoNumber);
        System.out.print("\nДелится нацело на " + +oneNumber + " и " + twoNumber + ": ");
        divTwoNumbers(oneNumber, twoNumber);
    }

    public static void main(String[] args) {
        input(3, 5);
    }
}
