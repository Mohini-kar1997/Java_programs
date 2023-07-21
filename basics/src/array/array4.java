package array;

public class array4 {

	public static void main(String[] args) {
		boolean b1[]=new boolean[5];
		b1[0]=true;
		b1[1]=true;
		b1[2]=false;
		
		//b1[3] and[4] have not used so by default value false will print
		
		System.out.println(b1[1]);
		
		System.out.println();
		
		
		for(int i=0; i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
		
	}
}
