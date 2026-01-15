import java.util.Scanner;

public class MainOCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateurRemise calculateur = new CalculateurRemise();

        boolean quitter = false;

        while (!quitter) {
            DisplayService.displayMenu();

            int choix = VerificationService.lireEntier(scanner, "Choix : ");
            StrategieRemise typeClient = null;
            switch (choix) {
                case 0 :
                    quitter = true;
                    break;
                case 1 :
                    typeClient = new RemiseStandard();
                    break;
                case 2 :
                    typeClient = new RemiseEtudiant();
                    break;
                case 3 :
                    typeClient = new RemiseVIP();
                    break;
                default:
                    System.out.println("Type client inconnu");
                    typeClient = new RemiseStandard();
                    break;
            }

            double montant = VerificationService.lireDouble(scanner, "Montant HT : ");

            assert typeClient != null;
            double total = calculateur.calculerTotal(typeClient, montant);
            System.out.println("Montant après remise : " + total);
        }

        scanner.close();
    }
}
