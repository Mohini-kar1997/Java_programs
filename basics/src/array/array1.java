package array;

public class array1 {

	public static void main(String[] args) {
		//int i1=10;  variable intialization
		//System.out.println(i1);  10 
		
		
		//syntax-
		//datatype arrayname[]=new datatype[size of array]
		
		int arr[]=new int[5]; //array declaration
		
		// array initialization
		// arrayname[index number]=value;
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		// arr[7]=100; java.lang.ArrayIndexOutOfBoundsException: 
		
		
		//array usage
		System.out.println(arr.length);
		System.out.println(arr[2]); //30
		System.out.println(arr[4]); //50
	//	System.out.println(arr[6]); //java.lang.ArrayIndexOutOfBoundsException: 
		
		
		for( int i=0; i<=arr.length-1;i++) { //or for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
		}
		
				
		
		
		
		
		

	}

}
