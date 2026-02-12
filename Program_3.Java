// Lilly Hemelt — Program_3
// CMPS 1610 — ASCII Character Finder
//
// This assignment is my playground.
// I was asked to map an ASCII code to a character.
// I responded by:
//   - writing my own tokenizer from scratch,
//   - colorizing the console output,
//   - classifying characters by type,
//   - adding Easter eggs for RATT, Nirvana, and Billy Joel,
//   - and sneaking in ASCII art and an ASCII table.
//
// This file is proof that I don't just "do" assignments;
// I move in, redecorate, and turn them into a tiny universe.
// Coding is my instrument. This program is one of my songs.
import java.util.Scanner;

public class Program_3 {
    // -------------------------------------------------------------------------
    // MiniTokenizer — written 100% from scratch
    //
    // Purpose:
    //   Demonstrates manual string parsing without split() or regex.
    //   Processes input one character at a time, identifying token boundaries
    //   based on whitespace and punctuation.
    //
    // Supported token types:
    //   - Alphanumeric sequences (letters + digits)
    //   - Single-character punctuation tokens
    //   - Whitespace is skipped entirely
    //
    // This is intentionally simple but fully functional for this assignment.
    // -------------------------------------------------------------------------
    static class MiniTokenizer {
        private final String input;
        private int index = 0;

        MiniTokenizer(String input) {
            this.input = input;
        }

        String nextToken() {
            // Skip whitespace
            while (index < input.length() && Character.isWhitespace(input.charAt(index))) {
                index++;
            }

            if (index >= input.length()) return null;

            char c = input.charAt(index);

            // If punctuation, return it as its own token
            if (!Character.isLetterOrDigit(c)) {
                index++;
                return Character.toString(c);
            }
// Build a normal alphanumeric token
            StringBuilder token = new StringBuilder();
            while (index < input.length() && Character.isLetterOrDigit(input.charAt(index))) {
                token.append(input.charAt(index));
                index++;
            }

            return token.toString();
        }
    }

    // ANSI color codes for enhanced console output (supported in most terminals)
    static final String RED   = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String CYAN  = "\u001B[36m";
    static final String RESET = "\u001B[0m";

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for ASCII code input
        System.out.print(CYAN + "Enter an ASCII code: " + RESET);
        String rawInput = sc.nextLine();

        // Tokenize the input to extract the first meaningful token
        MiniTokenizer tokenizer = new MiniTokenizer(rawInput);
        String token = tokenizer.nextToken();

        try {
            // Convert token to integer
            int ascii = Integer.parseInt(token);

            // Validate ASCII range
            if (ascii < 0 || ascii > 128) {
                System.out.println(RED + "Please enter a number between 0 and 128." + RESET);
                return;
            }

            // Special Easter Egg: ASCII 0 prints a tiny ASCII table
            if (ascii == 0) {
                System.out.println(GREEN + "ASCII Table (0–15):" + RESET);
                for (int i = 0; i < 16; i++) {
                    char ch = (char) i;
                    System.out.println(i + " → '" + (i == 0 ? "NUL" : ch) + "'");
                }
                return;
            }
            // Convert ASCII code to character
            char character = (char) ascii;

            // Display result
            System.out.println(GREEN + "The character for ASCII code " + ascii + " is " + character + RESET);

            // -----------------------------------------------------------------
            // Character classification
            //
            // Demonstrates use of Java's Character class and how ASCII values
            // map to letters, digits, whitespace, and symbols.
            // -----------------------------------------------------------------
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    System.out.println("Fun fact: That's an uppercase letter. Strong energy.");
                } else {
                    System.out.println("Fun fact: That's a lowercase letter. Smooth vibes.");
                }
            } else if (Character.isDigit(character)) {
                System.out.println("Fun fact: That's a digit. Math squad rises.");
            } else if (Character.isWhitespace(character)) {
                System.out.println("Fun fact: That's whitespace. Silent but deadly.");
            } else {
                System.out.println("Fun fact: That's a symbol. Cryptic. Possibly plotting.");
            }
            // -----------------------------------------------------------------
            // Hidden ASCII Art Music Modes
            //
            // These modes activate when the user enters ASCII codes corresponding
            // to the first letters of certain artists. Purely for fun; does not
            // affect the core assignment behavior.
            // -----------------------------------------------------------------

            // RATT Mode — ASCII 82 ('R') — rat silhouette
            if (ascii == 82) {
                System.out.println(CYAN + "[RATT MODE ACTIVATED] Round and Round intensifies." + RESET);

                String rattArt =
                        "      (\\__/)\n" +
                        "      ( *.*)   < RATT MODE >\n" +
                        "     / >      \n" +
                        "   __/\\__      \n" +
                        "  /      \\____ \n" +
                        " /   RATT     \\\n" +
                        "/______________\\\n";

                System.out.println(GREEN + rattArt + RESET);
            }
 // Nirvana Mode — ASCII 78 ('N') — distorted grunge text
            if (ascii == 78) {
                System.out.println(CYAN + "[NIRVANA MODE ACTIVATED] Smells Like Teen Spirit detected." + RESET);

                String nirvanaArt =
                        " _   _ _ _ _ _ _ _ _ _ _ _\n" +
                        "| \\ | | (_) (_) (_) (_) (_)\n" +
                        "|  \\| |  _   _   _   _   _ \n" +
                        "| . ` | | | | | | | | | | |\n" +
                        "| |\\  |_| |_| |_| |_| |_| |\n" +
                        "|_| \\_(_) (_) (_) (_) (_) (_)\n" +
                        "     ~~~ N I R V A N A ~~~\n" +
                        "     distorted // grunge\n";

                System.out.println(GREEN + nirvanaArt + RESET);
            }

  // Billy Joel Mode — ASCII 66 ('B') — piano keys
            if (ascii == 66) {
                System.out.println(CYAN + "[BILLY JOEL MODE ACTIVATED] Piano Man plays softly in the distance." + RESET);

                String billyArt =
                        "  |‾|_|‾|_|‾|_|‾|_|‾|_|‾|\n" +
                        "  | | | | | | | | | | | |\n" +
                        "  |_|_|_|_|_|_|_|_|_|_|_|\n" +
                        "     B I L L Y   J O E L\n" +
                        "        < Piano Man >\n";

                System.out.println(GREEN + billyArt + RESET);
            }

        } catch (NumberFormatException e) {
            // Error handling for invalid numeric input
            System.out.println(RED + "That wasn't a valid integer. My tokenizer is disappointed." + RESET);
        }
    }
}
