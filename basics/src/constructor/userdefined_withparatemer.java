package constructor;

public class userdefined_withparatemer {
	
	String Name;
	int Class;
	char grade;
	float percentage; // variable declaration
	
	
	String Name1;
	
	public userdefined_withparatemer(String Name, int Class, char grade, float percentage) {//4 input
		this.Name=Name;
		this.Class=Class;
		this.grade=grade;
		this.percentage=percentage;
	}
	
	public userdefined_withparatemer(String Name1) {
		this.Name1=Name1;
	}
	
	//methods
	public void student() {
		String name12=Name1;
		System.out.println(name12);
	}
	

	public static void main(String[] args) {
		userdefined_withparatemer s1=new userdefined_withparatemer("mohini",10,'A',88.97f);
		userdefined_withparatemer s2=new userdefined_withparatemer("neha",10,'A',78.97f);
		userdefined_withparatemer s3=new userdefined_withparatemer("mayuri",9,'B',38.97f);
		
		
		System.out.println(s1.Name+" "+s1.Class);
		System.out.println(s2.Name+" "+s2.Class);
		System.out.println(s3.Name+" "+s3.Class);
		
		userdefined_withparatemer s4=new userdefined_withparatemer("isha");
		s4.student();
		
		
		

	}

}
