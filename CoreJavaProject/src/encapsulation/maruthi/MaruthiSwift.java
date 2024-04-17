package encapsulation.maruthi;

public class MaruthiSwift {
	private String engineWorking() {
		return "copyright engine of Maruthi working";
	}
	
	protected String style() {
		return "style of maruthi swift car";
	}
	
	String applyBrake() {
		return "ABS brakes applied";
	}
	
	public String accelerate() {
		System.out.println(engineWorking());
		return "Maruthi Swift car accelerated";
	}
	
	public String switchOn() {
		return "Maruthi Swift car switched on";
	}
	
	public String switchOff() {
		return "Maruthi Swift car switched off";
	}
	
}
