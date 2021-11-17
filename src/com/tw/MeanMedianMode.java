package com.tw;
import java.util.*;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        double mean,median,mode=0,sum=0,count,maxCount=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //Median
        if(size%2==0){
            median=arr[size/2];
        }
        else {
            median = arr[size / 2 + 1];
        }

        //Mean
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        mean=sum/size;

        //Mode
        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        //Print
        System.out.println("Mean= "+String.format("%.2f",mean)+"\nMedian= "+String.format("%.2f",median)+"\nMode= "+String.format("%.2f",mode));
    }
}
