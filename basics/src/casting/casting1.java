package casting;

public class casting1 {

	public static void main(String[] args) {
		//numeric+nonDecimal= byte(1byte), short(2byte), int(4byte), long(8byte)
		//numeric+decimal=float(4byte), double(8byte)
		//implicit casting--> lower datatype to higher datatype
		int number=100;// size=4byte
		System.out.println(number);//100
		long l=number;
		System.out.println(l);//100(data in long)
		int num=50;
		System.out.println(num);//50
		float f=num;
		System.out.println(f);//50.0
		int a=20;
		System.out.println(a);//20
		double d=a;
		System.out.println(d);//20.0
		 // int ---> long, float, double
		// byte, short--->int
		byte b=1;
		System.out.println(b);
		float a1=b;
		System.out.println(a1);
		
		
		
	}

}
