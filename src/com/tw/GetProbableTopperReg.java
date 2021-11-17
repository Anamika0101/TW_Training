package com.tw;
import java.util.Scanner;

public class GetProbableTopperReg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long regNum=sc.nextLong();
        int sumEven=0,sumOdd=0;
        long rem;

        while(regNum>0){
            rem=regNum%10;
            System.out.println(rem);
            if(rem%2==0){
                sumEven+=rem;
            }
            else{
                sumOdd+=rem;
            }
            regNum=regNum/10;
        }
        if(sumEven==sumOdd){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
