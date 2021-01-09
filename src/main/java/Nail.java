import java.io.Serializable;

public class Nail extends Fastener implements Serializable {

	private static final long serialVersionUID = -2930366514267005087L;

	private NailDesigns.CommonNailSizes size;
	private NailDesigns.CommonNailLengths length;
	private NailDesigns.CommonNailGauges gauges;
	
	//Constructor for nail
	public Nail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length,
			NailDesigns.CommonNailGauges gauges, Finishes.CommonNailFinish finisher, double unitPrice, int numPerUnit) throws IllegalFastener {
		super(Materials.NailMaterials.Steel, finisher, unitPrice, numPerUnit);
		setSize(size);
		setLength(length);
		setGuage(gauges);
	}
	
	//setter for size from NailDesigns
	private void setSize(NailDesigns.CommonNailSizes size) throws IllegalFastener {
		String sizeString = size.toString();
		if(sizeString == null) throw new IllegalFastener("Illegal size"); //if null throws IllegalFastener exception
		this.size = size;
	}
	
	//setter for length from NailDesigns
	private void setLength(NailDesigns.CommonNailLengths length) { //sets the length
		this.length = length;
	}
	
	//setter for gauge from NailDesigns
	private void setGuage(NailDesigns.CommonNailGauges gauges){ //sets the gauge
		this.gauges = gauges;
	}
	
	//toString to print out the strings
	public String toString() { 
		return ((size.toString() + "size, " + this.length + "\" long " + this.gauges + " gauge, ") + super.toString());
	}
}
