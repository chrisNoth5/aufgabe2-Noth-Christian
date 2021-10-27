package de.uni.hd.pokemon;

public class Pokemon {
    private String name;
    private Type type;
    private int number;
    private static int nextNumber = 0;
    private Trainer trainer;

    // basic constructor
    public Pokemon() {
        this.name = "";
        this.type = Type.POISON;
        this.number = nextNumber;
        nextNumber++;
    }
    // more detailed constructor
    public Pokemon(String name, Type type) {
        // declare Pokemon attributes
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
    }

    public String toString() {
        return "Pokemon Name: " + this.name + ", Type: " + this.type + ", Number: " + this.number;
    }

    public String getName() {
        return name;
    }

    // Das Schlüsselwort this gibt eine Referenz auf das Objekt zurück, dessen setName-Methode aufgerufen wurde.
    // this.name ist somit das name-Attribut von diesem Objekt.
    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public static void main(String[] args) {
        // test Pokemon constructor and toString conversion
        Pokemon p1;
        p1 = new Pokemon("Charmander", Type.FIRE);

        Pokemon p2 = new Pokemon("Squirtle", Type.WATER);
        Pokemon p3 = new Pokemon("Bulbasaur", Type.POISON);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
