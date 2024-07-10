package edu.ar.model;

public class Persona {
    private int id;
    private String firstname;
    private String lastname;
    private String country;

    public Persona(){}

    public Persona(int id, String firstname, String lastname, String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Persona [getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
                + ", getCountry()=" + getCountry() + "]";
    }

    
}
