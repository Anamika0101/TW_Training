package com.tw;
import java.util.Scanner;

public class MagicSquare {
    static boolean isMagicSquare(int rc, int[][] arr){
        int sum=0,sumNew;
        for(int i=0;i<1;i++){
            for(int j=0;j<rc;j++){
                sum+=arr[i][j];
            }
        }
        for(int i=0;i<rc;i++){
            sumNew=0;
            for(int j=0;j<rc;j++){
                sumNew+=arr[i][j];
            }
            if(sum!=sumNew){
                return false;
            }
        }
        for(int i=0;i<rc;i++){
            sumNew=0;
            for(int j=0;j<rc;j++){
                sumNew+=arr[j][i];
            }
            if(sum!=sumNew){
                return false;
            }
        }
        sumNew=0;
        for(int i=0;i<rc;i++){
            sumNew+=arr[i][i];
        }
        if(sum!=sumNew){
            return false;
        }
        sumNew=0;
        for(int i=0;i<rc;i++){
            sumNew+=arr[i][rc-i-1];
        }
        if(sumNew != sum){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int[][] arr =new int[rc][rc];
        for(int i=0;i<rc;i++){
            for(int j=0;j<rc;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(isMagicSquare(rc, arr)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
