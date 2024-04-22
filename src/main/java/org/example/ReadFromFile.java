package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public static List<String> readMembersFromFile(String FILE_PATH) {

        List<String> members = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String formattedMember = formatMember(line);
                members.add(formattedMember);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
    }

    private static String formatMember(String line) {
        // Разбиваем строку по символу ";"
        String[] parts = line.split(";");
        // Получаем id и имя
        String idAndName = parts[0].trim();
        // Получаем информацию о родителях
        String parents = parts[1].trim() + " " + parts[2].trim();
        // Получаем информацию о детях
        String children = parts.length > 3 ? parts[3].trim() : "";
        // Форматируем и возвращаем строку
        return idAndName + "; parents: " + parents + "; " + children;
    }

}
