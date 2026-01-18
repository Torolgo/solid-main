import java.util.Scanner;

public class MainDip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NotificationService service = new NotificationService();

        while (true) {
            DisplayService.displayMenu();
            int choice = VerificationService.readInteger(scanner);
            if (choice == 0) break;
            MessageSender selectedSender = NotificationFactory.chooseSender(choice);
            
            if (selectedSender != null) {
                System.out.print("Message : ");
                String message = scanner.nextLine();
                service.send(selectedSender, message);
            } else {
                System.out.println("Choix invalide !");
            }
        }

        scanner.close();
    }


}
