package ITMO.JavaBasics.Task4;

import java.util.Arrays;
import java.util.Scanner;

// Задача 4.2.4
public class UniqueNumber {
    private static void UniqueNumb(int[] array) {
        boolean unique = false;
        int number = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (unique){
                number = array[i - 1];
                break;
            }
            for (int j = 0; j <= array.length - 1; j++) {
                if (i != j){
                    if ((array[i] == array[j])) {
                        break;
                    } else if (j == array.length - 1){
                        unique = true;
                    }
                } else if ((i == array.length - 1) & (j == array.length - 1)) {
                    unique = true;
                    number = array[i];
                }
            }
        }
        if (number == 0){
            System.out.println("Уникальных чисел в массиве нет");
        }
        else{
            System.out.println("Первое уникальное число в массиве: " + number);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        UniqueNumb(array);
    }
}
