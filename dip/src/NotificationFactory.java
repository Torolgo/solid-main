public class NotificationFactory {
    public static MessageSender chooseSender(int choice){
        return switch (choice) {
            case 1 -> new EmailSender();
            case 2 -> new SmsSender();
            case 3 -> new PushNotificationSender();
            default -> null;
        };
    }
}
