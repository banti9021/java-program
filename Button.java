import java.util.*;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt(); // Changed 'Button' to 'button' to match the variable reference
        
        if (button == 1) {
            System.out.println("hii");
        } else if (button == 2) {
            System.out.println("namaste");
        } else if (button == 3) {
            System.out.println("banzour");
        } else { 
            System.out.println("invalid");
        }

        sc.close(); // Close the scanner
    }
}
