public class CompteCourant extends CompteBancaire implements Retirable {
    @Override
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            System.out.println("Retrait effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Solde insuffisant.");
        }
    }
}