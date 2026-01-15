import java.util.Scanner;

public class MainSRP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FacturationService service = new FacturationService();

        boolean quitter = false;

        while (!quitter) {
            DisplayService.displayMenu();

            int choix = VerificationService.lireEntier(scanner, "Choix : ");

            switch (choix) {
                case 1:
                    FacturationService.traiterDocument(scanner, service, true);
                    break;
                case 2:
                    FacturationService.traiterDocument(scanner, service, false);
                    break;
                case 0:
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }
}
