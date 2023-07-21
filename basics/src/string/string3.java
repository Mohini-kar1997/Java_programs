package string;

public class string3 {

	public static void main(String[] args) {
		// differnce between == operator and .eqals method
		
		String s1=new String("java");
		String s2=new String("java");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2)); //true
		
		String s3="java";
		String s4="java";
		
		System.out.println(s3==s4);//true
		System.out.println(s3.equals(s4)); //true
		

	}

}
