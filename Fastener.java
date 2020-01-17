 import java.io.Serializable;

public class Fastener implements Serializable {

	private static final long serialVersionUID = -2088928842456670824L;
	
	public Enum<?> material; //material attribute, enum
	public Enum<?> finish; //finish attribute, enum
	private double unitPrice;
	private int numPerUnit;
	
	//Fastener constructor
	public Fastener(Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
		if (material.toString().equals("Steel")) { 	
		}
		if (material.toString() == "Brass" && finish.toString() != "Plain") { //looking at illegal combinations of Fastener
            throw new IllegalFastener(("Illegal Material/Finish combination."));
        }
        if (material.toString() == "Stainless_Steel" && finish.toString() != "Plain") {
            throw new IllegalFastener(("Illegal Material/Finish combination."));
        }
		setMaterial(material);
		setFinish(finish);
		setUnitPrice(unitPrice);
		setnumPerUnit(numPerUnit);
		}
	
	//sets the material
	private void setMaterial(Enum<?> material) throws IllegalFastener {
		String materialString = material.name();
		if(materialString.matches("Brass|Stainless_Steel|Steel")) this.material = material; //checking to see if material is legal
		else throw new IllegalFastener("Illegal material: " + materialString);
	}
	
	 //sets the finish
	private void setFinish(Enum<?> finish) throws IllegalFastener {
		if(finish == null) throw new IllegalFastener("Illegal finish: " + finish);
		this.finish = finish;
	}
	
	//setter for unit price
	private void setUnitPrice(double up) throws IllegalFastener {
		if(up <= 0) throw new IllegalFastener("Illegal price: " + up); //checking illegal prices
		this.unitPrice = up;
	}
		
	 //setter for number per unit
	private void setnumPerUnit(int numPUnit) throws IllegalFastener {
		if(numPUnit > 1 && numPUnit < 10000) this.numPerUnit = numPUnit;
		else throw new IllegalFastener("Illegal amount: " + numPUnit); //checking for legal number of units
	}
	
	//returns the unit price multiplied by number of order
	public double getOrderCost(double order) {
		return this.unitPrice * order;
	}
	
	//toString method for outputting the description
    @Override
	public String toString() {
    	return (this.material + ", with a " + this.finish + " finish. " + this.numPerUnit + " in a unit, $" + this.unitPrice + " per unit." );
	}
}
