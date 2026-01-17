import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            DisplayService.displayMenu();

            int fonction = VerificationService.lireEntier(scanner);
            if (fonction == 0) break;

            DisplayService.displayToChoose();

            int machineChoisie = VerificationService.lireEntier(scanner);

            Machine machine;
            if (machineChoisie == 2) {
                machine = new ImprimanteMultifonction();
            } else {
                machine = new ImprimanteSimple();
            }
            MachineService.executerFonction(machine, fonction);
        }
        scanner.close();
    }
}
