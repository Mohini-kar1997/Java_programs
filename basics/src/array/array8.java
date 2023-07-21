package array;

import java.util.Arrays;

public class array8 {

	public static void main(String[] args) {
		int d2[]= new int[7];
		d2[0]=3;
		System.out.println(d2[1]);//0 because it is not initialzed
		System.out.println(d2[0]);//3
		int d[]= {2,3,4,66,33,34};// we can declare like this also 
		System.out.println(d[2]);
		System.out.println(d[5]);
		System.out.println("length:" +d.length );
		
		System.out.println("array before sorting");
	
		for (int i=0; i<d.length;i++) {
			System.out.print(" " +d[i]);
		}
		
		System.out.println();
		
		System.out.println("array after sorting");
		Arrays.sort(d);
		
		for (int i=0; i<d.length;i++) {
			System.out.print(" "+d[i]);
		}
		
		
		

	}

}
