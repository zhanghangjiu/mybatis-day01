package com.zhj.domain;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

public class dd1 {
    public static void main(String[] args) {
        for(int i = 0;i<=3;i++){
           for(int j = 0;j<=3-i;j++){
               System.out.print(" ");
           }
           for(int k =1;k<=1+i*2;k++){
               System.out.print("*");
           }
            System.out.println();
        }

        for(int i = 0;i<=2;i++){
            for(int j =0;j<=1+i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5-2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
