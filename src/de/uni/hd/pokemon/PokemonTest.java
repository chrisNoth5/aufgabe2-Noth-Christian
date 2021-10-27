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
    }
}
