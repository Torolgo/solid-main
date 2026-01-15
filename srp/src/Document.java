public abstract class Document {
    protected double montantHT;
    protected double tva;
    protected double total;
    protected String documentName;
    protected String documentContent;

    public Document(double montantHT, String documentName) {
        this.montantHT = montantHT;
        this.tva = montantHT * 0.2;
        this.total = montantHT + tva;
        this.documentName = documentName;
        this.documentContent =  "";
    }
}
