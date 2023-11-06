package ITMO.JavaBasics.Task4;

// Задача 4.1.1
public class OddNumber {
    private static void Input(int oneNumber, int twoNumber) {
        int some;
        if (oneNumber % 2 != 0) {
            some = 0;
        } else {
            some = 1;
        }
        for (int i = oneNumber + some; i <= twoNumber; ) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void main(String[] args) {

        Input(1, 99);
    }
}

