package com.example.javaproject2.week4.day5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class ReadReader2 {
    BufferedReaderInterface bri;
    Charset charset;
    public ReadReader2(BufferedReaderInterface bri, Charset charset) {
        this.bri = bri;
        this.charset = charset;
    }

    public static void main(String[] args) throws IOException {

        ReadReader2 readReader = new ReadReader2(new UseFileReader(),Charset.forName("UTF-8"));
        List<String> lines = readReader.bri.getLines("hospital_info.csv");
//        System.out.println(lines.get(0));
        for (String line : lines) {
            System.out.println(line);
        }

    }
}
