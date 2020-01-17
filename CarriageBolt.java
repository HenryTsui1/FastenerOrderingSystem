import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {

	private static final long serialVersionUID = 8500910045217941315L;

	//Constructor for Carriage bolt
	public CarriageBolt(double length, Threads threadSz, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.BoltFinish> finish, double unitPrice,
			int numPerUnit) throws IllegalFastener {
		super(length, threadSz, material, finish, unitPrice, numPerUnit);
	}
	
	//toString method for Carriage bolt
	@Override
	public String toString() {
		return ("Carriage Bolt, " + super.toString());
	}
	

}