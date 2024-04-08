package classesandobjects;

public class FordDemo {

	public static void main(String[] args) {
		FordFigo figo1 = new FordFigo("FIGO", "silver");
		System.out.println(figo1.switchOn());
		System.out.println(figo1.accelerate());
		System.out.println(figo1.applyBrake());
		System.out.println(figo1.switchOff());
		
		System.out.println("-----------------------");
		
		FordFigoTitanium tita1 = new FordFigoTitanium("TITANIUM", "black", 4);
		System.out.println(tita1.switchOn());
		System.out.println(tita1.accelerate());
		System.out.println(tita1.applyBrake());
		System.out.println(tita1.ejectAirbags());
		System.out.println(tita1.switchOff());
	}
}
