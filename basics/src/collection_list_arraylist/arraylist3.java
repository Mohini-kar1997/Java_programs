package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist3 {

	public static void main(String[] args) {
		
		        ArrayList d=new ArrayList();
		        d.add('g');
		        d.add('o');
		        d.add('j');
		        Collections.sort(d);  // sort the elements
		        // if elements are of different datatypes and we try to sort it then it will throw classcast exception
		System.out.println(d);
		Collections.shuffle(d);
		System.out.println(d);

	}

}
