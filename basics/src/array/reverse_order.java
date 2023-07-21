package array;

public class reverse_order {

	public static void main(String[] args) {
		int arr[]= {2,4,7,9,4,5,};
		System.out.println(arr.length); //5
		System.out.println("original array");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("reverse array:");
		for(int j=arr.length-1; j>=0;j--) {
			System.out.print(arr[j]);
		}

	}

}
