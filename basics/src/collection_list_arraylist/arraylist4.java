package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist4 {

	public static void main(String[] args) {
		String arr[]= {"mohini", "isha", "tilo"};
		//System.out.println(arr);
		 for (String n:arr)
		 {
			 System.out.println(n);
		 }
		 //convert array to arraylist
		 ArrayList al=new ArrayList(Arrays.asList(arr));
		 System.out.println(al);

	}

}
