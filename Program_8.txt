// ================================================================
// Program_8.java
// Author: Lilly Hemelt
//
// DIGIT VERSION — A FULL POKéMON-STYLE ENCOUNTER SIMULATION
//
// Featuring:
//  • DMG‑01 boot sequence
//  • Professor Oak intro
//  • Wild encounter battle screen
//  • Shiny digit mechanic
//  • Gen‑1 Pokédex interface
//
// Your adventure begins.
// ================================================================

import java.util.Random;

public class Program_8 {

    public static void main(String[] args) {
        final int TOTAL = 100;
        int[] digits = new int[TOTAL];
        int[] counts = new int[10];
        int[] shinyCounts = new int[10];

        Random rng = new Random();

        bootScreen();
        professorOakIntro();   // NEW
        introText();

        // Generate digits + shiny variants
        for (int i = 0; i < TOTAL; i++) {
            int value = rng.nextInt(10);

            boolean shiny = rng.nextInt(256) == 0; // 1/256 shiny chance

            digits[i] = shiny ? value + 100 : value;

            counts[value]++;
            if (shiny) shinyCounts[value]++;
        }

        battleScreen(digits);
        pokedexScreen(counts, shinyCounts);
        endScreen();
    }

    // ============================================================
    //                     UI SCREENS
    // ============================================================

    private static void bootScreen() {
        System.out.println("========================================");
        System.out.println("|         POKEMON DIGIT VERSION        |");
        System.out.println("|            DMG-01 SYSTEM             |");
        System.out.println("========================================");
        System.out.println("   c1996 GAME FREAK / NINTONDO\n");

        slow("> Booting cartridge...\n");
    }

    // ---------------- PROFESSOR OAK INTRO ----------------

    private static void professorOakIntro() {
        System.out.println("========================================");
        System.out.println("           PROF. OAK'S LAB");
        System.out.println("========================================\n");

        slow("Hello there!\n");
        slow("Welcome to the world of POKEMON-\n");
        slow("...oh? That's not right.\n");
        slow("Ahem.\n\n");

        slow("Welcome to the world of DIGITS!\n");
        slow("My name is OAK!\n");
        slow("People call me the DIGIT PROFESSOR!\n\n");

        slow("This world is inhabited by mysterious creatures\n");
        slow("called DIGITS.\n\n");

        slow("For some people, digits are tools.\n");
        slow("Others use them for study.\n\n");

        slow("As for me...\n");
        slow("I study digits as a profession.\n\n");

        slow("But enough about me!\n");
        slow("Let's get you started on your journey.\n\n");

        slow("Your task today:\n");
        slow("Encounter 100 wild digits,\n");
        slow("record their sightings,\n");
        slow("and update your Pokedex.\n\n");

        slow("Your adventure begins NOW!\n\n");
    }

    // ---------------- TALL GRASS INTRO ----------------

    private static void introText() {
        slow("You step into the tall grass...\n");
        slow("The wind shifts.\n");
        slow("Something is watching.\n\n");

        System.out.println("----------------------------------------");
        System.out.println("       A WILD PRESENCE APPROACHES");
        System.out.println("----------------------------------------\n");
    }

    // ---------------- BATTLE SCREEN ----------------

    private static void battleScreen(int[] digits) {
        System.out.println("========================================");
        System.out.println("           WILD DIGIT APPEARED!");
        System.out.println("========================================");

        boolean shinyFound = false;

        for (int i = 0; i < digits.length; i++) {
            if (i % 10 == 0) System.out.print("  ");

            int raw = digits[i];
            boolean shiny = raw >= 100;
            int value = shiny ? raw - 100 : raw;

            if (shiny) {
                System.out.print("★" + value + " ");
                shinyFound = true;
            } else {
                System.out.print(value + " ");
            }

            if ((i + 1) % 10 == 0) System.out.println();
        }

        System.out.println("\n----------------------------------------");

        if (shinyFound) {
            slow("!!! A SHINY DIGIT SPARKLES BRIGHTLY !!!\n");
        }

        slow("Trainer Lilly sent out SCANNER!\n");
        slow("SCANNER used ANALYZE...\n");
        slow("It's super effective!\n\n");
    }

    // ---------------- POKÉDEX SCREEN ----------------

    private static void pokedexScreen(int[] counts, int[] shinyCounts) {
        System.out.println("========== POKEDEX - DIGIT INDEX ==========");
        slow("Accessing Pokedex...\n\n");

        for (int i = 0; i < counts.length; i++) {
            if (shinyCounts[i] > 0) {
                System.out.printf("Digit %d  >  %d sightings (%d shiny)%n",
                        i, counts[i], shinyCounts[i]);
            } else {
                System.out.printf("Digit %d  >  %d sightings%n", i, counts[i]);
            }
        }

        System.out.println("-------------------------------------------\n");
    }

    // ---------------- END SCREEN ----------------

    private static void endScreen() {
        System.out.println("========================================");
        System.out.println("         ENCOUNTER COMPLETE");
        System.out.println("========================================");
        System.out.println("     PRESS A TO CONTINUE YOUR JOURNEY");
        System.out.println("========================================");
    }

    // ============================================================
    //                     TEXT EFFECTS
    // ============================================================

    private static void slow(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(18);
            }
        } catch (InterruptedException e) {
            System.out.print(text);
        }
    }
}
