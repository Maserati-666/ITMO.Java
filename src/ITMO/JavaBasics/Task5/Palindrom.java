package ITMO.JavaBasics.Task5;
//Задача 5.2
public class Palindrom {
    private static boolean Palindr(String word) {
        StringBuilder builder = new StringBuilder(word);
        String word1 = builder.reverse().toString();
        if (word.equals(word1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word = "арозаупаланалапуазора";
        System.out.println(Palindr(word));
    }
}
