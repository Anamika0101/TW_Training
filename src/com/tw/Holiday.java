package com.tw;

public class Holiday {
    private final String name;
    private final int day;
    private final String month;

    Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    boolean inSameMonth(Holiday h1){
        if(this.month.equals(h1.month)){
            return true;
        }
        return false;
    }

    static double avgDate(Holiday[]arr){
        int sum=0;
        for (Holiday holiday : arr) {
            sum += holiday.day;
        }
        return (double)sum/arr.length;
    }

    public static void main(String [] args){
        Holiday h1=new Holiday("Independence day",4,"July");
        Holiday h2=new Holiday("Diwali",5,"November");
        Holiday h3=new Holiday("Diwali",19,"November");
        System.out.println("Holiday1 and Holiday2 are in same month? "+h1.inSameMonth(h2));
        System.out.println("Holiday2 and Holiday3 are in same month? "+h2.inSameMonth(h3));
        Holiday[] arr={h1,h2,h3};
        System.out.println("Average date= "+avgDate(arr));
    }
}
