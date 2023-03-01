import java.util.Scanner;

public class Movies implements Findable {
    @Override
    public void getAllMovies(Movie[] movies) {

        for (Movie movie1 : movies) {
            System.out.println(movie1.toString());
        }
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        String b = new Scanner(System.in).nextLine();
        for (Movie movie2 : movies) {
            if (movie2.getName().toUpperCase().equals(b)) {
                System.out.println(movie2.toString());
            }

        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        String v = new Scanner(System.in).nextLine();
        for (Movie movie3 : movies) {
            for (Cast cast1 : movie3.getCasts()) {
                if (cast1.getActorFullName().toUpperCase().equals(v)) {
                    System.out.println(cast1.toString());
                }
            }
        }
    }


    @Override
    public void findMovieByActorYear(Movie[] movies) {
        int v = new Scanner(System.in).nextInt();
        for (Movie movie4 : movies) {
            if (movie4.getYear() == v) {
                System.out.println(movie4.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        String s = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie5 : movies) {
            if (movie5.getDirector().getName().toUpperCase().equals(s)) {
                System.out.println(movie5.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        String d = new Scanner(System.in).nextLine();
        for (Movie movie6 : movies) {
            if (movie6.getDescription().toUpperCase().equals(d)) {
                System.out.println(movie6.toString());
            }
        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        String f = new Scanner(System.in).nextLine();
        for (Movie movie7 : movies) {
            for (Cast cast : movie7.getCasts()) {
                if (cast.getRole().toUpperCase().equals(f)) {
                    System.out.println(cast.toString());
                }
            }
        }
    }


}