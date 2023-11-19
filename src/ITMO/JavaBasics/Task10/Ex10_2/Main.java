package ITMO.JavaBasics.Task10.Ex10_2;


public class Main {
    public static void main(String[] args) {
        WorkFile file = new WorkFile();
        file.save("kzkgrk", "files/output.txt");
        file.save(" kzkgrk  ggmmymym", "files/output.txt");
        file.save(" rhhhnmmm ghjymym", "files/output.txt");
    }
}
