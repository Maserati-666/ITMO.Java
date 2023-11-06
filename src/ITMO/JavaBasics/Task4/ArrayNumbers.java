package ITMO.JavaBasics.Task4;

//Задача 4.1.6
public class ArrayNumbers {
    private static boolean checkNumber(int[] array, int Number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Number) {
                return true;
            }
        }
    return false;
    }

    private static void checking(int[] array, int oneNumber, int twoNumber) {
        boolean number1 = checkNumber(array, oneNumber);
        boolean number2 = checkNumber(array, twoNumber);
        if (number1 & number2) {
            System.out.print("Массив содержит число " + oneNumber + " и число " + twoNumber);
        } else if (number1) {
            System.out.print("Массив содержит число " + oneNumber);
        } else if (number2) {
            System.out.print("Массив содержит число " + twoNumber);
        }
        else{
            System.out.print("Массив не содержит чисел "+ oneNumber + " и " + twoNumber);
        }

    }

    public static void main(String[] args) {
        int[] array = {3, -3, 1, 4, 5, 4, 3};
        checking(array, 1, 3);
    }
}
