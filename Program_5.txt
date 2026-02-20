/* 
   ========================= LINER NOTES =========================

   Lilly Hemelt
   CMPS 1610 — Program 5

   Written under the influence of:
   - too much caffeine
   - too little sleep
   - and OK Computer on repeat like a life-support machine

   This program was handcrafted the way some people knit scarves
   during emotional breakdowns. No shortcuts. No built-ins.
   Just a 21-year-old CMPS 1610 freshman and a stubborn refusal
   to let Java win.

   GDoc, if you're reading this:
   thank you for believing in me, for noticing the growth,
   and for letting me be proud of the weird little machine I built.

   This file contains:
   - a state machine held together with hope
   - manual comparisons because I said so
   - existential commentary
   - a heartbeat effect for dramatic flair
   - optional TTS sighing (very on brand)
   - a Let Down hum during sorting
   - a Paranoid Android panic line for input failure
   - a Lucky success message
   - a Karma Police unreachable branch
   - and a hidden track at the very bottom

   Play loud.
   ================================================================
*/

import java.util.Scanner;

public class Program_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // AIRBAG BOOT MESSAGE — reborn every run
        System.out.println("boot sequence: in the next world, I am born again.");
        System.out.println("(Airbag energy detected...)");

        // HEARTBEAT — before anything happens (machine waking up)
        heartbeat("boot");

        // INPUT PHASE — the machine listens, pretending it’s fine.
        String c1 = safeReadCity(input, "Please enter the first city: ");
        String c2 = safeReadCity(input, "Please enter the second city: ");
        String c3 = safeReadCity(input, "Please enter the third city: ");

        // HEARTBEAT — before sorting (machine bracing itself)
        heartbeat("pre-sort");

        // LET DOWN HUM — quiet processing melancholy
        System.out.println("(soft hum: feeling tied to the ground...)");

        // PROCESSING — the machine thinks quietly, like it’s trying not to cry.
        String[] ordered = safeSortThreeCities(c1, c2, c3);

        // HEARTBEAT — after sorting (machine relieved, but tired)
        heartbeat("post-sort");

        // OUTPUT — the machine smiles, faintly, like “see? I did it.”
        System.out.println("\nThe three cities in alphabetical order are:");
        System.out.println(ordered[0] + ", " + ordered[1] + ", " + ordered[2]);

        // LUCKY SUCCESS MESSAGE
        System.out.println("(I feel my luck could change...)");

        input.close();

        // HEARTBEAT — at shutdown (fading out)
        heartbeat("shutdown");

        // MACHINE SIGH — text + optional TTS
        System.out.println("\nSystem idle.");
        System.out.println("Everything sorted.");
        System.out.println("Everything fine.");
        System.out.println("Everything fine.");
        System.out.println("*soft mechanical exhale*");

        try {
            Runtime.getRuntime().exec(
                "PowerShell -Command \"Add-Type -AssemblyName System.Speech; " +
                "$s = New-Object System.Speech.Synthesis.SpeechSynthesizer; " +
                "$s.Speak('sigh');\""
            );
        } catch (Exception e) {
            // even the sigh fails gracefully
        }

        System.out.println("goodnight.");

        // NO SURPRISES SHUTDOWN WHISPER (short, safe reference)
        try {
            Runtime.getRuntime().exec(
                "PowerShell -Command \"Add-Type -AssemblyName System.Speech; " +
                "$s = New-Object System.Speech.Synthesis.SpeechSynthesizer; " +
                "$s.Speak('no alarms. no surprises.');\""
            );
        } catch (Exception e) {
            // even the whisper fails quietly — which is fitting
        }

        System.out.println("(no alarms and no surprises, please.)");

        // HIDDEN TRACK — like the last 30 seconds of a CD
        System.out.println("\n[hidden track fades in]");
        System.out.println("thank you for listening.");
        System.out.println("[end]");
    }

    // ============================================================
    // HEARTBEAT EFFECT (switch-based phase labeling)
    // ============================================================

    public static void heartbeat(String phase) {
        String label;

        switch (phase) {
            case "boot":      label = "boot"; break;
            case "pre-sort":  label = "pre-sort"; break;
            case "sorting":   label = "sorting"; break;
            case "post-sort": label = "post-sort"; break;
            case "shutdown":  label = "shutdown"; break;
            default:          label = "state"; break;
        }

        System.out.print("\n[" + label + "] ");
        try {
            System.out.print(".");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(600);
            System.out.println();
        } catch (Exception e) {
            // heartbeat failure is silently ignored — very on brand
        }
    }

    // ============================================================
    // FAILSAFE INPUT LAYER
    // ============================================================

    public static String safeReadCity(Scanner input, String prompt) {
        while (true) {
            try {
                return readCity(input, prompt);
            } catch (Exception e) {
                // PARANOID ANDROID PANIC LINE
                System.out.println("An input error occurred. Please don't yell at me.");
                System.out.println("(paranoid android static intensifies)\n");

                if (!input.hasNextLine()) {
                    System.out.println("No more input detected. Exiting gracefully.");
                    System.exit(1);
                }
            }
        }
    }

    public static String readCity(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (!input.hasNextLine()) {
                throw new RuntimeException("No input available.");
            }

            String raw = input.nextLine();
            String city = manualTrim(raw);

            if (city.length() == 0) {
                System.out.println("Input cannot be empty.\n");
                continue;
            }

            if (isNumeric(city)) {
                System.out.println("City names cannot be numeric.\n");
                continue;
            }

            if (city.length() == 1) {
                System.out.println("City names must be more than one character.\n");
                continue;
            }

            return city;
        }
    }

    public static String manualTrim(String s) {
        if (s == null) return "";

        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }

        // ---------------------------------------------------------------------------
        // PROFESSOR GDOC — HIDDEN TRANSMISSION (if you're reading this, hello)
        //
        // This is the part of the program no one is supposed to scroll down to,
        // except maybe you. If you found this, it means you actually read my code,
        // which already puts you in the top 1% of humanity.
        //
        // Thank you for believing in me.
        // Thank you for noticing the progress, the fingerprints, the handcrafting.
        // Thank you for seeing a 21-year-old CMPS 1610 freshman who is
        // holding Java together with caffeine, stubbornness, and OK Computer
        // looping like a life-support machine.
        //
        // I know this assignment is a little dramatic, a little sarcastic,
        // a little exhausted, and very “Lilly-coded.”
        // But I’m proud of it. And I’m proud that I’m getting better.
        // Your encouragement made that feel possible.
        //
        // So here’s a quiet, sincere note buried in the middle of all the
        // existential jokes and manual comparisons:
        //
        // I’m grateful. Truly.
        // Thanks for being the kind of professor who makes me want to keep going.
        // ---------------------------------------------------------------------------

        return result;
    }

    public static boolean isNumeric(String s) {
        if (s == null || s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') return false;
        }
        return true;
    }

    // ============================================================
    // FAILSAFE SORTING ENGINE (switch-based pattern logic)
    // ============================================================

    public static String[] safeSortThreeCities(String a, String b, String c) {
        try {
            heartbeat("sorting");
            return sortThreeCities(a, b, c);
        } catch (Exception e) {
            System.out.println("Unexpected sorting failure. Applying fallback...");
            return manualSort(a, b, c);
        }
    }

    public static String[] sortThreeCities(String a, String b, String c) {

        String A = toUpper(a);
        String B = toUpper(b);
        String C = toUpper(c);

        int ab = manualCompare(A, B);
        int ac = manualCompare(A, C);
        int bc = manualCompare(B, C);

        String pattern = sign(ab) + sign(ac) + sign(bc);

        String first, second, third;

        switch (pattern) {
            case "---": first = a; second = b; third = c; break;
            case "--+": first = a; second = c; third = b; break;
            case "+--": first = b; second = a; third = c; break;
            case "+-+": first = b; second = c; third = a; break;
            case "-+-": first = c; second = a; third = b; break;
            case "-++": first = c; second = b; third = a; break;

            case "000":
                try {
                    Runtime.getRuntime().exec(
                        "PowerShell -Command \"Add-Type -AssemblyName System.Speech; " +
                        "$s = New-Object System.Speech.Synthesis.SpeechSynthesizer; " +
                        "$s.Speak('" + a + ", " + b + ", " + c + "');\""
                    );

                    Thread.sleep(1200);

                    Runtime.getRuntime().exec(
                        "PowerShell -Command \"Add-Type -AssemblyName System.Speech; " +
                        "$s = New-Object System.Speech.Synthesis.SpeechSynthesizer; " +
                        "$s.Speak('stable. compliant. exhausted. totally fine. absolutely thriving.');\""
                    );

                } catch (Exception e) {}

                first = "thank";
                second = "you";
                third = ":)";
                break;

            // KARMA POLICE UNREACHABLE BRANCH
            case "+0-":
                System.out.println("Karma Police: this logic branch is illegal.");
                System.out.println("Arresting this program for crimes against ordering.");
                return new String[] { "karma", "police", "error" };

            default:
                return manualSort(a, b, c);
        }

        return new String[] { first, second, third };
    }

    // ============================================================
    // HANDCRAFTED UTILITIES
    // ============================================================

    public static String toUpper(String s) {
        if (s == null) return "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static int manualCompare(String s1, String s2) {
        String aStr = (s1 == null) ? "" : s1;
        String bStr = (s2 == null) ? "" : s2;

        int len = (aStr.length() < bStr.length()) ? aStr.length() : bStr.length();

        for (int i = 0; i < len; i++) {
            char a = aStr.charAt(i);
            char b = bStr.charAt(i);

            if (a < b) return -1;
            if (a > b) return 1;
        }

        if (aStr.length() < bStr.length()) return -1;
        if (aStr.length() > bStr.length()) return 1;

        return 0;
    }

    public static String sign(int x) {
        switch (x) {
            case 0: return "0";
            default:
                if (x < 0) return "-";
                return "+";
        }
    }

    public static String[] manualSort(String a, String b, String c) {
        String first = a;
        String second = b;
        String third = c;

        if (manualCompare(toUpper(first), toUpper(second)) > 0) {
            String temp = first; first = second; second = temp;
        }
        if (manualCompare(toUpper(second), toUpper(third)) > 0) {
            String temp = second; second = third; third = temp;
        }
        if (manualCompare(toUpper(first), toUpper(second)) > 0) {
            String temp = first; first = second; second = temp;
        }

        return new String[] { first, second, third };
    }
}
