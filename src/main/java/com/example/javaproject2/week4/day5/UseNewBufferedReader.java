package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day5.BufferedReaderInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class UseNewBufferedReader implements BufferedReaderInterface {
    List<String> lines = new LinkedList<>();
    public List<String> getLines(String filePath) throws IOException{
        BufferedReader br = new BufferedReader(Files.newBufferedReader(Paths.get(filePath)));
            String line;
        while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        return lines;
    }
}
