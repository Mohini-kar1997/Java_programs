package wrapper_class;

public class class3 {

	public static void main(String[] args) {
		String s1="200.00";
		String s2="400.50";
		
		System.out.println(s1+s2);
//		
//		int value1=Integer.parseInt(s1);
//		int value2=Integer.parseInt(s2); NumberFormatException because s1 dont have any integer representation it has float value
		
		double d1 =Double.parseDouble(s1);
		double d2 =Double.parseDouble(s2);
		
		System.out.println(d1+d2);

	}

}
