package collection_list_arraylist;
import java.time.Duration;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("mohini");
		al.add(23);
		al.add('s');
		al.add(789);
		System.out.println(al); // prints all elemets
		// addall
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println(al1); // copy the elements
		//remove all
		al1.removeAll(al);
		System.out.println(al1); // remove the copied element
		Collections.shuffle(al);
		System.out.println(al); // shuffle the elements
		
	}

}
