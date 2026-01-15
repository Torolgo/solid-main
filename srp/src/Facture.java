import java.time.LocalDate;

public class Facture extends Document {
    protected String clientName;
    public Facture(String clientName, double montantHT) {
        super(montantHT, "factures");
        this.clientName = clientName;
        this.documentContent =
                "FACTURE | " + LocalDate.now()
                + " | Client=" + clientName
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + total + "\n";
    }
}
