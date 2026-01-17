public class MachineService {
    public static void executerFonction(Machine machine, int fonction) {
        switch (fonction) {
            case 1:
                if (machine instanceof Imprimante) {
                    ((Imprimante) machine).print();
                } else {
                    System.out.println("Erreur : Cette machine ne peut pas imprimer.");
                }
                break;
            case 2:
                if (machine instanceof Scanneur) {
                    ((Scanneur) machine).scan();
                } else {
                    System.out.println("Erreur : Cette machine ne peut pas scanner.");
                }
                break;
            case 3:
                if (machine instanceof Fax) {
                    ((Fax) machine).fax();
                } else {
                    System.out.println("Erreur : Cette machine ne peut pas faxer.");
                }
                break;
            default:
                System.out.println("Fonction inconnue");
        }
    }
}
