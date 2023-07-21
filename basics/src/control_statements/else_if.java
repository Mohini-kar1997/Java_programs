package control_statements;

public class else_if {

	public static void main(String[] args) {

int marks=20;
         if(marks>=35) {
        	 System.out.println("pass");
         }
         else if(marks>=60) {
        	 System.out.println("first class");
         }
         else if(marks>=70) {
        	 System.out.println("distinction");
         }
         else if(marks>=80) {
        	 System.out.println("excellent");
         }
         else {
        	 System.out.println("fail");
         }

	}

}
