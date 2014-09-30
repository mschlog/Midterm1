/*
 * Matthew Schlogel
 * Student Class
 * Midterm1
 */

public class Student extends Person {

	private int ClassStatus;
	
	public static String getClassStatus(int status){
		
	String Class;
	
	switch(status){
	case 1: Class = "Freshman";
		break;
		
	case 2: Class = "Sophomore";
		break;
		
	case 3: Class = "Junior";
		break;
		
	case 4: Class = "Senior";
		break;
	
	default: Class = "Invalid ClassStatus";
	}
	
	return Class;
}
	
    public Student(String name, String address, String phone, String email,int ClassStat)
    {
    	super(name,address,phone,email);
        this.ClassStatus = ClassStat;
    }

	
	
	public static void main(String[] args){
		System.out.println(getClassStatus(1));
		System.out.println(getClassStatus(2));
		System.out.println(getClassStatus(3));
		System.out.println(getClassStatus(4));
		System.out.println(getClassStatus(5));
	}
}

