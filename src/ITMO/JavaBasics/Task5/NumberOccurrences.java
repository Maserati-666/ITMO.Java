package ITMO.JavaBasics.Task5;
// Задача 5.4
public class NumberOccurrences {

    private static int NumberOccur(String str1, String str2){
        int number = (str1.length() - str1.replace(str2, "").length())/(str2.length());
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Число вхождений равно: " + NumberOccur("12312", "12"));
    }
}
