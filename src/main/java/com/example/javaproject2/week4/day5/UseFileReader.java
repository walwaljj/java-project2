package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day5.BufferedReaderInterface;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class UseFileReader implements BufferedReaderInterface {

    public List<String> getLines(String filePath) throws IOException {

        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
