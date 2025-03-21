package Odevler.FilmVeKoleksiyonFiltreleme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class MyMovieCollection {

    public static void main(String[] args) {

        Film Lotr = new Film("The Lord of the Rings: The Return of the King",2003,"Fantasy",9.0);
        Film DnD = new Film("Dungeons & Dragons: Honor Among Thieves",2023,"Fantasy",7.2);
        Film GhostinShell = new Film("Ghost in the Shell",1995,"Cyberpunk",7.9);
        Film Constantine = new Film("Constantine",2005,"Supernatural",7.0);
        Film LifeB = new Film("Life is Beautiful",1997,"Tragedy",8.6);

        List<String> myMovies = new ArrayList<>(5);

        myMovies.add(Lotr.getMovName());
        myMovies.add(DnD.getMovName());
        myMovies.add(GhostinShell.getMovName());
        myMovies.add(Constantine.getMovName());
        myMovies.add(LifeB.getMovName());

        System.out.println(myMovies);

        }
    }
