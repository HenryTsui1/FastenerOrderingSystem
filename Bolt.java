import java.io.Serializable;

public class Bolt extends Fastener implements Serializable{
	
	private static final long serialVersionUID = -6880426174081090946L;
	
	private double length;
	private Threads thread;

	//Constructor for Bolt
    public Bolt(double length, Threads threadsize, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.BoltFinish> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
		super(material, finish, unitPrice, numPerUnit); //parameters from Fastener.class
		setLength(length);
		setThreads(threadsize);
	}
    
    //Checking the length attribute to see if it's valid
    public void setLength(double length) throws IllegalFastener {
    	if(length > 0.5 && length < 6.0 && length % 0.25 == 0) this.length = length; //ranges from 0.5" to 6.0", intervals of 0.25"
  
    	else if(length > 6.0 && length < 11.0 && length % 0.5 == 0) this.length = length;
    	
    	else if(length > 11.0 && length < 20.0 && length % 1.0 == 0) this.length = length;
    	
    	else throw new IllegalFastener("Illegal Length: " + length);
    	
    }
    
    //sets the Thread size
    public void setThreads(Threads threadsize) throws IllegalFastener {
    	if(threadsize != null) this.thread = threadsize; //I'm not sure why it's outputting as null
    	else throw new IllegalFastener("Illegal Thread Size: " + threadsize);
    }
    
    @Override
    public String toString() {
    	return (this.length + "\" long, " + this.thread + " thread, ") + super.toString();
    }
    
}