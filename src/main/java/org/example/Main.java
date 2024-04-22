package org.example;

import java.util.List;

import static org.example.MembersPath.FILE_PATH;
import static org.example.ReadFromFile.readMembersFromFile;


public class Main {

    public static void main(String[] args) {
        List<String> members = readMembersFromFile(FILE_PATH);
        for (String member : members) {
            System.out.println(member);
        }
    }






}
