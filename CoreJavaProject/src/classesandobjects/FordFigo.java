package classesandobjects;

public class FordFigo {
	String modelName;
	String color;
	String carNumber;
	
	public FordFigo(String modelName, String color) {
		this.modelName = modelName;
		this.color = color;
	}
	
	public String switchOn() {
		return modelName + " is switched on!";
	}
	
	public String accelerate() {
		return modelName + " accelerated!";
	}
	
	public String applyBrake() {
		return modelName + " applied manual brakes!";
	}
	
	public String switchOff() {
		return modelName + " is switched off!";
	}
}
