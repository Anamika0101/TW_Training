package com.tw;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]-arr[0]);
    }
}
