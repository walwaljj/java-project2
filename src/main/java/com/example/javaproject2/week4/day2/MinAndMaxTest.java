package com.example.javaproject2.week4.day2;

abstract class IsMinOrMax {
   public abstract boolean isMinOrMax(int num1, int num2);
   public int result(int[] arr){
      int result = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if(isMinOrMax(result , arr[i])) result = arr[i];
      }
      return result;
   }
}
class MaxNum extends IsMinOrMax{
   @Override
   public boolean isMinOrMax(int maxNum, int num) {
      return maxNum < num;
   }
}
class MinNum extends IsMinOrMax{
   @Override
   public boolean isMinOrMax(int minNum, int num) {
      return minNum > num ;
   }
}
public class MinAndMaxTest{
   public static void main(String[] args) {
      IsMinOrMax max = new MaxNum();
      IsMinOrMax min = new MinNum();

      int[] arr = {5, 6, 8, 1, 3};

      System.out.printf("%d %d",max.result(arr),min.result(arr));

   }
}

