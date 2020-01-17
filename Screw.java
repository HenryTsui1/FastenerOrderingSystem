import java.io.Serializable;

public class Screw extends Fastener implements Serializable {

	private static final long serialVersionUID = -3811487675711866453L;
	
	private Enum<?> screwHead; //head attribute for screw
	private Enum<?> screwDrive; //drive attribute for screw
	private Threads threadsize;
	private double length;
	
	//constructor for screw
	public Screw(double length, Threads threadsize,  Enum<?> material, Enum<?> finish, Enum<?> screwhead, Enum<?> screwDrive, 
			double unitPrice, int numPerUnit) throws IllegalFastener {
		super(material, finish, unitPrice, numPerUnit);
		setScrewHead(screwhead);
		setScrewDrive(screwDrive);
		setLength(length);
		setThread(threadsize);
	}

	//setter for head
	private void setScrewHead(Enum<?> screwhead) {
		this.screwHead = screwhead;
	}
	
	//setter for drive
	private void setScrewDrive(Enum<?> screwDrive) {
		this.screwDrive = screwDrive;
	}
	
	private void setLength(double length) {
		this.length = length;
	}
	
	private void setThread(Threads threadsize) {
		this.threadsize = threadsize;
	}
	
	public String toString() {
		return(", " + screwHead + "head, " + screwDrive + " drive, " + length + "\" long, " + threadsize + " thread, " + super.toString());
			
	}
	
}
