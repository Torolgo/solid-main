public class NotificationService {

    public void send(MessageSender sender, String message) {
        sender.sendMessage(message);
    }
}
