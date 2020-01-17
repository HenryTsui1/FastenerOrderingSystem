import java.io.Serializable;

public class Nut extends InnerThreaded implements Serializable {

	private static final long serialVersionUID = 6914530223394617092L;

	public Nut(Threads thread, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit)
			throws IllegalFastener {
		super(thread, material, finish, unitPrice, numPerUnit);
	}
	
	public String toString() {
		return super.toString();
	}

}
