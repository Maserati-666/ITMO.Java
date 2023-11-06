package ITMO.JavaBasics.Task4;

//Задача 4.1.6
public class ArrayNumbers {
    private static void Checking(int[] array, int oneNumber, int twoNumber) {
        boolean number1 = false;
        boolean number2 = false;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(number1 + " " + number2 + " " +(number1 & number2));
            if ((number1 & number2)) {
                break;
            } else if (array[i] == oneNumber) {
                number1 = true;
            } else if (array[i] == twoNumber) {
                number2 = true;
            }
        }
        if (number1 & number2 == true) {
            System.out.print("Массив содержит число " + oneNumber + " и число " + twoNumber);
        } else if (number1 == true) {
            System.out.print("Массив содержит число " + oneNumber);
        } else if (number2 == true) {
            System.out.print("Массив содержит число " + twoNumber);
        }
        else{
            System.out.print("Массив не содержит чисел "+ oneNumber + " и " + twoNumber);
        }

    }

    public static void main(String[] args) {
        int[] array = {3, -3, 1, 4, 5, 4, 3};
        Checking(array, 1, 3);
    }
}
