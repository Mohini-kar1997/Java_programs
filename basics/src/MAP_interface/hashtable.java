package MAP_interface;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm =new Hashtable<>();
		
		//Constructs a new, empty hashtable with a default initial capacity (11) and load factor (0.75).
		
		hm.put(107, "mohini");
		hm.put(102, "david");
	//	hm.put(108, null); NullPointerException
//	 hm.put(null, "neha");NullPointerException
		
		hm.put(108, "mohi");
		hm.put(110, "dad");
		
		
		System.out.println(hm);
		System.out.println(hm.remove(110));
		System.out.println(hm);
		System.out.println(hm.containsKey(107));//true
		
		System.out.println(hm.containsKey(110));//false
		
		System.out.println(hm.containsValue("mohini"));//true
		
		System.out.println(hm.containsValue("abhi"));//false
		
		System.out.println(hm.isEmpty());//false
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		for(Object obj1:hm.keySet()) {
			System.out.println(obj1+" "+hm.get(obj1)); //iterate through all keys and all values
		}
	}

}
