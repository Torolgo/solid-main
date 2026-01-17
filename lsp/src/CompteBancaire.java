public abstract class CompteBancaire {
    protected double solde = 100;

    public void ajouter(double montant) {
        solde += montant;
        System.out.println("Ajout effectué. Nouveau solde : " + solde);
    }
}
