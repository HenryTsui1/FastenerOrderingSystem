import java.io.Serializable; 

// Supplied for your use in Assignment 4.

public final class Finishes implements Serializable {

	private static final long serialVersionUID = 3287198433875663480L;

	public enum ScrewFinish {Black_Phosphate, ACQ_1000_Hour, Lubricated, Zinc, Chrome};
	
	public enum BoltFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

	public enum WingNutFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};
	
	public enum CommonNailFinish {Bright, Hot_Dipped_Galvanized};
	
}