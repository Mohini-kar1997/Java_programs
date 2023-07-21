package encapsulation;

public class empdata {

	public static void main(String[] args) {
		employeedata ed=new employeedata();
		
		ed.setidnumber(123);
		ed.setempname("abhi");
		ed.setage(28);
		
		System.out.println(ed.getidnumber());
		System.out.println(ed.getempname());
		System.out.println(ed.getage());

	}

}
