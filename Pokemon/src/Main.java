import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(new Pokemon(1, "Bulbasaur", "Plante", 45, 45, 49, 49, 65, 65, 45));
        pokedex.add(new Pokemon(2, "Ivysaur", "Plante", 60, 60, 62, 63, 80, 80, 60));
        pokedex.add(new Pokemon(3, "Venusaur", "Plante", 80, 80, 82, 83, 100, 100, 80));
        pokedex.add(new Pokemon(4, "Charmander", "Feu", 39, 39, 52, 43, 60, 50, 65));
        pokedex.add(new Pokemon(5, "Charmeleon", "Feu", 58, 58, 64, 58, 80, 65, 80));
        pokedex.add(new Pokemon(6, "Charizard", "Feu", 78, 78, 84, 78, 109, 85, 100));
        pokedex.add(new Pokemon(7, "Squirtle", "Eau", 44, 44, 48, 65, 50, 64, 43));
        pokedex.add(new Pokemon(8, "Wartortle", "Eau", 59, 59, 63, 80, 65, 80, 58));
        pokedex.add(new Pokemon(9, "Blastoise", "Eau", 79, 79, 83, 100, 85, 105, 78));

        System.out.println("Sélectionnez deux Pokémon pour qu'ils se battent:");
        for (int i = 0; i < pokedex.size(); i++) {
            Pokemon p = pokedex.get(i);
            System.out.println((i + 1) + ": " + p.getNom() + " (Vitesse: " + p.getVitesse() + ")");
        }


        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez le numéro du premier Pokémon: ");
        int choix1 = scanner.nextInt();
        Pokemon premierPokemon = pokedex.get(choix1 - 1);


        System.out.print("Entrez le numéro du deuxième Pokémon: ");
        int choix2 = scanner.nextInt();
        Pokemon deuxiemePokemon = pokedex.get(choix2 - 1);


        System.out.println("\nVous avez choisi :");
        System.out.println(premierPokemon);
        System.out.println(deuxiemePokemon);


        Pokemon premierAttaquant;
        Pokemon deuxiemeAttaquant;

        if (premierPokemon.getVitesse() > deuxiemePokemon.getVitesse()) {
            premierAttaquant = premierPokemon;
            deuxiemeAttaquant = deuxiemePokemon;
        } else if (deuxiemePokemon.getVitesse() > premierPokemon.getVitesse()) {
            premierAttaquant = deuxiemePokemon;
            deuxiemeAttaquant = premierPokemon;
        } else {

            Random rand = new Random();
            if (rand.nextBoolean()) {
                premierAttaquant = premierPokemon;
                deuxiemeAttaquant = deuxiemePokemon;
            } else {
                premierAttaquant = deuxiemePokemon;
                deuxiemeAttaquant = premierPokemon;
            }
        }

        System.out.println("\n" + premierAttaquant.getNom() + " attaque en premier !");
        int dommage = premierAttaquant.calculerDommage(deuxiemeAttaquant, 40); // Puissance 40
        System.out.println(premierAttaquant.getNom() + " inflige " + dommage + " points de dommage à " + deuxiemeAttaquant.getNom());

        dommage = deuxiemeAttaquant.calculerDommage(premierAttaquant, 60); // Puissance 60
        System.out.println(deuxiemeAttaquant.getNom() + " inflige " + dommage + " points de dommage à " + premierAttaquant.getNom());
    }
}
