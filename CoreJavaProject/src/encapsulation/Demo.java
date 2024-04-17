package encapsulation;

import encapsulation.maruthi.MaruthiSwift;

public class Demo {

	public static void main(String[] args) {
		MaruthiSwift maruthiSwift = new MaruthiSwift();
		maruthiSwift.switchOn();
		maruthiSwift.accelerate();
		//maruthiSwift.engineWorking(); // cannot access because it is private
		//maruthiSwift.style(); // cannot access because it is protected
		//maruthiSwift.applyBrake(); // cannot access because applyBrake is defuult
		maruthiSwift.switchOff();
		

	}

}
