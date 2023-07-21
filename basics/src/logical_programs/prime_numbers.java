package logical_programs;

import java.util.Scanner;

public class prime_numbers {

	public static void main(String[] args) {
		//prime number=greater than 1 and divide by 1 and itself
		//2,3,5,7,11...
		
		System.out.println("entr a number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int i;
		for(i=2;i<num;i++) 
			
			if(num%i==0)
				break;
		
		if(i==num)
			System.out.println("Prime number");
		
		else
			System.out.println("not a prime number");
	}

}
