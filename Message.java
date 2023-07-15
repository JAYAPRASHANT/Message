package MessageProb;
interface MessagingService {
    void sendMessage(String message);
}

class SMSMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
        // Implementation specific to sending an SMS message
    }
}

class EmailMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
        // Implementation specific to sending an email message
    }
}

class WhatsAppMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message: " + message);
        // Implementation specific to sending a WhatsApp message
    }
}



public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		 MessagingService smsService = new SMSMessagingService();
	        smsService.sendMessage("Hello, this is an SMS message!");

	        MessagingService emailService = new EmailMessagingService();
	        emailService.sendMessage("Hello, this is an email message!");

	        MessagingService whatsappService = new WhatsAppMessagingService();
	        whatsappService.sendMessage("Hello, this is a WhatsApp message!");

	}

}
