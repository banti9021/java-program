public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for the inner part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
