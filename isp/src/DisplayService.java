public class DisplayService {
    public static void displayMenu(){
        System.out.println("\n--- MENU ---");
        System.out.println("1. Imprimer");
        System.out.println("2. Scanner");
        System.out.println("3. Faxer");
        System.out.println("0. Quitter");
        System.out.print("Choix fonctionnalité : ");
    }

    public static void displayToChoose(){
        System.out.println("\nChoisir la machine :");
        System.out.println("1. Imprimante simple");
        System.out.println("2. Imprimante multifonction");
        System.out.print("Choix machine : ");
    }
}
