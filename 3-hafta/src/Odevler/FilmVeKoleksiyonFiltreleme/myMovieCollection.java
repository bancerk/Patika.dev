package Odevler.FilmVeKoleksiyonFiltreleme;

import java.util.*;

public class myMovieCollection {

    public static void main (String[] args) {

        // Film nesneleri oluşturuluyor
        Film lotr = new Film("The Lord of the Rings: The Return of the King", 2003, "Fantasy", 9.0);
        Film dnd = new Film("Dungeons & Dragons: Honor Among Thieves", 2023, "Fantasy", 7.2);
        Film ghostinShell = new Film("Ghost in the Shell", 1995, "Cyberpunk", 7.9);
        Film constantine = new Film("Constantine", 2005, "Supernatural", 7.0);
        Film lifeb = new Film("Life is Beautiful", 1997, "Tragedy", 8.6);

        // Film listesini tutacak bir ArrayList oluşturuluyor
        List<Film> myMovies = new ArrayList<>(5);

        // Filmler listeye ekleniyor
        myMovies.add(lotr);
        myMovies.add(dnd);
        myMovies.add(ghostinShell);
        myMovies.add(constantine);
        myMovies.add(lifeb);

        // Filmleri çıkış yılına göre sıralıyoruz
        sortByReleaseYear(myMovies);
        System.out.println(myMovies);

        // Filmleri IMDb puanına göre sıralıyoruz
        sortByImdbScore(myMovies);
        System.out.println(myMovies);

        // Filmleri türleriyle birlikte HashMap'e koyuyoruz
        Map<Film, String> mapMyMovies = new HashMap<>();

        mapMyMovies.put(lotr, lotr.getMovGenre());
        mapMyMovies.put(dnd, dnd.getMovGenre());
        mapMyMovies.put(ghostinShell, ghostinShell.getMovGenre());
        mapMyMovies.put(constantine, constantine.getMovGenre());
        mapMyMovies.put(lifeb, lifeb.getMovGenre());

        // Map'in içeriğini yazdırıyoruz
        System.out.println(mapMyMovies);

        // Belirli bir türe göre filmleri filtreliyoruz
        filterByGenre(myMovies, "Cyberpunk");
    }

    // IMDb puanına göre azalan sıralama yapan metot
    private static void sortByImdbScore(List<Film> myMovies) {
        Collections.sort(myMovies, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                if (f2.getImdbScore() > f1.getImdbScore()) {
                    return 1;
                } else if (f2.getImdbScore() == f1.getImdbScore()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    // Çıkış yılına göre artan sıralama yapan metot
    private static void sortByReleaseYear(List<Film> myMovies) {
        Collections.sort(myMovies, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return f1.getReleaseYear() - f2.getReleaseYear();
            }
        });
    }

    // Belirli bir türdeki filmleri listeleyen metot
    private static void filterByGenre(List<Film> myMovies, String movGenre) {
        System.out.println("Movies with genre: " + movGenre);
        for (Film movie : myMovies) {
            if (movie.getMovGenre().equalsIgnoreCase(movGenre)) {
                System.out.println(movie);
            }
        }
    }
}
