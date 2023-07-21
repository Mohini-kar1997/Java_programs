package array;

public class arrray7 {
	public static void main(String[] args) {
		
		char arr[][]= {{'a','b','c'},{'a','b','c'},{'a','b','c'}};
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		for(int row=0; row<arr.length;row++) {
			for(int col=0; col<arr[0].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

}
