package string;

public class Stringmethod2 {

	public static void main(String[] args) {
		// replace=
		String s1="automatiom";
		System.out.println(s1.replace('a','A'));
		String s2="04 05 2030";
		System.out.println(s2.replace(' ','/')); //
		
		//replace all
		String s3="paython java cpp classes";
		System.out.println(s3.replaceAll("java","ruby"));
		System.out.println(s3.replaceAll("java cpp","hello"));
		System.out.println(s3.replaceAll(" ", ""));
		
		//Substring = returns substring for given string
		//starting index is included and ending index is excluded
		
		String s4="velocity classes";//0123456789
		System.out.println(s4.substring(4, 8));//from index 4 to 7
		System.out.println(s4.substring(0,4));// 0 to 3
		System.out.println(s4.substring(2));// from 2 all
	}

}
