package MAP_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm =new HashMap<Integer, String>(); //first way
		
		HashMap h=new HashMap();//second way
		
		hm.put(107, "mohini");
		hm.put(102, "david");
		hm.put(120, "rahul");
		hm.put(104, "neha");
		hm.put(105, "mayuri");
		hm.put(100, "pradeep");
		
		System.out.println(hm); //randomly prints not according as per we have entered or serial wise
		
		System.out.println(hm.get(107)); //mohini
		
		System.out.println(hm.containsKey(107)); //true
		
		System.out.println(hm.containsKey(99)); //false because key is not present
		
		System.out.println(hm.containsValue("mohini")); //true
		
		System.out.println(hm.containsValue("surekha")); //false
		
		System.out.println(hm.isEmpty());//false
		
		System.out.println(h.isEmpty()); //true
		
		System.out.println(hm.keySet()); //prints all keys
		
		System.out.println(hm.values()); //prints all values
		
		for(Object obj:hm.keySet()) {
			System.out.println(obj); //iterate through all keys
		}
		
		for(Object obj:hm.values()) {
			System.out.println(obj); //iterate through all values
		}
		
		for(Object obj1:hm.keySet()) {
			System.out.println(obj1+" "+hm.get(obj1)); //iterate through all keys and all values
		}
		
		//entery method
		System.out.println("*****");
		for(Map.Entry entry: hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("********");
		
		//iterator
		
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			Map.Entry entry=(Entry) i.next();	
			System.out.println(entry.getKey()+" "+entry.getValue());}
		
		

	}

}
