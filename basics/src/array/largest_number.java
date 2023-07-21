package array;

public class largest_number {

	public static void main(String[] args) {
		int arr[]= {3,5,878,333,74};
		int max=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
				
			}
		}
		System.out.println("largest number is-->" +max);

	}

}
