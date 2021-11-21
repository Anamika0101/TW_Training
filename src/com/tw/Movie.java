package com.tw;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    static Movie[] getPg(Movie movieArr[]){
        Movie newArr[]=new Movie[movieArr.length];
        int count=0;
        for(int i=0;i<movieArr.length;i++){
            if(movieArr[i].rating=="PG"){
                newArr[count++]=movieArr[i];
            }
        }
        return newArr;
    }
    static void printMovie(Movie[] movieArr){
        for(int i=0;i<movieArr.length;i++){
            if(movieArr[i].title.isEmpty()){
                break;
            }
            else {
                System.out.println(movieArr[i].title);
            }
        }
    }

    public static void main(String[] args) {
        Movie movie1=new Movie("ABCMovie","Warner Bros","G");
        Movie movie2=new Movie("BCDMovie","20th Century Fox","PG");
        Movie movie3=new Movie("Casino Royale","EON Productions","PG-13");
        Movie movie4=new Movie("EFGMovie","United Artists","R");
        Movie movie5=new Movie("GHIMovie","Paramount Pictures");
        Movie movie6=new Movie("XYZMovie","Universal Pictures","NC-17");
        Movie movieArr[]={movie1,movie2,movie3,movie4,movie5,movie6};
        Movie arr[]=getPg(movieArr);
        printMovie(arr);
    }
}
