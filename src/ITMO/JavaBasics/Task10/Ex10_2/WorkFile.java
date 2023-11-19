package ITMO.JavaBasics.Task10.Ex10_2;

import java.io.*;

public class WorkFile {
    public void save(String strings, String path) {
        File file = new File(path);
        OutputStream os;
        try {
            os = new FileOutputStream(file, true);
            os.write((strings + "\r").getBytes());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
