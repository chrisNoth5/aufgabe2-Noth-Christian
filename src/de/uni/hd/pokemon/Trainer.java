package de.uni.hd.pokemon;

import java.util.ArrayList;

import jdk.jfr.Description;

public class Trainer {
    private String firstName;
    private String lastName;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void linkPokemon(Pokemon p) {
        pokemons.add(p);
        p.setTrainer(this);
    }

    public void listPokemon() {
        for (Pokemon p : pokemons) {
            System.out.println(p);
        }
    }
}
