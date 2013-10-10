package ie.gcd.universityAssignment;

/**
 * @author KillianOrmond
 *
 */

//Create an interface for grade average with a method that returns a double for
//the average and takes an integer for both the grade total and number of students.
public interface GPA {
	
	double calculateGPA(int gradeTotal, int numStudents);

}
