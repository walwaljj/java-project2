package com.example.javaproject2.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        //첫 입력은 정점의 갯수
        int maxNodes = Integer.parseInt(reader.readLine());

        int[][] edgeMap = new int[maxNodes + 1][maxNodes + 1];

        // 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
        String[] edges = reader.readLine().split(" ");
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);
            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;


        }

        //다음에 방문할 점을 담아두는 스택
        Stack<Integer> toVisit = new Stack<>();

        //방무을 기록하는 용도의 배열
        boolean[] visited = new boolean[maxNodes + 1];

        //----dfs
        List<Integer> visitedOrder = new ArrayList<>();

        //첫번째 방문 대상 선정(1)
        int next = 1;

        //대상을 스택에 push
        toVisit.push(next);

        //스택이 비어있을 때 까지 반복하는 while
        while (!toVisit.empty()){
            // 다음 방문할 곳을 가져오기 .
            next = toVisit.pop();
            // 이미 방문 했다면 다음곳으로 가기 -> pop()
            if(visited[next]) continue;;
            // 방문 표시하기
            visited[next] = false;
            visitedOrder.add(next);
            // 다음 방문 대상 검색 후 스택에 push
            for (int i = maxNodes ; i > 0 ; i-- ) {
                // 해당 정점에 도달할 수 있고, 아직 방문하지 않았다면
                if(edgeMap[next][i] == 1 && !visited[i]) toVisit.push(i);
                // 스택에 푸시하기
            }
        }
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new DepthFirstSearch().solution();
    }
}
