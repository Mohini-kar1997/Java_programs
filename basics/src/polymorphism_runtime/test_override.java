package polymorphism_runtime;

public class test_override {

	public static void main(String[] args) {
		father f1=new father();
		f1.car(); //maruti
		f1.house();//2bhk
		f1.money();//2000
		System.out.println();
		
		child c=new child(); // static poly---compile time poly
		c.bike();//fz -- overrided output
		c.car();//suzuki
		c.house();// 4 bhk
		
		System.out.println();
		
		father f=new child(); //dynamic poly-runtime poly--child class object can be referenced by parent class ref. variable
		f.car();//suzuki---overrided output
		f.house();// 4bhk
		f.money();//2000
		
	

	}

}
