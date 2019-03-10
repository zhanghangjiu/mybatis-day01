package com.zhj.domain;

public class dd {
    public static void main(String[] args) {
      for(int i = 0;i<=3;i++){
          for(int j =0;j<=3-i;j++){
              System.out.print(" ");
          }
          for (int k = 1;k<=i*2+1;k++){
              System.out.print("*");
          }
          System.out.println();

      }
    }
}
