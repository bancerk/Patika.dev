package Odevler.FilmVeKoleksiyonFiltreleme;

public class Film {

    private String movName;
    private int releaseYear;
    private String movGenre;
    private double imdbPt;

    public Film(String movName, int releaseYear, String movGenre, double imdbPt) {
        this.movName = movName;
        this.releaseYear = releaseYear;
        this.movGenre = movGenre;
        this.imdbPt = imdbPt;
    }
}
