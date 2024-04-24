package Day4;


	public class Overloading{
	    // Overloaded sendMessage method for sending text messages
	    public void sendMessage(String recipient, String message) {
	        System.out.println("Sending text message to " + recipient + ": " + message);
	    }

	    // Overloaded sendMessage method for sending media messages
	    public void sendMessage(String recipient, String mediaType, String mediaContent) {
	        System.out.println("Sending " + mediaType + " message to " + recipient + ": " + mediaContent);
	    }

	    // Overloaded sendMessage method for sending voice messages
	    public void sendMessage(String recipient, int durationInSeconds) {
	        System.out.println("Sending voice message to " + recipient + " with duration " + durationInSeconds + " seconds");
	    }

	    public static void main(String[] args) {
	        // Creating an object of Whatsapp class
	    	Overloading whatsapp = new Overloading();

	        // Sending text message
	        whatsapp.sendMessage("John", "Hello there!");

	        // Sending media message
	        whatsapp.sendMessage("Alice", "Image", "image123.jpg");

	        // Sending voice message
	        whatsapp.sendMessage("Bob", 30);
	    }
	}



