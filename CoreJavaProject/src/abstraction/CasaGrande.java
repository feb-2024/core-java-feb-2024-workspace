package abstraction;

public class CasaGrande implements SafetyGuidelines2021{

	@Override
	public void protectHead() {
		System.out.println("Casa Grande workers protect head using fibre helmet");
	}

	@Override
	public void protectFeet() {
		System.out.println("Casa Grande workers protect feet using metal shoes");
	}

}
