package ITMO.JavaBasics.Task4;

import java.util.Arrays;

public class ReplaceArray {
    private static int[] Replace(int[] array1) {
        System.out.println("Array 1: " + Arrays.toString(array1));
        int numb = array1[0];
        array1[0] = array1[array1.length - 1];
        array1[array1.length - 1] = numb;
        return array1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, -2, 1, 3, 5, 7, 6};
        System.out.println("Array 2: " + Arrays.toString(Replace(array1)));
    }
}
