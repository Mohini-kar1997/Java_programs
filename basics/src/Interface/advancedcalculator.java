package Interface;

public class advancedcalculator implements calculator,casio { //implementation class

	@Override
	public void log() {
System.out.println("log method");
		
	}

	@Override
	public void tan() {
		System.out.println("tan methid");
		
	}

	@Override
	public void addition() {
		System.out.println("addition method");
		
	}
	public void addition(int i) {
		System.out.println("addition method");
	}

	@Override
	public void substraction() {
		System.out.println("substraction");
		
	}

	@Override
	public void multi() {
		System.out.println("multiplication");
		
	}
	
	public void sin() {
		System.out.println("sin method");
	}
	public void cos() {
		System.out.println("cos method");
	}

}
