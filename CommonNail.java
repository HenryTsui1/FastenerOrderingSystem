import java.io.Serializable;

public class CommonNail extends Nail implements Serializable {

	private static final long serialVersionUID = -2966654611115274988L;
	
	//Constructor for Common Nail
	public CommonNail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length, NailDesigns.CommonNailGauges gauges,
			Finishes.CommonNailFinish finisher, double unitPrice, int numPerUnit) throws IllegalFastener {
		super(size, length, gauges, finisher, unitPrice, numPerUnit);
	}

	public String toString() {
		return ("Common nail, ") + super.toString();
	}
	

}
