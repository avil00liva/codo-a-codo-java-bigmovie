package edu.ar.model;

public class Pelicula {
    private int id;
    private String name;
    private String description;
    private String genre;
    private int rate;
    private int stars;
    private String yearOfRelease;
    
    public Pelicula(int id, String name, String description, String genre, int rate, int stars, String yearOfRelease) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.stars = stars;
        this.rate = rate;
        this.yearOfRelease = yearOfRelease;
    }

    public Pelicula(String name, String description, String genre, int rate, int stars, String yearOfRelease) {
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.stars = stars;
        this.rate = rate;
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfRelease(String val){
        this.yearOfRelease=val;
    }

    public String getYearOfRelease(){
        return this.yearOfRelease;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", name=" + name + ", description=" + description + ", genre=" + genre
                + ", yearOfRelease=" + yearOfRelease + ", stars=" + stars + ", rate=" + rate + "]";
    }

}
