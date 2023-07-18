package com.example.javaproject2.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2252 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        int students = Integer.parseInt(infoToken.nextToken());
        int compares = Integer.parseInt(infoToken.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < students + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < compares; i++) {
            StringTokenizer edgeToken = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(edgeToken.nextToken());
            int end = Integer.parseInt(edgeToken.nextToken());
            adjList.get(start).add(end);
        }

        //인접차수
        int[] inDegrees = new int[students + 1];

        for (List<Integer> neighbors : adjList) {
            for (Integer neighbor : neighbors) {
                inDegrees[neighbor]++;
            }
        }

        //집입차수에 따른 첫 정저
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < students + 1; i++) {
            if (inDegrees[i] == 0) queue.offer(i);
        }

        //Queue 를 이용해 위상정렬
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            result.add(node);
            for (int neighbor : adjList.get(node)) {
                inDegrees[neighbor]--;
                if (inDegrees[neighbor] == 0) queue.offer(neighbor);
            }
        }

    }

}
