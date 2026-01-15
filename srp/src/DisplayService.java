public class DisplayService {
    public static void displayMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Créer une facture");
        System.out.println("2. Créer un devis");
        System.out.println("0. Quitter");
    }

    public static void displayDocument(Document document) {
        String displayFormat = document.documentContent
                .replace("FACTURE | ", "--- FACTURE ---\nDate : ")
                .replace("DEVIS | ", "--- DEVIS ---\nDate : ")
                .replace(" | ", "\n")
                .replace("=", " : ")
                .replace("HT :", "Montant HT :")
                .replace("TTC :", "Total TTC :")
                .replace("validite : 30j","Valable 30 jours");
        System.out.println(displayFormat);
    }
}