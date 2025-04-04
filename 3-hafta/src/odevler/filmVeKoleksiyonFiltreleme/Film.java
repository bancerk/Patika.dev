package odevler.filmVeKoleksiyonFiltreleme;

// @Entity
public class Film {

    private String movName;
    private int releaseYear;
    private String movGenre;
    private double imdbScore;

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

    public double getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    public Film(String movName,int releaseYear,String movGenre,double imdbScore) {
        this.movName = movName;
        this.releaseYear = releaseYear;
        this.movGenre = movGenre;
        this.imdbScore = imdbScore;
    }

    public Film() {
    }

    @Override
    public String toString() {
        return "Film{" +
                "movName='" + movName + '\'' +
                ", releaseYear=" + releaseYear +
                ", movGenre='" + movGenre + '\'' +
                ", imdbScore=" + imdbScore +
                '}';
    }
}
