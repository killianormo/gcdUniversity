package ie.gcd.universityAssignment;


/**
 * @author KillianOrmond
 *
 */

public class Lecturer extends Person implements GPA {
	
	//Declare variables for the lecturer that are in addition to the 'Person' class.
	private String department = "";
	private String staffNum = "";
	private int startYear = 0;

	
	/**
	 * Returns the lecturer's department. 
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the lecturer's department.
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Returns the lecturer's staff number. 
	 * @return staffNum
	 */
	public String getStaffNum() {
		return staffNum;
	}

	/**
	 * Sets the lecturer's staff number.
	 * @param staffNum
	 */
	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}

	/**
	 * Returns the lecturer's start year.	
	 * @return
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * Sets the lecturer's start year.
	 * @param startYear
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * Custom constructor for an instance of 'Lecturer'
	 * @param name
	 * @param address
	 * @param gender
	 * @param department
	 * @param staffNum
	 */
	public Lecturer(String name, String address, String gender, String department, String staffNum) {
		super(name, address, gender);
		setDepartment(department);
		setStaffNum(staffNum);
		
	}
	
	@Override
	//Overrides the parent completion year method.
	public int completionYear() {
		//Get a substring of the Staff Number and take the first two characters.
		String subStaffNum = getStaffNum().substring(0, 2);
		//Parse the substring to an integer.
		int decInt = Integer.parseInt(subStaffNum);
		//Use the get year method, add 65 and subtract the first two 
		//digits of the staff number to get the completion year. 
		int completeYear = getYear()+65-decInt;
		return completeYear;
	}

	@Override
	public void name() {
				
	}

	@Override
	public void address() {
				
	}

	@Override
	public void gender() {
		
	}
	
	//Override the method that converts the elements of the person class to a string for the professor.
	public String toString(){
		int completionYear = completionYear();
		String person = "Details for the lecturer are:\nName: \t\t\t"+name+"\nAddress: \t\t"+address
				+"\nGender: \t\t"+gender+"\nDepartment: \t\t"+department+"\nStaff Number: \t\t"+staffNum
				+"\nCompletion Year: \t"+completionYear;
		return person;
	}

	@Override
	//Method to calculate the grade average of the students of an instance of a lecturer.
	public double calculateGPA(int gradeTotal, int numStudents) {
		double average = gradeTotal/numStudents;
		return average;
	}
	
	
}
