package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadReader3 {

    private Hospital parse(String str){
        String[] split = str.split(",");
        Address address = new Address(split[10],split[5],split[7]);
        Hospital hospital = new Hospital(split[1],split[11],address);
        return hospital;
    }

    public List<Hospital> getHospital(List<String> lines)throws IOException {
        List<Hospital> list = new ArrayList<>();

        for (String line : lines) {
            list.add(parse(line));
        }

        return list;
    }
    public List<String> getLines(String fileName)throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = br.readLine()) != null){
            lines.add(str);
        }

        // 이렇게 하면 null임..
//        while (br.readLine() != null){
//            lines.add(br.readLine());
//        }


        return lines;
    }
    public static void main(String[] args) throws IOException {

        ReadReader3 rr = new ReadReader3();
        String fileName = "hospital_info.csv";
        List<String> lines = rr.getLines(fileName);
        List<Hospital> hospitalList = rr.getHospital(lines);

//        for (int i = 0; i < 30; i++) {
//            Hospital hospital = hospitalList.get(i);
//            System.out.printf("%s %s\n",hospital.getName(),hospital.getMobileAddress());
//        }
        int count = 0;
        for (Hospital hospital : hospitalList) {
            count++;
            if (count == 20) {
                break;
            }
            System.out.println(hospital.getName()+" : "+hospital.getMobileAddress());
        }

    }
}
