public class IllegalFastener extends Exception{

	private static final long serialVersionUID = -6710281488489204911L;

	// Supplies a default message.
	public IllegalFastener() {
		super("Illegal attributes for fastener object");
	}
	
	//supplies messages from parameter
	public IllegalFastener(String message) {
		super(message);
	}
}
