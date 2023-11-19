package ITMO.JavaBasics.Task10.Ex10_4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Text file = new Text();
        file.textReplace("files/text1.txt", "files/output1.txt");
        file.textReplace("files/text2.txt");
    }
}
