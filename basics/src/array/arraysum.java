package array;

public class arraysum {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8};//sum=20
		System.out.println(arr.length);//4
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
 System.out.println(sum);
	}

}
