package array;

public class duplicate_array {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,9,2,5};
		System.out.println("duplicate array");
		for (int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]+"is duplicate element in array");
					
				}
				
			}
		}
		

	}

}
