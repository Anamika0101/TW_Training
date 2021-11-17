package com.tw;
import java.util.Scanner;

public class getWeeklySalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int sal=0,sum=0,sunSal,satSal;
        for(int i=1;i<6;i++){
            if(arr[i]<=8){
                sal=sal+arr[i]*100;
            }
            else{
                sal+=arr[i]*100+(arr[i]-8)*15;
            }
            sum+=arr[i];
        }
        if(sum>40){
            sal+=(sum-40)*25;
        }
        sunSal=arr[0]*100;
        sunSal=(sunSal*150)/100;
        satSal=arr[6]*100;
        satSal=(satSal*125)/100;
        sal+=satSal+sunSal;
        System.out.println(sal);
    }
}
