package array;

import java.lang.reflect.Array;

public class array6 {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		
		obj[0]=10;
		obj[1]="mohini";
		obj[2]=10.2f;
		obj[3]=true;
		obj[4]='a';
		
		
		for(int i=0; i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		

	}

}
