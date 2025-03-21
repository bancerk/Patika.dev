package Odevler.FilmVeKoleksiyonFiltreleme;

public class Film {

    private String movName;
    private int releaseYear;
    private String movGenre;
    private double imdbPt;

    public String getMovName() {
        return movName;
    }

    public void setMovName(String movName) {
        this.movName = movName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovGenre() {
        return movGenre;
    }

    public void setMovGenre(String movGenre) {
        this.movGenre = movGenre;
    }

    public double getImdbPt() {
        return imdbPt;
    }

    public void setImdbPt(double imdbPt) {
        this.imdbPt = imdbPt;
    }

    public Film(String movName, int releaseYear, String movGenre, double imdbPt) {
        this.movName = movName;
        this.releaseYear = releaseYear;
        this.movGenre = movGenre;
        this.imdbPt = imdbPt;


    }
}
