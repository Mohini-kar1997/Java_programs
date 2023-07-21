package Interface;

public class testclass {

	public static void main(String[] args) {
		// calculator c1=new calculator---no
		//casio c2=new casio();---no ---in interface we cannot create object
		
		advancedcalculator ac=new advancedcalculator();
		ac.addition();
		ac.addition(5);
		ac.substraction();
		ac.multi();
		ac.log();
		ac.tan();
		ac.sin();
		ac.cos();
		System.out.println();
		
		calculator c1=new advancedcalculator();
		c1.addition();
		c1.substraction();
		c1.multi();
		System.out.println();
		casio c2=new advancedcalculator();
		c2.log();
		c2.tan();
		c2.addition();

	}

}
