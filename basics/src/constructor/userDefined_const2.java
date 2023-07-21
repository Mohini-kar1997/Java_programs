package constructor;

public class userDefined_const2 {
    String name;
    String Model;
    int price;
    String engin;
    
    public userDefined_const2(String name1, String model, int price1, String engin1) {
    	name=name1;
    	Model=model;
    	price=price1;
    	engin=engin1;
    	
    	
    //	this.name=name;
    	//this.Model=Model;
    	//this.price=price;
    	//this.engin=engin;
    	
    }
    
	public static void main(String[] args) {
		userDefined_const2 u=new userDefined_const2 ("honda","city",1299999,"manual");
		userDefined_const2 u1=new userDefined_const2 ("hona","cgity",16299999,"manual");
		
		System.out.println(u.name+" "+u.Model+" "+u.price+" "+u.engin);
		System.out.println(u1.name+" "+u1.Model+" "+u1.price+" "+u1.engin);
		

	}

}
