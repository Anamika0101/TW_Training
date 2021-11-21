package com.tw;

class HolidayClass {
    private String name;
    private int day;
    private String month;
    HolidayClass(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    boolean inSameMonth(HolidayClass h1){
        if(this.month.equals(h1.month)){
            return true;
        }
        return false;
    }

    static double avgDate(HolidayClass[]arr){
        int sum=0;
        double avg;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i].day;
        }
        avg=sum/arr.length;
        return avg;
    }


}

class MainClass {
    public static void main(String args[]){
        HolidayClass h1=new HolidayClass("Independence day",4,"July");
        HolidayClass h2=new HolidayClass("Diwali",5,"November");
        HolidayClass h3=new HolidayClass("Gurunanak Jayanti",19,"November");
        System.out.println("holiday 1 and holiday 2 are in same month? "+h1.inSameMonth(h2));
        System.out.println("holiday 2 and holiday 3 are in same month? "+h2.inSameMonth(h3));
        HolidayClass[]arr={h1,h2,h3};
        System.out.println("Average date="+ com.tw.HolidayClass.avgDate(arr));
    }
}
