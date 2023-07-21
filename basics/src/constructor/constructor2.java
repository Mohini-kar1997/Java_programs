package constructor;

public class constructor2 {
	//variable decalaration for addition
		int N1;//global or instance variable
		int N2;
		int N3;
		
		
		public constructor2(int N1, int b) { //two input 
			N2=b;
			this.N1=N1;
			
		}
		
		public constructor2(int a, int b, int c) { //three input
			N1=a;
			N2=b;
			N3=c;
			
		}
		
		public void multi() {
			int multiplication=N1*N2*N3;
			System.out.println(multiplication);
		}
		
		public void add() {
			int add=N1+N2;
			System.out.println(add);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor2 s1=new constructor2(2,3,4);
		s1.multi();
		s1.add();
		constructor2 s2=new constructor2(2,3);
		s2.multi();
		s2.add();

	}

}
