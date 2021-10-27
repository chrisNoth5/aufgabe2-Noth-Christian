package de.uni.hd.pokemon;

import java.util.ArrayList;

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

    public ArrayList<Pokemon> listPokemon() { return pokemons; }

    public ArrayList<Pokemon> listPokemonByType(Type typeIn) {
        ArrayList<Pokemon> pokemonByType = new ArrayList<Pokemon>();
        for (Pokemon p : pokemons) {
            if (p.getType() == typeIn) {
                pokemonByType.add(p);
            }
        }
        return pokemonByType;
    }

    public Pokemon getPokemonByIndex(int i) { return pokemons.get(i); }
}
