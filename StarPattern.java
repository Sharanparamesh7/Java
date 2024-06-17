public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // size of the star pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
