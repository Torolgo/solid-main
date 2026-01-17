import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PEL extends CompteBancaire implements CompteEpargne {
    private final double tauxInteret = 0.03;
    private final LocalDate dateOuverture;

    public PEL(){
        this.dateOuverture = LocalDate.now();
    }

    @Override
    public void appliquerInterets() {
        long annees = ChronoUnit.YEARS.between(dateOuverture, LocalDate.now());

        if (annees >= 1) {
            double interets = this.solde * tauxInteret * annees;
            this.solde += interets;
            System.out.println("PEL ouvert depuis " + annees + " an(s). Intérêts ajoutés : " + interets);
        } else {
            System.out.println("Pas d'intérêts : Le PEL doit avoir au moins 1 an d'ancienneté.");
        }
    }
}
