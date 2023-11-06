package ITMO.JavaBasics.Task4;

//Задача 4.1.5
public class ArrayNumber {
    private static boolean Checking(int[] array, int number) {
        System.out.print("array = ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < (array.length - 1)){
                System.out.print(", ");
            }
        }
        System.out.println();
        if ((array[0] == number) | (array[(array.length - 1)] == number)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] array = {5, -3, 7, 4, 5, 4, 1};
        System.out.print(Checking(array, 5));
    }
}
