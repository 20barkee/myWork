package interfaces;

import java.util.ArrayList;

public class StudentandTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <TeacherAndStudentInterface> joe= new ArrayList <TeacherAndStudentInterface>();
		joe.add(new Teacheer());
		joe.add(new Teacheer());
		joe.add(new Student());
		joe.add(new Student());
		
		
		System.out.println("The names of all of the objects in the array list are:");
		for(TeacherAndStudentInterface temp: joe) {
			System.out.println(temp.getName());
			String NaMe=temp.getName();
			
			//if name is more than 10 charaters then outprint the age
			if(NaMe.length()>10) {
				System.out.println(temp.getAge());
				
			
			}
		}
		
		
		for(TeacherAndStudentInterface temp2: joe) {
			if(temp2 instanceof Student) {
				Student bob= (Student)temp2;
				
			}
		}
		for(TeacherAndStudentInterface bob: joe) {
		System.out.println(bob.getName());
	}

	for(TeacherAndStudentInterface temp:joe) {
		if(temp instanceof Teacheer) {
			Teacheer adult= (Teacheer)temp;
			adult.payMe();
		}
		

		}

	
for(TeacherAndStudentInterface temp3:joe) {
	if(temp3 instanceof Student) {
		Student child= (Student)temp3;
		System.out.println(child.getName());
	}
}
}
}
