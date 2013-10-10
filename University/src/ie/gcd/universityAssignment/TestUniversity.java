package ie.gcd.universityAssignment;

import java.util.ArrayList;


public class TestUniversity {

	public static void main(String[] args){
	//Create an array list of students in order to store the 
	//details when calculating the grade average.
	ArrayList<Student> students = new ArrayList<Student>();
	Student s1 = new Student("Killian Ormond", "Dublin 8", "Male", "2840965", "OOD", 2);
	students.add(s1);
	Student s2 = new Student("John Smith", "Dublin 7", "Male", "2480755", "OOD", 3);
	students.add(s2);
	Student s3 = new Student("Sarah Murphy", "Dublin 6", "Female", "2387080", "GUI", 2);
	students.add(s3);
	
	//Print out the details of each student using the toString method.
	//Use the 'grades' method from the 'Student' class to assign grades.
	int grades1 = s1.grades();
	System.out.println(s1.toString()+"\nThe grade for "+s1.getStudSubject()+" is:\t"+grades1+"%: "+s1.gradeLevel(grades1));
	int grades2 = s2.grades();
	System.out.println("\n"+s2.toString()+"\nThe grade for "+s2.getStudSubject()+" is:\t"+grades2+"%: "+s1.gradeLevel(grades2));
	int grades3 = s3.grades();
	System.out.println("\n"+s3.toString()+"\nThe grade for "+s3.getStudSubject()+" is:\t"+grades3+"%: "+s1.gradeLevel(grades3));
	
	//Create an instance of a 'Lecturer' and assign it values.
	Lecturer l1 = new Lecturer("David Hughes", "Dublin", "Male", "Computer Science", "350045");

	//Print the dertails of the lecturer using the toString method.
	System.out.println("\n"+l1.toString());
	
	//Calculate the average grade given by the Lecturer using the calculteGPA method.
	//Use the ArrayList of students to get the total number of students.
	int numStudents = students.size();
	int gradeTotal = s1.grades()+s2.grades()+s3.grades();
	double GPA = l1.calculateGPA(gradeTotal, numStudents);
	
	//Print the lecturer's class average.
	System.out.println("\n"+l1.getName()+"'s class average grade is:\t"+GPA+"%");
	
	}

		
}
