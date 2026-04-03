// ============================================================================
// PROGRAM 7 - NERDCORE HOLY SCRIPTURE EDITION
// Handcrafted by: Lilly Hemelt - CMPS1610 - 2026
// Inspired by: Cam Steady, Team Plasma, and the refusal to be subtle.
// ============================================================================

/*
README - DELUXE NERDCORE EDITION

This file:
- Prompts the user for an integer
- Uses reverse(int num1)
- Displays the reversed number
- Uses loops and modular arithmetic
- Includes no return values
- Is named Program_7.java

It ALSO:
- Contains secret modes
- Contains lore, manifesto, and stage sequences
- Behaves like a Nerdcore concert disguised as a Java assignment
*/

import java.util.Scanner;

public class Program_7 {

    // ========================================================================
    // CORE ASSIGNMENT LOGIC
    // ========================================================================

    // Required method: reverses and prints digits
    public static void reverse(int num1) {
        System.out.print("Your reversed number is: ");
        while (num1 > 0) {
            int lastDigit = num1 % 10;
            System.out.print(lastDigit);
            num1 /= 10;
        }
        System.out.println();
    }

    // Plasma Mode (secret)
    private static void plasmaMode() {
        System.out.println("\n>>> TEAM PLASMA MODE ACTIVATED <<<");
        System.out.println("     ____  _                       ");
        System.out.println("    |  _ \\| | __ _ _ __ ___  __ _  ");
        System.out.println("    | |_) | |/ _` | '_ ` _ \\/ _` | ");
        System.out.println("    |  __/| | (_| | | | | | | (_| |");
        System.out.println("    |_|   |_|\\__,_|_| |_| |_|\\__,_|");
        System.out.println("        < liberation through logic >");
        System.out.println("Reversal is not destruction — it is revelation.\n");
    }

    // ========================================================================
    // CAM STEADY UNIVERSE — FUNCTIONS
    // ========================================================================

    // Pre-show ritual
    public static void camPreShow() {
        System.out.println("\n>>> PRE-SHOW RITUAL <<<");
        System.out.println("Backstage hums with low bass and quiet confidence.");
        System.out.println("Someone adjusts a hoodie. Someone cracks their knuckles.");
        System.out.println("A single spotlight flickers like it's testing your resolve.");
        System.out.println("You breathe in. The stage breathes out.");
        System.out.println("The ritual is complete.\n");
    }

    // Soundcheck sequence
    public static void camSoundcheck() {
        System.out.println("\n>>> SOUNDCHECK <<<");
        System.out.println("Mic check 1...");
        System.out.println("Mic check 2...");
        System.out.println("Bassline calibrated.");
        System.out.println("Stage monitors aligned.");
        System.out.println("Energy levels: optimal.");
        System.out.println("Crowd anticipation: rising.\n");
    }

    // Plasma remix
    public static void plasmaRemix() {
        System.out.println("\n>>> TEAM PLASMA REMIX <<<");
        System.out.println("Rewriting the stage protocol...");
        System.out.println("Deconstructing the beat...");
        System.out.println("Liberating the pattern from expectation...");
        System.out.println("Reversal engaged. Reconstruction imminent.");
        System.out.println("This is not a remix.");
        System.out.println("This is a redefinition.\n");
    }

    // Plasma-coded glitch transition
    public static void plasmaGlitchTransition() {
        System.out.println("\n>>> GLITCH TRANSITION <<<");
        System.out.println("Signal distortion detected...");
        System.out.println("Pattern integrity: intentionally compromised.");
        System.out.println("0 1 0 1 1 0 1 0 — fragments of a broken loop.");
        System.out.println("The system stutters, then stabilizes in a new configuration.");
        System.out.println("Glitch accepted. Reality updated.\n");
    }

    // Crowd interaction sequence
    public static void crowdInteraction() {
        System.out.println("\n>>> CROWD INTERACTION <<<");
        System.out.println("\"If you can hear me in the back, make some noise!\"");
        System.out.println("The crowd responds in text: [CHEERS INTENSIFY]");
        System.out.println("Hands up, hearts synced, everyone locked into the same rhythm.");
        System.out.println("For a moment, the whole room is one process.\n");
    }

    // Cam Steady Mode — full stage performance
    public static void camSteady() {
        System.out.println();

        // ASCII Banner
       System.out.println("   _________    __  ___      ________           __           ");
       System.out.println("  / ____/   |  /  |/  /     / ____/ /___ ______/ /____  _____");
       System.out.println(" / /   / /| | / /|_/ /_____/ /   / / __ `/ ___/ __/ _ \\/ ___/");
       System.out.println("/ /___/ ___ |/ /  / /_____/ /___/ / /_/ (__  ) /_/  __/ /    ");
       System.out.println("\\____/_/  |_/_/  /_/      \\____/_/\\__,_/____/\\__/\\___/_/     ");
       System.out.println("                 << CAM STEADY — 3 A.M. MODE >>               ");
       System.out.println("----------------------------------------------------------------");
       System.out.println("   The lights are off. The code is glowing. The beat is looping.");
       System.out.println("   This is the hour where mortals sleep and legends build.");
       System.out.println("----------------------------------------------------------------");

        // Hype line
        System.out.println("...3:01 AM...");
        System.out.println("You should be asleep.");
        System.out.println("But the grind whispers: keep going.");
        System.out.println("A hoodie silhouette flickers into existence.");
        System.out.println("He doesn't walk in.");
        System.out.println("He *materializes*.");

        // Stage entrance animation
        System.out.println("...lights dim...");
        System.out.println("......crowd hushes......");
        System.out.println(".........bass rumbles.........");
        System.out.println("CAM STEADY MODE INITIALIZING");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println(">>> HE WALKS OUT <<<\n");

        // Crowd interaction
        crowdInteraction();

        // Outro
        System.out.println(">>> CAM STEADY MODE COMPLETE <<<");
        System.out.println("He nods once, steps back into the shadows,");
        System.out.println("and the stage lights fade like a heartbeat.\n");
    }

