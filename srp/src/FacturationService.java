import java.util.Scanner;

public class FacturationService {
    public static void traiterDocument(Scanner scanner, FacturationService service, boolean facture) {
        double montantHT = VerificationService.lireDoublePositif(scanner, "Montant HT : ");

        if (facture) {
            System.out.print("Nom du client : ");
            String client = scanner.nextLine().trim();
            service.createFacture(montantHT, client);
        } else {
            service.createDevis(montantHT);
        }
    }

    public void createFacture(double montantHT, String clientName) {
        Facture facture = new Facture(clientName, montantHT);
        DisplayService.displayDocument(facture);
        SaveFileService.saveDocument(facture);
    }

    public void createDevis(double montantHT) {
        Devis devis = new Devis(montantHT);
        DisplayService.displayDocument(devis);
        SaveFileService.saveDocument(devis);
    }
}
