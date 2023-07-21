package array;

public class array3 {

	public static void main(String[] args) {
		// String str[]=new String[-2];  NegativeArraySizeException
		
		String str[]=new String[4];
		
		str[0]="mohii";
		str[1]="isha";
		str[3]="#$%^&";
		 // str[4]="velocity"; arrayout of bout
		
		System.out.println(str[2]); //null
		
		System.out.println(str.length);
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		

	}

}
