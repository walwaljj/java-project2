package com.example.javaproject2.algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Kruskal {
    int[] parent;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());

        //kruskal 알고리즘은 서로소 집합의 개념을 이용해 서로다른 두 접점을
        //연결했을 때 사이클이 발생하는지 안하는지 구분.
        // 배열로 표현한 트리 만들기

        parent = new int[nodeCount];

        for (int i = 0; i < nodeCount; i++) {
            parent[i] = i; //make set과정, 우선 자기 자신을 부모노드로 초기화함.
        }

        //간선정보 해독
        int[][] edges = new int[edgeCount][3]; // {시작, 끝, 가중치}형태로 값을 받기때문에 [3]
        for (int i = 0; i < edgeCount; i++) {
            StringTokenizer edgeSt = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(edgeSt.nextToken());
            edges[i][1] = Integer.parseInt(edgeSt.nextToken());
            edges[i][2] = Integer.parseInt(edgeSt.nextToken());
        }

        // 입력 완료

        //1. 간선들을 가중치 기준에서 정렬함
        Arrays.sort(edges, Comparator.comparingInt(edge -> edge[2]));

        //2. 간선들을 가중치 순서대로 순회하며 고름
        // N01개만 고르더라도 다 끝

        int picked = 0;
        int totalWeight = 0;
        ArrayList<String> pickedEdge = new ArrayList<>();
        for (int i = 0; i < edgeCount; i++) {
            int start = edges[i][0];
            int end = edges[i][1];

            //2-1 start , end를 연결한 간선을 택하면
            // 사이클이 생기지 않았는지 findSet, union
            if(findSet(start) != findSet(end)){ // 서로소라면
                // 두 원소를 하나의 집합으로
                // 간선을 골랐음 표시하기
                union(start, end);
                picked++;
                totalWeight = edges[i][2];
                pickedEdge.add(Arrays.toString(edges[i]));
            }

            //3, 고룬간선이 n-1개가 될때 까지
            if(picked == nodeCount - 1) break;

        }

    }

    // findSet : 내 부모가 나일때 까지 재귀호출
    public int findSet(int node){
        if(parent[node] != node){
            return findSet(parent[node]);
        }else return parent[node];
    }

    // union : y가 속한집합을 x가 속한 집합에 합함 == 합집합
    public void union(int x, int y){
        parent[findSet(y)]= findSet(x); // x 가 y의 집합으로
    }
    public static void main(String[] args) throws IOException {
        new Kruskal().solution();
    }
}
/*
8 11
0 1 41
0 2 14
0 3 13
1 4 27
2 5 21
3 5 33
3 7 22
4 6 11
4 7 17
5 6 35
6 7 19

 */