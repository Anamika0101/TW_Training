package com.tw;
import java.util.Scanner;

public class TypeOfArray {
    static int arrayType(int arr[], int n){
        int countEven=0,countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        if(countEven==n){
            return 1;
        }
        else if(countOdd==n){
            return 2;
        }
        return 3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=arrayType(arr,n);
        if(x==1){
            System.out.println("EVEN");
        }
        else if(x==2){
            System.out.println("ODD");
        }
        else if(x==3){
            System.out.println("MIXED");
        }
    }
}
