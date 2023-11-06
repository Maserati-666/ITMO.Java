package ITMO.JavaBasics.Task4;
// Задача 4.2.1
public class SortArray {
    private static void Checking(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
           if (array[i + 1] < array[i])
           {
               System.out.println("Please, try again");
               break;
           } else if (i == array.length - 2) {
               System.out.println("ОК");
           }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 1, 3, 5, 7, 6};
        Checking(array);
    }
}
