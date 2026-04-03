/* 
   ╔══════════════════════════════════════════════════════════════════╗
   ║   PROGRAM_6 — ANALOG ENGINEERING EDITION (circa 1986, MK Garage) ║
   ║                                                                  ║
   ║   Hand-built logic. No automation. No corporate polish.          ║
   ║   Just raw engineering, neon lights, and a CRT terminal humming. ║
   ║                                                                  ║
   ║   Author: Lilly Hemelt                                   ║
   ║   Course: CMPS 1610                                              ║
   ║                                                                  ║
   ║   “Flow is everything. Whether it’s air, data, or ideas.”        ║
   ╚══════════════════════════════════════════════════════════════════╝
*/

public class Program_6 {
    public static void main(String[] args) {

        // F1 GRID HEADER
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                1986 GRAND PRIX STARTING GRID         ║");
        System.out.println("║      (Numbers Divisible by 5 & 6 - Engine Ready)     ║");
        System.out.println("╚══════════════════════════════════════════════════════╝\n");

        int position = 1;  // P1, P2, P3... like a real grid

        // iterate through the full range with deliberate pacing
        for (int n = 100; n <= 1000; n++) {

            boolean by5 = divisibleBy5(n);
            boolean by6 = divisibleBy6(n);

            switch ((by5 ? 1 : 0) + (by6 ? 2 : 0)) {

                case 3: // both conditions true → car qualifies for the grid

                    // LEFT SIDE OF ROW (odd positions)
                    if (position % 2 != 0) {
                        System.out.printf("P%-3d %-6d", position, n);
                    } 
                    // RIGHT SIDE OF ROW (even positions)
                    else {
                        System.out.printf("   P%-3d %-6d\n", position, n);
                    }

                    position++;
                    break;

                default:
                    break;
            }
        }

        // If the last row had only one car, finish the line
        if ((position - 1) % 2 != 0) {
            System.out.println();
        }

        // F1 GRID FOOTER
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║                 END OF GRID — BOX THIS LAP           ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    // divisibility by 5 — last-digit inspection
    public static boolean divisibleBy5(int num) {
        int lastDigit = num % 10;
        return (lastDigit == 0 || lastDigit == 5);
    }

    // divisibility by 6 — built from fundamentals
    public static boolean divisibleBy6(int num) {
        return isEven(num) && divisibleBy3(num);
    }

    // even check — binary, mechanical, clean
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    // divisibility by 3 using digit-sum — analog math
    public static boolean divisibleBy3(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return (sum % 3 == 0);
    }
}

/* 
   ╔══════════════════════════════════════════════════════════════╗
   ║   END OF PROGRAM_6                                           ║
   ║   Logged on: MK-GARAGE-TERMINAL-04 (CRT SYNC: STABLE)        ║
   ║   Notes: All logic hand-tuned. No electronic driver aids.    ║
   ║   Build Philosophy: “If you can’t see the airflow, rewrite.” ║
   ╚══════════════════════════════════════════════════════════════╝
*/