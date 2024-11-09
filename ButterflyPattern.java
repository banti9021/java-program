public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 7;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
