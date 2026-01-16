import java.util.Scanner;

public class compteFactory {
    public static CompteBancaire choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");

        int choix = VerificationService.lireEntier(scanner, "Choix : ");

        if (choix == 2) {
            return new PEL();
        }
        return new CompteCourant();
    }
}
