import java.util.Scanner;

public class VerificationService {
    protected static int lireEntier(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }

    protected static double lireDouble(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
