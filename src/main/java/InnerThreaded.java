import java.io.Serializable;

public class InnerThreaded extends Fastener implements Serializable {

	private static final long serialVersionUID = 3607549653114217405L;

	private Threads thread;
 	
	//Constructor for InnerThread
	public InnerThreaded(Threads thread, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
		super(material, finish, unitPrice, numPerUnit);
		setThread(thread);
	}	
	
	//setter for thread size
	private void setThread(Threads thread) {
		this.thread = thread;
	}
	
	public String toString() {
		return((thread + " thread, ") + super.toString());
	}

}
