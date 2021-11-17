package com.tw;
import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j>i && j<n;j++){
                if(arr[i][j]==0){
                    System.out.println("NO");
                    System.exit(0);
                }

            }
        }
        System.out.println("YES");
    }
}
