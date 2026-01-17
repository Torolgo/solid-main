import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompteBancaire compte = compteFactory.choisirCompte(scanner);

        if (compte instanceof Retirable) {
            double montant = VerificationService.lireDouble(scanner, "Montant à retirer : ");
            ((Retirable) compte).retirer(montant);
        } else {
            System.out.println("Opération impossible : Ce type de compte ne permet pas de retrait immédiat.");
        }

        if (compte instanceof CompteEpargne) {
            System.out.println("Application des intérêts annuels...");
            ((CompteEpargne) compte).appliquerInterets();
        } else {
            System.out.println("Opération impossible : Ce type de compte ne produit pas d'intérets .");
        }

        System.out.println("Solde final : " + compte.solde);
        scanner.close();
    }
}
