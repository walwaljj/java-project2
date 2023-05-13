package com.example.javaproject2.week4.day5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadReader {
//    LineReader lineReader;
    Charset charset;

    public ReadReader(Charset charset) {
        this.charset = charset;
    }

    public Hospital parse(String str){

        String[] split = str.split(",");
        Address address = new Address(split[10],split[5],split[7]);
        Hospital hospital = new Hospital(split[1],split[11],address);

        return hospital;
    }
    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));

        }
        return hospitals;
    }
    private List<String> getLines(String fileName) throws IOException {

        List<String> lines = new LinkedList<>();

        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {

        ReadReader readReader = new ReadReader(Charset.forName("UTF-8"));
        String fileName = "hospital_info.csv";
        List<String> result = readReader.getLines(fileName);
        List<Hospital> parsedHospital = readReader.getHospitals(result);
        System.out.println(parsedHospital.get(0));
        for (int i = 0; i < 30; i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s\n",hospital.getName(),hospital.getMobileAddress());
        }
    }

}
