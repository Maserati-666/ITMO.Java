package ITMO.JavaBasics.Task10.Ex10_4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Text {
    // метод для создание нового файла с изменениями
    public void textReplace(String path1, String path2) {
        File file = new File(path1);
        File file1 = new File(path2);
        replace(file, file1);
    }

    // метод для обновления выбранного файла
    public void textReplace(String path1) {
        File file = new File(path1);
        File file1 = new File(path1 + "new");
        replace(file, file1);
        Path path2 = Path.of(path1 + "new");
        Path path3 = Path.of(path1);
        try {
            file.delete();
            Files.move(path2, path3);
            System.out.println("Файл успешно обновлен");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Вспомогательный метод
    public void replace(File file, File file1){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
                String input;
                while ((input = reader.readLine()) != null) {
                    writer.write(input.replaceAll("[^0-9a-zA-Zа-яА-Я]", "\\$") + "\n");
                }
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
