package string;

public class stringmethod3 {

	public static void main(String[] args) {
		//index of
		String s1="python ruby python";
		System.out.println(s1.indexOf('y'));//1 = always first occurance
		System.out.println(s1.indexOf('t', s1.indexOf('t')+1)); // 2nd occurance
		System.out.println(s1.indexOf('y', s1.indexOf('y', s1.indexOf('y')+1)+1));//3rd occurance
		
		//last index of
		String s2="python";
		System.out.println(s2.lastIndexOf('o'));
		
		//tolowercase
		
		String s3="WELCOME";
		System.out.println(s3.toLowerCase());
		
		String s4="welcome";
		System.out.println(s4.toUpperCase());
		
	    //trim=remove beg and ending space of string
		
		String s5=" python ruty pythin  ";
		System.out.println(s5.trim());
		
		//split
		String s15="hello/world/test/java";
		String s17[]=s15.split("/");
		
		for(int i=0; i<s17.length;i++) {
			System.out.print(s17[i]);
		}
		
		String date="3-4-3030";
		String date1[]=date.split("-");
		for(int j=0; j<date1.length;j++) {
			System.out.print(date1[j]);
		}
		
		
				

	}

}
