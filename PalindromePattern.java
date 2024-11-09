public class PalindromePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print first half numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print second half numbers in increasing order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
