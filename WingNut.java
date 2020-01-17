import java.io.Serializable;

public class WingNut extends Nut implements Serializable {

	private static final long serialVersionUID = -2893771542792758917L;

	//constructor for wing nut
	public WingNut(Threads thread, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit)
			throws IllegalFastener {
		super(thread, material, finish, unitPrice, numPerUnit);
	}
	
	public String toString() {
		return ("Wing nut, " + super.toString());
	}

}
