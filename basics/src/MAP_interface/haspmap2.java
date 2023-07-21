package MAP_interface;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;

public class haspmap2 {

	public static void main(String[] args) {
HashMap<Integer, String> hm =new HashMap<Integer, String>(); //first way
		
		
		
		hm.put(107, "mohini");
		hm.put(102, "david");
		hm.put(120, "rahul");
		hm.put(104, "neha");
		hm.put(104,"mohini");
		hm.put(104,"mayuri"); //duplicate keys are not allowed it ovrides the previous values
		hm.put(105,"mohini"); //duplicate values are allowed
		hm.put(109,null);
		hm.put(119,null); //multiple null values allowed
		
		
		hm.put(null, "abhi"); //null key allowed only once not more than one
		hm.put(null, "abhishree");
		
		
		System.out.println(hm);

	}

}
