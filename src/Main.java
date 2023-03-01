import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Director director1=new Director("Gerri ","Skott");
        Director director2=new Director("James","Kemeron");
        Director director3=new Director("Catherine","Hardwicke");


        Cast[] cast1={new Cast("Vin Dizel","main role1")};
        Cast[] cast2={new Cast("Sem Ourtington","main role2")};
        Cast[] cast3={new Cast("Kristen Stewart","main role3")};


        Movie movie1=new Movie("Fast &Furious",2001,"action movie",director1,cast1);
        Movie movie2=new Movie("Avatar",2009,"Franshiza",director2,cast2);
        Movie movie3=new Movie("Sumerki",2008,"romans fantasy",director3,cast3);

        Movie[] movies={movie1,movie2,movie3};
        int search=new Scanner(System.in).nextInt();

        Movies movies1=new Movies();
       switch (search){
           case 1->movies1.getAllMovies(movies);
           case 2->movies1.findMovieByName(movies);
           case 3->movies1.findMovieByActorName(movies);
           case 4->movies1.findMovieByActorYear(movies);
           case 5->movies1.findMovieByDirector(movies);
           case 6->movies1.findMovieByDescription(movies);
           case 7->movies1.findMovieByRole(movies);
       }



















    }
}