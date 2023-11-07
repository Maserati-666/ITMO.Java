package ITMO.JavaBasics.Task5;


// Задача 5.5
public class Invertor {
    private static String Invert(String text) {
        String[] split = text.split(" ");
        StringBuilder words = new StringBuilder();
        StringBuilder words1 = new StringBuilder();
        for (int i = 0; i <= split.length - 1; i++) {
            words.append(split[i]);
            if (i == split.length - 1) {
                words1.append(words.reverse());
            } else {
                words1.append(words.reverse()).append(" ");
                words.delete(0, words.length());
            }
        }
        return (words1.toString());
    }

    public static void main(String[] args) {
        System.out.println(Invert("This is a test string"));
    }
}

