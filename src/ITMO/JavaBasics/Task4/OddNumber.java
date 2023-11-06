package ITMO.JavaBasics.Task4;

// Задача 4.1.1
public class OddNumber {
    private static void input(int oneNumber, int twoNumber) {
        for (int i = oneNumber; i <= twoNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        input(1, 99);
    }
}

