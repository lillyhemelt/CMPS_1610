/**
 * *****************************************************************************
 * Full Name: Lilly Grace Hemelt
 * Assignment: Program 9 – The "Universal Logic" Calculator
 * Due Date: Sunday, May 3rd, 2026 @ 11:59 p.m.
 * * DESIGN PHILOSOPHY: 
 * If you aren't over-engineering, you aren't trying. This kernel implements 
 * a zero-failure modular architecture that handles everything from basic 
 * arithmetic to Schwarzschild radii. Rubrics are suggestions; excellence is 
 * mandatory. Geaux Lions.
 * *****************************************************************************
 */

import java.util.Scanner;

public class Program_9 {

    // Constants for deep-space telemetry and orbital dynamics
    private static final double G = 6.67430e-11; 
    private static final double C = 299792458;   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;

        // Interface branding - customized for the Hemelt-V build
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│          HEMELT-V : ASTRAEA OMNI-KERNEL v12.0            │");
        System.out.println("│     - Beyond Honors / High-Fidelity Logic Engine -       │");
        System.out.println("└──────────────────────────────────────────────────────────┘");

        do { 
            renderInterface(); 
            
            System.out.print("\n[ASTRAEA@HEMELT-V]:~# ");
            String rawOp = input.next().toUpperCase();
            operator = rawOp.charAt(0);

            if (operator == 'E') break; 

            if (!isLegitOperator(operator)) { 
                System.out.println(">> [!] CRITICAL: Operator '" + operator + "' is out of scope. Try again.");
                continue; 
            }

            // Routing logic based on operator type
            if (operator == 'V') {
                runVectorKernel(input);
            } else if (operator == 'B') {
                runBitwiseKernel(input);
            } else if (operator == 'O') {
                runOrbitalKernel(input);
            } else {
                // Mandatory binary operations 
                double n1 = getValidatedInput(input, ">> Input Variable Alpha: "); // [cite: 40]
                double n2 = getValidatedInput(input, ">> Input Variable Beta:  "); // [cite: 41]
                executeCalculation(operator, n1, n2);
            }

        } while (true); 

        // Termination sequence 
        System.out.println("\n[SYSTEM] Finalizing logs... Buffer cleared.");
        System.out.println("[SYSTEM] Thanks for using my calculator program. Geaux Lions!"); 
        input.close();
    }

    public static void renderInterface() {
        System.out.println("\n--- PRIMARY ---      --- HONORS ---      --- ASTRAEA-EXT ---");
        System.out.println(" [+] Addition      [%] Modulus        [V] Vector Magnitude");
        System.out.println(" [-] Subtraction   [A] Average        [O] Orbital Mechanics");
        System.out.println(" [*] Multiplication [^] Exponent       [B] Bitwise/Hex Map");
        System.out.println(" [/] Division      [E] Exit System");
    }

    // --- ASTRAEA EXCLUSIVES (The "OMG" Kernels) ---

    public static void runOrbitalKernel(Scanner sc) {
        System.out.println("   [ORBITAL] 1: Escape Velocity | 2: Schwarzschild Radius");
        int sub = (int)getValidatedInput(sc, "   Select Sub-Kernel: ");
        if (sub == 1) {
            double m = getValidatedInput(sc, "   Mass of Planet (kg): ");
            double r = getValidatedInput(sc, "   Radius (m): ");
            System.out.printf("   [RESULT] Escape Velocity: %.2f m/s\n", Math.sqrt((2 * G * m) / r));
        } else {
            double m = getValidatedInput(sc, "   Mass of Object (kg): ");
            System.out.printf("   [RESULT] Schwarzschild Radius: %.4e meters\n", (2 * G * m) / (C * C));
        }
    }

    public static void runVectorKernel(Scanner sc) {
        double x = getValidatedInput(sc, ">> Vector X: ");
        double y = getValidatedInput(sc, ">> Vector Y: ");
        double z = getValidatedInput(sc, ">> Vector Z: ");
        System.out.printf("   [NAV] 3D-Magnitude: %.4f\n", Math.sqrt(x*x + y*y + z*z));
    }

    public static void runBitwiseKernel(Scanner sc) {
        int val = (int)getValidatedInput(sc, ">> Decimal Input: ");
        System.out.println("   [MAP] BINARY: " + Integer.toBinaryString(val));
        System.out.println("   [MAP] HEX: 0x" + Integer.toHexString(val).toUpperCase());
    }

    // --- MANDATORY LOGIC CONTROLLER ---

    public static void executeCalculation(char op, double a, double b) {
        switch (op) {
            case '+': System.out.printf("   RESULT: %.2f + %.2f = %.2f\n", a, b, add(a, b)); break; // [cite: 8]
            case '-': System.out.printf("   RESULT: %.2f - %.2f = %.2f\n", a, b, subtract(a, b)); break; // [cite: 9]
            case '*': System.out.printf("   RESULT: %.2f * %.2f = %.2f\n", a, b, multiply(a, b)); break; // [cite: 10]
            case '/': // [cite: 11]
                if (b == 0) System.out.println("   [!] ERROR: Division by zero is a mathematical paradox."); 
                else System.out.printf("   RESULT: %.2f / %.2f = %.2f\n", a, b, divide(a, b)); 
                break;
            case '^': System.out.printf("   RESULT: %.2f ^ %.2f = %.2f\n", a, b, power(a, b)); break; // [cite: 12]
            case '%': System.out.printf("   RESULT: %.2f %% %.2f = %.2f\n", a, b, modulus(a, b)); break; // [cite: 22]
            case 'A': System.out.printf("   RESULT: Avg(%.2f, %.2f) = %.2f\n", a, b, average(a, b)); break; // [cite: 23]
        }
    }

    // --- SEPARATE METHODS --- 

    public static double add(double x, double y) { return x + y; }
    public static double subtract(double x, double y) { return x - y; }
    public static double multiply(double x, double y) { return x * y; }
    public static double divide(double x, double y) { return x / y; }
    public static double power(double x, double y) { return Math.pow(x, y); }
    public static double modulus(double x, double y) { return x % y; } 
    public static double average(double x, double y) { return (x + y) / 2.0; } 

    // --- INPUT VALIDATION & GUARDS ---

    public static double getValidatedInput(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) return sc.nextDouble();
            System.out.println("   [!] ERROR: Non-numeric data detected. Re-syncing input stream...");
            sc.next(); // Flush the trash
        }
    }

    public static boolean isLegitOperator(char op) {
        return "+-*/^%AVOBE".indexOf(op) != -1;
    }
}