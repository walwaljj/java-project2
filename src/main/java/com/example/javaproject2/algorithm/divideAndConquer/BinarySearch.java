package com.example.javaproject2.algorithm.divideAndConquer;

public class BinarySearch {
    public int binarySearch (int [] arr, int target){

        // 검색 범위를 한정하는 left 와 right
        int left = 0;
        int right = arr.length - 1;

        //왼쪽 index 가 오른쪽 index 보다 커미면 발견 실패
        while (left <= right){
            //현재 가운데 원소를 검색 대상과 비교
            int mid = left + (right - left) / 2;

            //가운데에서 발견 : 검색 성공
            if(arr[mid] == target)
                return mid;

            // 타겟 숫자보다 현재 숫자가 작다면
            // mid 기준 오른쪽 구간을 대상으로 선정
            else if(arr[mid] < target)
                left = mid + 1;

            // 타겟 숫자보다 현재 숫자가 크면
            // mid 기준 왼쪽 구간을 대상으로 선정함.
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;
        int index = new BinarySearch().binarySearch(arr, target);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("탐색 실패");
        }
    }
}
