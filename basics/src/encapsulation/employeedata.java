package encapsulation;

import this_super.this1;

public class employeedata {
	//encapsulation
	//private data members can not access outside the class directly
	
	private int IDnumber;
	private String  empname ;
	private int age;
	public static void main(String[] args) {
		employeedata ed=new employeedata();
		ed.setidnumber(1234);
		ed.setempname("mohini");
		ed.setage(25);
		
		System.out.println(ed.getidnumber());
		System.out.println(ed.getempname());
		System.out.println(ed.getage());
		
		ed.setidnumber(1567);
		System.out.println(ed.getidnumber());
		
		

	}
	
	//getter and setter methods to get and set values of the feilds
	public int getidnumber() {
		return IDnumber;
		
	}
public void setidnumber(int IDnumber) {
	this.IDnumber=IDnumber;
		
	}
public String getempname() {
	return empname;
	
	
}
public void setempname(String empname) {
	this.empname=empname;
	
}
public int getage() {
	return age;
	
}
public void setage(int age) {
	this.age=age;
	
}

}
