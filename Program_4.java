/* Lilly Hemelt - Program-4
CMPS 1610 - Random Month Generator

This assignment is tiny, but I've been staring at it for days anyway,
because apparently this is who I am now: a girl in STEM powered by
caffeine, malic acid, existential dread, and the stubborn belief that if I just keep trying
I can make something I'm proud of.

I'm not doing this to show off. I'm doing it because programming is the
first place in school I feel like I actually understand what's going on.
So yes, I hand-crafted parts of this code (you'll see where). Yes, I over-commented.
And yes, I will absolutely roast my own work because that's just how I cope at this point
when I've been debugging a 10-point assignment like it's the cure for
emotional instability...

Well-behaved women seldom make history.
And the question isn't who's going to let me; it's who's going to stop me.

Anyway, here is my code... I hope you enjoy it as much as I enjoyed making it.
*/

public class Program_4 {

    /* My own tiny random generator because apparently I enjoy suffering.
       This recreates the logic behind java.util.Random using an LCG.
       Hand-crafted. Caffeinated. Malic-acid-infused. Chaos mode included. */
    static class MyRandom {
        private long seed;
        private final boolean chaos;

        MyRandom(long seed, boolean chaos) {
            this.seed = seed ^ 0x5DEECE66DL; // seed scrambling because drama
            this.chaos = chaos;
        }

        int nextInt(int bound) {
            seed = (seed * 1664525 + 1013904223) % (1L << 32);
            int value = (int)(seed % bound);
            return chaos ? (value * 7 + 3) % bound : value;
        }
    }

    /* My hand-crafted MonthInfo class because I refuse to let Java do
       all the work for me. If I’m going to suffer, I’m going to suffer
       with OBJECTS. */
    static class MonthInfo {
        int number;
        String name;
        String fact;
        String mood;
        int vibe;
        int difficulty;

        MonthInfo(int number, String name, String fact, String mood,
                  int vibe, int difficulty) {
            this.number = number;
            this.name = name;
            this.fact = fact;
            this.mood = mood;
            this.vibe = vibe;
            this.difficulty = difficulty;
        }
    }

    /* Hand-made uppercase converter because apparently I refuse to use
       built-in functions like a normal person. */
    static String scream(String s) {
        StringBuilder out = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                out.append((char)(c - 32)); // manual ASCII uppercase
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    /* Because I trust nothing, not even my own random generator. */
    static boolean safeIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    /* Vibe score algorithm because months deserve personality. */
    static int vibeScore(int number) {
        return (int)(Math.abs(Math.sin(number * 3.14 / 6)) * 100);
    }

    /* Difficulty rating because life is hard and so are months. */
    static int difficulty(int number) {
        return (number * 13 + 7) % 10; // chaotic but consistent
    }

    /* Personality engine because I’m extra. */
    static String personality(int vibe) {
        if (vibe > 80) return "This month is thriving and honestly unstoppable.";
        if (vibe > 50) return "This month is doing its best and it shows.";
        if (vibe > 20) return "This month is hanging on by a thread.";
        return "This month is powered by spite alone.";
    }

    /* Lore generator because every month has a backstory now. */
    static String lore(String name, int vibe) {
        return "Lore Drop: " + name + " enters with " + vibe + "% vibe energy.";
    }

    /* Season classifier because logic and structure are a love language. */
    static String season(int number) {
        if (number == 12 || number <= 2) return "Winter";
        if (number <= 5) return "Spring";
        if (number <= 8) return "Summer";
        return "Fall";
    }

    /* Alignment chart because months now have D&D alignments. */
    static String alignment(int number) {
        String[] alignments = {
            "Lawful Good", "Neutral Good", "Chaotic Good",
            "Lawful Neutral", "True Neutral", "Chaotic Neutral",
            "Lawful Evil", "Neutral Evil", "Chaotic Evil",
            "Chaotic Academic", "Overcaffeinated Neutral", "Festive Chaotic"
        };
        return alignments[number - 1];
    }

    /* Chaos level because math + unhinged energy felt correct. */
    static int chaosLevel(int number, int vibe) {
        return (number * 3 + vibe / 10) % 10;
    }

    /* Because printing things line by line felt too emotionally unstable. */
    static void printMonthReport(MonthInfo m) {
        System.out.println("=== MONTH REPORT ===");
        System.out.println("Number: " + m.number);
        System.out.println("Name: " + scream(m.name));
        System.out.println("Fact: " + m.fact);
        System.out.println("Mood: " + m.mood);
        System.out.println("Season: " + season(m.number));
        System.out.println("Alignment: " + alignment(m.number));
        System.out.println("Vibe Score: " + m.vibe);
        System.out.println("Difficulty: " + m.difficulty + "/10");
        System.out.println("Chaos Level: " + chaosLevel(m.number, m.vibe) + "/10");
        System.out.println("Personality: " + personality(m.vibe));
        System.out.println(lore(m.name, m.vibe));
        System.out.println("====================");
    }

    public static void main(String[] args) {

        // Using my own random generator because I’m dramatic like that.
        MyRandom rng = new MyRandom(System.currentTimeMillis(), true);

        int number = rng.nextInt(12) + 1; // 1–12

        String[] names = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };

        String[] facts = {
            "January: The month where everyone lies about going to the gym.",
            "February: 28 days of chaos. 29 if the universe is feeling spicy.",
            "March: The month that can't pick a season. Commitment issues.",
            "April: Rain, allergies, and emotional instability.",
            "May: The month that thinks it's summer but isn’t.",
            "June: Sun-powered confidence unlocked.",
            "July: Loud, chaotic, and probably dehydrated.",
            "August: The month that overstays its welcome.",
            "September: Academic panic season begins.",
            "October: Peak vibes. No notes.",
            "November: Cozy denial and carbs.",
            "December: Festive chaos wrapped in twinkly lights."
        };

        String[] moods = {
            "January Mood: Overachiever energy.",
            "February Mood: Running on vibes.",
            "March Mood: Confused but trying.",
            "April Mood: Emotionally unstable.",
            "May Mood: Mild optimism.",
            "June Mood: Sun-powered confidence.",
            "July Mood: Loud and unhinged.",
            "August Mood: Tired of its own existence.",
            "September Mood: Academic panic.",
            "October Mood: Thriving.",
            "November Mood: Cozy denial.",
            "December Mood: Glitter-fueled chaos."
        };

        if (!safeIndex(number - 1, names.length)) {
            System.out.println("Index out of bounds. The universe is broken.");
            return;
        }

        int vibe = vibeScore(number);
        int diff = difficulty(number);

        MonthInfo m = new MonthInfo(
            number,
            names[number - 1],
            facts[number - 1],
            moods[number - 1],
            vibe,
            diff
        );

        printMonthReport(m);

        /* Reflection:
        I know this program is simple, but writing it reminds me why I like coding.
        It’s structured, logical, and it gives me a place to put effort and actually
        see it turn into something real. I’m not trying to be flashy; I’m trying
        because this is the one place where I feel like I belong. And if I’m not
        good at this either, then I honestly don’t know what else I’d have — so
        I’m giving it everything I’ve got.
        
        Girl in STEM with a vengeance.
        Fueled by caffeine, malic acid, and the audacity to keep going.*/
    }
}