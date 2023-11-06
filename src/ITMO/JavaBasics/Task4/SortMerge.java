package ITMO.JavaBasics.Task4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortMerge {

    public static void main(String[] args) {
        int[] array = CreateArr(13);
        System.out.println(Arrays.toString(array));
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] CreateArr(int lengthArray) {
        int[] array = new int[lengthArray];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i]  = (int)(100 * Math.random());
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);

    }

    public static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }

}