    // Cam Steady Mode encore
    public static void camEncore() {
        System.out.println("\n>>> ENCORE <<<");
        System.out.println("The crowd refuses to leave.");
        System.out.println("Chants rise: ONE MORE! ONE MORE!");
        System.out.println("The lights flicker back on.");
        System.out.println("A silhouette returns to center stage.");
        System.out.println("\"You really thought I was done?\"");
        System.out.println("Encore delivered. Legend confirmed.\n");
    }

    // Post-credits scene
    public static void postCredits() {
        System.out.println("\n>>> POST-CREDITS SCENE <<<");
        System.out.println("The stage is empty.");
        System.out.println("The lights are off.");
        System.out.println("But in the silence, a single line appears:");
        System.out.println("\"You thought the show was over?\"");
        System.out.println("A shadow moves. A hoodie glows.");
        System.out.println("Cam Steady Mode will return.\n");
    }

    // Tour dates list for Program 7
    public static void tourDates() {
        System.out.println("\n>>> PROGRAM 7 = TOUR DATES <<<");
        System.out.println("Mandeville, LA = Lab Room A = First live run");
        System.out.println("Professor's IDE = Private listening session");
        System.out.println("Graded Folder = Official release");
        System.out.println("Future Projects = Surprise guest appearances");
        System.out.println("Everywhere Lilly writes code = Permanent residency.\n");
    }

    // ========================================================================
    // MAIN
    // ========================================================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== CAM-CODED INTEGER REVERSAL ENGINE ===");
        System.out.println("A handcrafted Nerdcore utility by Lilly Hemelt");
        System.out.println("------------------------------------------");

        System.out.print("Enter a number to be reversed (or type Plasma, Cam, Remix, Encore, Boss): ");

        if (input.hasNextInt()) {
            int userNum = input.nextInt();
            reverse(userNum);
        } else {
            String code = input.next();

            if (code.equalsIgnoreCase("Plasma")) {
                plasmaMode();
                plasmaRemix();
                plasmaGlitchTransition();
            } else if (code.equalsIgnoreCase("Cam")) {
                camPreShow();
                camSoundcheck();
                camSteady();
                camEncore();
            } else if (code.equalsIgnoreCase("Remix")) {
                plasmaRemix();
            } else if (code.equalsIgnoreCase("Encore")) {
                camEncore();
            } else if (code.equalsIgnoreCase("Boss")) {
                bossFight();
            }else {
                System.out.println("Unrecognized input — but the beat still drops.");
            }
        }

        tourDates();
        postCredits();

        System.out.println(">>> Program complete. Mic dropped. <<<");
    }
    // ============================================================================
//   NERDCORE FINAL BOSS FIGHT — PROGRAM 7
//   (Original, safe, terminal-friendly, mythic)
// ============================================================================
public static void bossFight() {
    System.out.println("\n>>> FINAL BOSS ENCOUNTER <<<");

    // ASCII Boss Title
    System.out.println("  ____   ___  ____   ____      ______   _____  _____ ");
    System.out.println(" |  _ \\ / _ \\|  _ \\ / ___|    |  ____| | ____|| ____|");
    System.out.println(" | |_) | | | | |_) |\\___ \\    | |__    |  _|  |  _|  ");
    System.out.println(" |  _ <| |_| |  _ <  ___) |   |  __|   | |___ | |___ ");
    System.out.println(" |_| \\_\\\\___/|_| \\_\\|____/    |_|      |_____||_____|");
    System.out.println("             < NERDCORE FINAL BOSS >\n");

    // Encounter intro
    System.out.println("The lights flicker. The terminal shakes.");
    System.out.println("A figure materializes from raw logic and late-night energy.");
    System.out.println("You have entered the FINAL BOSS of Program 7.\n");

    // Boss stats (pure flavor)
    System.out.println("BOSS NAME: The Compiler Phantom");
    System.out.println("HP: ∞");
    System.out.println("TYPE: Logic / Glitch / Nerdcore");
    System.out.println("WEAKNESS: Confidence and clean syntax\n");

    // Boss dialogue
    System.out.println("\"You dare challenge me at 3 A.M.?\"");
    System.out.println("\"Your loops are strong... but are YOU?\"\n");

    // Attack sequence
    System.out.println(">>> The Compiler Phantom attacks with: WALL OF ERRORS <<<");
    System.out.println("[ERROR] Unexpected token");
    System.out.println("[ERROR] Missing semicolon");
    System.out.println("[ERROR] Cannot find symbol");
    System.out.println("You tank the hit. You’ve seen worse.\n");

    // Player counterattack
    System.out.println(">>> YOU STRIKE BACK <<<");
    System.out.println("You unleash: CLEAN COMPILE");
    System.out.println("You deal MASSIVE DAMAGE.\n");

    // Plasma glitch phase
    System.out.println(">>> BOSS ENTERS GLITCH PHASE <<<");
    System.out.println("0 1 0 1 1 0 1 0 - reality distorts.");
    System.out.println("The Phantom screams in binary.\n");

    // Victory
    System.out.println(">>> FINAL BLOW <<<");
    System.out.println("You execute: REVERSE() - the forbidden technique.");
    System.out.println("Digits scatter like shattered armor.");
    System.out.println("The Compiler Phantom dissolves into clean output.\n");

    System.out.println(">>> BOSS DEFEATED <<<");
    System.out.println("You stand victorious.");
    System.out.println("The crowd (imaginary but real in your heart) goes WILD.\n");
}
}