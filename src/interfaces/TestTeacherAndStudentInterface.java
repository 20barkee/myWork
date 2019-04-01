package interfaces;

public class TestTeacherAndStudentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
	Teacheer fred= new Teacheer();
	Student joe= new Student();
	
	String teacherName= "Mrs. Williams";
	fred.setName(teacherName);
	fred.payMe();
	
	String studentName="John Doe";
	joe.setName(studentName);
	joe.outSick();
	joe.outSick();
	joe.outSick();
	
	TeacherAndStudentInterface bob= fred;
	
	System.out.println("Name of teacher: " + bob.getName());
	System.out.println("Age of teacher: "+ bob.getAge());
	
	//bob= new Student();
	//teacher object die
	
	bob= joe;
	
	System.out.println("Name of the student: " + bob.getName());
	System.out.println("Age of the student: "+ bob.getAge());

	}

}
