package array;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		 char c1[]=new char[5]; //0 to 4
		 c1[0]='A';
		 c1[1]='C';
		 c1[2]='1';
		 c1[3]='3';
		 c1[4]='D';
		 
		// c1[5]='j'; // ArrayIndexOutOfBoundsException-jvm will throw exception
		 
		 System.out.println(c1.length);
		  for(int i=0; i<c1.length; i++) {  // printing as it is
			  System.out.println(c1[i]);
		  }
		  
		  System.out.println();
		  Arrays.sort(c1);
		  
		  System.out.println("array length" +c1.length);
		  for(int i=0; i<c1.length; i++) {  // printing sorted array
			  System.out.println(c1[i]);
		  }

	}

}
