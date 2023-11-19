package ITMO.JavaBasics.Task10.Ex10_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkFiles {

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

    public void Rewrite(String path1, String path2){
        WorkFiles file = new WorkFiles();
        List<String> list = file.read(path2);
        for (String string : list){
            file.save(string, path1);
        }
    }
    public void Rewrites(String path1, String path2, String path3){
        WorkFiles file = new WorkFiles();
        file.Rewrite(path3, path1);
        file.Rewrite(path3, path2);
    }

}
