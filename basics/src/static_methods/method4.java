package static_methods;

public class method4 {

	public static void main(String[] args) {
		student("mohini");
		student("karambalkar");
		method4 m=new method4();
		m.studinfo("belgaum", 2343);
		

	}
   public static void student(String name) {
	   System.out.println("name is--->"+name);
   }
   public void studinfo(String adress, int adhar) {
	   System.out.println(adress+" "+adhar);
   }
}
