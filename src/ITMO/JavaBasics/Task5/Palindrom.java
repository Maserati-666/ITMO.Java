package ITMO.JavaBasics.Task5;
//Задача 5.2
public class Palindrom {
    private static boolean palindr(String word) {
        StringBuilder builder = new StringBuilder(word.toLowerCase());
        String word1 = builder.reverse().toString();
        return word.toLowerCase().equals(word1);
    }

    public static void main(String[] args) {
        String word = "Топот";
        System.out.println(palindr(word));
    }
}
