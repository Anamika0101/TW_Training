package com.tw;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
//        int labX=x-n;
//        int labY=y-n;
//        int labZ=z-n;
//        if(n>x && n>y && n>z){
//            System.out.println("No labs present for "+n+" number of students.");
//        }
//        else if (labX <= labY && labX <= labZ)
//            System.out.println( "Lab no: 1");
//
//        else if (labY <= labX && labY <= labZ)
//            System.out.println( "Lab no: 2");
//
//        else if(labZ<=labY && labZ<=labX)
//            System.out.println( "Lab no: 3");

        if(n<=x){
            if(y<=x && n<=y ){
                if(z<=y && n<=z){
                    System.out.println("Lab no:3");
                }
                else
                    System.out.println("Lab no:2");
            }
            else if(z<=x && z>=n){
                System.out.println("Lab no:3");
            }
            else
                System.out.println("Lab no:1");
        }
        else if(n<=y){
            if(z<=y && z>=n){
                System.out.println("Lab no:3");
            }
            else
            System.out.println("Lab no: 2");
        }
        else if(n<=z){
            System.out.println("Lab no: 3");
        }
        else{
            System.out.println("No labs present for "+n+" number of students.");
        }
    }
}
