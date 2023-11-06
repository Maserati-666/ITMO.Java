package ITMO.JavaBasics.Task4;

// Задача 4.1.2
public class DivisorNumber {
    private static void Input(int oneNumber, int twoNumber) {
        System.out.print("Делится нацело на " + oneNumber + ": ");
        for (int i = 1; i <= 100; i++) {
            if (i % oneNumber == 0) {
                System.out.print(i);
                if (i + oneNumber <= 100) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nДелится нацело на " + twoNumber + ": ");
        for (int i = 1; i <= 100; i++) {
            if (i % twoNumber == 0) {
                System.out.print(i);
                if (i + twoNumber <= 100) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\nДелится нацело на " + +oneNumber + " и " + twoNumber + ": ");
        int comDivisor;
        if (Math.max(oneNumber, twoNumber) % Math.min(oneNumber, twoNumber) == 0) {
            comDivisor = Math.max(oneNumber, twoNumber);
        } else {
            comDivisor = oneNumber * twoNumber;
        }
        for (int i = 1; i <= 100; i++) {
            if (i % comDivisor == 0) {
                System.out.print(i);
                if (i + comDivisor <= 100) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Input(3, 5);
    }
}
