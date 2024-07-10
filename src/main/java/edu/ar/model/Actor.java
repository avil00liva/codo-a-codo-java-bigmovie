package edu.ar.model;

public class Actor extends Persona {
    private int premiosGanados = 0;

    public Actor(int id, String firstname, String lastname, String country, int premiosGanados) {
        super(id, firstname, lastname, country);
        this.premiosGanados = premiosGanados;
    }

    public int getPremiosGanados() {
        return premiosGanados;
    }

    public void setPremiosGanados(int premiosGanados) {
        this.premiosGanados = premiosGanados;
    }

    @Override
    public String toString() {
        return "Actor [toString()=" + super.toString() + "]" + ", Premios ganados: " + getPremiosGanados();
    }

}
