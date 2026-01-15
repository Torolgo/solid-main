import java.time.LocalDate;

public class Devis extends Document{
    public Devis(double montantHT) {
        super(montantHT, "devis");
        this.documentContent =
                "DEVIS | " + LocalDate.now()
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + total
                + " | validite=30j\n";
    }
}
