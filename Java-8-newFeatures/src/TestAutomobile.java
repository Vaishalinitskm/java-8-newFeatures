import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Automobile {

	@Override
	public boolean equals(Object aThat) {
		if (this == aThat)
			return true;
		if (!(aThat instanceof Automobile))
			return false;
		Automobile that = (Automobile) aThat;
		for (int i = 0; i < this.getSigFields().length; ++i) {
			if (!Objects.equals(this.getSigFields()[i], that.getSigFields()[i])) {
				return false;
			}
		}
		return true;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(getSigFields());
//	}

	// ..elided

	// PRIVATE

	String name;
	private Integer numDoors;
	private List<String> options;
	private BigDecimal gasMileage;
	private String color;
	private List<LocalDate> maintenanceChecks;

	private Object[] getSigFields() {
		Object[] result = { name, numDoors, options, gasMileage, color, maintenanceChecks };
		return result;
	}

	public Automobile(String name, Integer numDoors, List<String> options, BigDecimal gasMileage, String color,
			List<LocalDate> maintenanceChecks) {
		super();
		this.name = name;
		this.numDoors = numDoors;
		this.options = options;
		this.gasMileage = gasMileage;
		this.color = color;
		this.maintenanceChecks = maintenanceChecks;
	}
	
}

public class TestAutomobile {
	
	public static void main(String args[]) {
		  List<String> optionsList1 = new ArrayList<>();
		  optionsList1.add("op1");
		  
		  List<String> optionsList2 = new ArrayList<>();
		  optionsList2.add("op1");
		  Automobile a1 = new Automobile("Auto1", new Integer(2), optionsList1,
				  new BigDecimal(23.5),"blue", null);
		  
		  Automobile b1 = new Automobile("Auto1", new Integer(2), optionsList2,
				  new BigDecimal(23.5),"blue", null);
		  
		  System.out.println(a1.hashCode());
		  System.out.println(b1.hashCode());
		  System.out.println(a1);
		  System.out.println(b1);
		  System.out.println(a1 == b1);
		  System.out.println(a1.equals(b1));
		  
		  System.out.println("--------------");
		  String str = "23";
		  String str1 = "23";
		  
		  String str2 = new String("22");
		  
		  System.out.println(str == str1);
		  System.out.println(str == str2);
		  System.out.println(System.identityHashCode(str));
		  System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
		  System.out.println(str.hashCode());
		  System.out.println(str1.hashCode());
		  System.out.println(str2.hashCode());
		  System.out.println(str.equals(str1));
		  System.out.println(str.equals(str2));
	  }
}
