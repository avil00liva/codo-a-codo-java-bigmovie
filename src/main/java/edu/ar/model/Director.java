package edu.ar.model;

public class Director extends Persona {
    private int peliculasDirigidas;

    public Director(int id, String firstname, String lastname, String country, int peliculasDirigidas) {
        super(id, firstname, lastname, country);
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public int getPeliculasDirigidas() {
        return peliculasDirigidas;
    }

    public void setPeliculasDirigidas(int peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
    }

    @Override
    public String toString() {
        return "Director [peliculasDirigidas=" + peliculasDirigidas + ", toString()=" + super.toString() + "]";
    }

}
