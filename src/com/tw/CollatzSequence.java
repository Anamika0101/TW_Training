package com.tw;
import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.print(n+" ");
            }
            else{
                n=(3*n)+1;
                System.out.print(n+" ");
            }
            count++;
        }
        System.out.print(count);
    }
}
