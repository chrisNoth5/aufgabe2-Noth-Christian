package de.uni.hd.pokemon;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon p1;

        // Test of class constructor
        System.out.println();
        System.out.println("- Testen von constructor -");
        p1 = new Pokemon("Charmeleon", Type.FIRE);

        // Test of getter of name
        System.out.println();
        System.out.println("- Testen von getName -");
        System.out.println("Name von Pokemon p1:");
        System.out.println(p1.getName());

        // Test of setter of name
        System.out.println();
        System.out.println("- Testen von setName -");
        System.out.println("Setze Name von Pokemon p1 von 'Charmeleon' auf 'Charizard'.");
        p1.setName("Charizard");
        System.out.println("Pokemon p1 wurde zu 'Charizard' umbenannt.");
        System.out.println("Prüfe auf Erfolg von setName:");
        System.out.println(p1.getName());

        // Test of getter of type
        System.out.println();
        System.out.println("- Testen von getType -");
        System.out.println("Typ von Pokemon p1:");
        System.out.println(p1.getType());

        // Test of setter of type
        System.out.println();
        System.out.println("- Testen von setType -");
        System.out.println("Setze Typ von Pokemon p1 von 'FIRE' auf 'WATER'.");
        p1.setType(Type.WATER);
        System.out.println("Der Typ von Pokemon p1 wurde auf 'WATER' gesetzt.");
        System.out.println("Prüfe auf Erfolg von setType:");
        System.out.println(p1.getType());

        // Test of toString method
        System.out.println();
        System.out.println("- Testen der toString-Methode -");
        System.out.println("Rufe p1.toString() explizit auf:");
        System.out.println(p1.toString());
        System.out.println("Rufe p1.toString() implizit auf:");
        System.out.println(p1);

        Pokemon p2 = new Pokemon("Pamflam", Type.POISON);
        Pokemon p3 = new Pokemon("Glurak", Type.FIRE);
        Pokemon p4 = new Pokemon("Magikarp", Type.WATER);

        // Test of class constructor
        System.out.println();
        System.out.println("- Testen von constructor -");
        Trainer trainer = new Trainer("Ash", "Ketchum");

        // Test of linkPokemon method
        System.out.println();
        System.out.println("- Testen von linkPokemon -");
        System.out.println("Füge Pokemon p2 der Liste von Trainer trainer hinzu:");
        trainer.linkPokemon(p2);
        System.out.println("Pokemon p2 wurde der Liste von Trainer trainer hinzugefügt.");
        System.out.println("Prüfe auf Erfolg von linkPokemon:");
        System.out.println(trainer.listPokemon());

        trainer.linkPokemon(p3);
        trainer.linkPokemon(p4);

        // Test of getter of firstName
        System.out.println();
        System.out.println("- Testen von getFirstName -");
        System.out.println("Vorname von Trainer trainer:");
        System.out.println(trainer.getFirstName());

        // Test of setter of firstName
        System.out.println();
        System.out.println("- Testen von setFirstName -");
        System.out.println("Setze Vorname von Trainer trainer von 'Ash' auf 'Max'.");
        trainer.setFirstName("Max");
        System.out.println("Vorname von Trainer trainer wurde zu 'Max' umbenannt.");
        System.out.println("Prüfe auf Erfolg von setFirstName:");
        System.out.println(trainer.getFirstName());

        // Test of getter of lastName
        System.out.println();
        System.out.println("- Testen von getLastName -");
        System.out.println("Nachname von Trainer trainer:");
        System.out.println(trainer.getLastName());

        // Test of setter of lastName
        System.out.println();
        System.out.println("- Testen von setLastName -");
        System.out.println("Setze Nachname von Trainer trainer von 'Ketchum' auf 'Mustermann'.");
        trainer.setLastName("Mustermann");
        System.out.println("Nachname von Trainer trainer wurde zu 'Mustermann' umbenannt.");
        System.out.println("Prüfe auf Erfolg von setLastName:");
        System.out.println(trainer.getLastName());

        // Test of toString method
        System.out.println();
        System.out.println("- Testen der toString-Methode -");
        System.out.println("Rufe trainer.toString() implizit auf:");
        System.out.println(trainer);

        // Test of listPokemon method
        System.out.println();
        System.out.println("- Testen der listPokemon-Methode -");
        System.out.println("Gebe Liste der Pokemon von trainer aus:");
        System.out.println(trainer.listPokemon());

        // Test of listPokemonByType method
        System.out.println();
        System.out.println("- Testen der listPokemonByType-Methode -");
        System.out.println("Gebe Liste der Pokemon von trainer vom Typ 'WATER' aus:");
        System.out.println(trainer.listPokemonByType(Type.WATER));

        // Test of getPokemonByIndex method
        System.out.println();
        System.out.println("- Testen der getPokemonByIndex-Methode -");
        System.out.println("Gebe zweites Pokemon von trainer aus:");
        System.out.println(trainer.getPokemonByIndex(1));
    }
}
