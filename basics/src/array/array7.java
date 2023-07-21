package array;

public class array7 {

	public static void main(String[] args) {
		String s1[]=new String[3];
		String s2[][]=new String[3][3];  //row and column
		
		System.out.println(s2.length);  // 3=rows
		System.out.println(s2[2].length); //columns=3
		
		s2[0][0]="a"; //first row
		s2[0][1]="b";
		s2[0][2]="c";
		
		System.out.println(s2[0][0]);
		
		s2[1][0]="a"; //second row
		s2[1][1]="b";
		s2[1][2]="c";
		
		System.out.println(s2[1][0]);
		
		s2[2][0]="a"; //second row
		s2[2][1]="b";
		s2[2][2]="c";
		
		System.out.println(s2[1][0]);
		
		for (int row=0; row<s2.length;row++) {
			for(int col=0;col<s2[2].length;col++) {
				System.out.print(s2[row][col]+ " ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
