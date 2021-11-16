package com.tw;
import java.util.Scanner;

public class MyClass {
    static boolean isMangoTree(int r,int c,int n){
        if(n<=r){
            return true;
        }
        else if(n%r==0){
            return true;
        }
        else if(n%r==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        boolean IsMango=isMangoTree(r,c,n);
        if(IsMango){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
