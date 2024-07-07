package javase.oops;

/**
 * Built By SidduGanesh >javadoc Computer.java
 */

class Processor {

}

class Memory {

}

class Storage {

}

class SMPS {
	public void does() {
		System.out.println(
				"A switched-mode power supply (SMPS) is an electronic power supply system that uses a switching regulator to transfer electrical power efficiently. In a laptop, an SMPS transfers power from a DC or AC source to DC loads, such as the computer, while converting voltage and current characteristics. This higher power conversion efficiency is an important advantage of an SMPS. \r\n"
						+ "");
	}
}

class Motherboard {
	
	public void does() {
		System.out.println("A motherboard is the MAIN printed circuit board (PCB) in a computer. The motherboard is a computer's central communications backbone connectivity point, through which all components and external peripherals connect.");
	}
	//inner class (rarely used)
	class Chipset {

	}
}

class Monitor {
}

class Keyboard {
}

class Mouse {
}

class Speaker {
}

class Mic {
}

class Camera {
}

class CPUCabinet {
	Motherboard mb = new Motherboard();
	Processor p = new Processor();
	Memory m = new Memory();
	Storage s = new Storage();

}

abstract class Computer {
	public abstract void config();
}

//if in entire project this class is used only once, then you can make it as Anonymous inner class.
class AdvComputer extends Computer {
	public void config() {}
}

class Laptop extends Computer
{
	public void config() {}
}

public class Launch1 {
	public static void main(String[] args) {
		
		Computer c1 = new Computer() {//anonymous inner class (mostly used)
			public void config() {System.out.println("Normal Computer");}
		};
		c1.config();
		
	}
}
