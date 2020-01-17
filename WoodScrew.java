import java.io.Serializable;

public class WoodScrew extends Screw implements Serializable{
	
	private static final long serialVersionUID = -3351214011235448141L;
	private Enum<?> screwPoint; //attribute point for wood screw, point is only unique to wood screw
	
	//constructor for wood screw
	public WoodScrew(double length, Threads threadsize, Enum<?> material, Enum<?> finish, Enum<?> screwHead,
			Enum<?> screwDrive, Enum<?> screwPoint, double unitPrice, int numPerUnit) throws IllegalFastener {
		super(length, threadsize, material, finish, screwHead, screwDrive, unitPrice, numPerUnit);
		setPoint(screwPoint);
	}
	
	//setter for point of wood screw
	private void setPoint(Enum<?> screwPoint) {
		this.screwPoint = screwPoint;
	}
	
	public String toString() {
		return ("Wood screw, " + screwPoint + " point") + super.toString();
	}
}
