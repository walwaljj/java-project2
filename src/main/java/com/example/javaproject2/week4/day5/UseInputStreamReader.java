package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day5.BufferedReaderInterface;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class UseInputStreamReader implements BufferedReaderInterface {
    @Override
    public List<String> getLines(String filePath) throws IOException {

        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hospital_info_0920.csv"), "euc-kr"));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
