package encapsulation.maruthisuzuki;

import encapsulation.maruthi.MaruthiSwift;

public class MaruthiSuzukiDezire extends MaruthiSwift{

	public String enhancedDesign() {
		//engineWorking(); // cannot access as it is private
		System.out.println(style()); // can access style because it is protected
		return "Enhanced style of Maruthi Suzuku Dezire";
	}
}
