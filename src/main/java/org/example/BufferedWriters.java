package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.MembersPath.FILE_SOURS;


public class BufferedWriters {

    public static void main(String[] args) {
        String[] lines = {
                "01. Sem; father: Smith; mother: Rita; children: Nikolas, Ron",
                "02. Rita; father: null; mother: Jane; children: Nikolas, Ron",
                "03. John; father: John; mother: Anna; children: Mariana",
                "04. Maria; father: Ben; mother: Elizabeth; children: Mariana",
                "05. Nikolas; father: Sem; mother: null; children: Antony, Paola",
                "06. Mariana; father: John; mother: Maria; children: Antony, Paola",
                "07. Antony; father: Nikolas; mother: Mariana; children: null",
                "08. Paola; father: Nikolas; mother: Mariana; children: null",
                "09. Petr; father: David; mother: Samira; children: null",
                "10. Samira; father: Paul; mother: Rita; children: Petr"
        };

        writeFile(FILE_SOURS + "members-new.txt", lines);
    }

    private static void writeFile(String fileName, String[] lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); // Добавляем перевод строки после каждой записи
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

