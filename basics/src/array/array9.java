package array;

public class array9 {
	public static void main(String[] args) {
		
		int a[]	= {2,3,4}; //size=3
		System.out.println(a.length);//3
		
		int b[][]= {{2,3,4},{3,5,7},{7,8,9},{4,5,7}};//4*3
		
		System.out.println("length of two diamensional array-->" +b.length);//4
		System.out.println("length of column-->" +b[0].length);//3
        
		System.out.println(b[2][2]);//9
		System.out.println(b[3][2]); //7
		
		for(int i=0; i<b.length; i++) {
			for (int j=0; j<b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
}
}
