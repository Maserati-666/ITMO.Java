package ITMO.JavaBasics.Task10.Ex10_1;

public class Main {
    public static void main(String[] args) {
        WorkFile file = new WorkFile();
        System.out.println(file.read("files/text.txt"));
    }
}
