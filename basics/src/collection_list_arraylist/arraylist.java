package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		int arr[]=new int[10]; // fixed size(static)+homogeneous data
		
		ArrayList al=new ArrayList();// dynamic size+homo and hetero data
		ArrayList<String> AL1=new ArrayList<String>(); // static arraylist -- stores only string type of data
		// 1. add method = to add elements in the arraylist
		AL1.add("mohini");
		// AL1.add(23); only take strig parameters
		al.add("welcome");
		al.add('b');
		al.add(23);
		al.add(2.4);
		al.add(true);
		al.add(null);
		al.add(30.4);
		al.add(400);
		al.add("mohini");
		al.add("patil");
		al.add("hi:");
		System.out.println(al);//prints the elements
		//2. size method
		System.out.println(al.size()); // size=11
		al.add(4000);
		al.add("test");
		System.out.println(al.size());//13
		//3.remove method
		al.remove(6); // take index as well as value
		al.remove("mohini");
		System.out.println(al);
		//4. insert new element
		al.add(20); // at the end of the arraylist --- that is it will append the list
		System.out.println(al);
		al.add(1,10); // add at particular index
		System.out.println(al);
		// retrive specific element
		// get - returns the element at specified position
		System.out.println(al.get(2));
		// replace or change element
		System.out.println(al.set(2, "mona"));
		System.out.println(al);
		al.set(1, "monaaa");
		System.out.println(al);
		System.out.println(al.isEmpty());// false
		System.out.println(AL1);
		AL1.remove(0);
		System.out.println(AL1.isEmpty());//true
		System.out.println(al);
		// read and print data from array list
		System.out.println("reading element using for loop");
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		// for each loop
		System.out.println("reading element using for each loop");
		for(Object obj: al) {
			System.out.println(obj);
		}
		System.out.println("reading the element uing iterator");
		Iterator k=al.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		

	}

}
