package this_super;

public class this1 {

	public static void main(String[] args) {
		//this keyword refers to the current object
		
		this1 t=new this1();     
		
		//t=refrence variable
		//t variable is assigned to refer the object
		
		//evry class has a unique reference number
		
		System.out.println(t);//@27f674d
		t.show();//@27f674d
		
        
		
	}
   public void show() {
	   System.out.println(this);//@27f674d
   }
}
