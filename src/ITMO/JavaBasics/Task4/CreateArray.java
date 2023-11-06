package ITMO.JavaBasics.Task4;
// Задача 4.2.2
import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    private static void CreateArr() {
        System.out.print("Array length: ");
        Scanner scaner = new Scanner(System.in);
        int lengthArray = scaner.nextInt();
        int[] array = new int[lengthArray];
        System.out.println("Numbers of array: ");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scaner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        CreateArr();
    }
}
