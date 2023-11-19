package ITMO.JavaBasics.Task10.Ex10_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkFile {
    public List<String> read(String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        String input;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }
            return list;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return list;
        }
    }

}
