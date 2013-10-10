package ie.gcd.universityAssignment;

/**
 * @author KillianOrmond
 *
 */

public class Student extends Person implements Grades{ 

	//Declare variables for the lecturer that are in addition to the 'Person' class.	
	private String studentNum = null;
	private String studSubject = "";
	private int yearStudy = 0;	
	
	
	/**
	 * Returns the Student Number
	 * @return studentNum
	 */
	public String getStudentNum() {
		return studentNum;
	}
	
	/**
	 * Sets the Student Number
	 * @param studentNum
	 */
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * Returns the student's subject.
	 * @return studSubject
	 */
	public String getStudSubject() {
		return studSubject;
	}

	/**
	 * Sets the student's subject.
	 * @param studSubject
	 */
	public void setStudSubject(String studSubject) {
		this.studSubject = studSubject;
	}

	/**
	 * Returns the student's year of study.
	 * @return yearStudy
	 */
	public int getYearStudy() {
		return yearStudy;
	}

	/**
	 * Sets the student's year of study.
	 * @param yearStudy
	 */
	public void setYearStudy(int yearStudy) {
		this.yearStudy = yearStudy;
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
	
	
	@Override
	//Overrides the parent method for completion year.
	public int completionYear(){
		//Use the get year method, add 5 and subtract the current 
		//year of study to get the completion year of the student. 
		int completeYear = getYear()+5-yearStudy;
		return completeYear;
	}
	
	//Override the method that converts the elements of the person class to a string for the student.
	public String toString(){
		int completionYear = completionYear();
		String person = "Details for this student are:\nName: \t\t\t"+name+"\nAddress: \t\t"+address
				+"\nGender: \t\t"+gender+"\nStudent Number: \t"+studentNum
				+"\nSubject: \t\t"+studSubject+"\nCompletion Year: \t"+completionYear;
		return person;
	}
	
	/**
	 * Custom constructor for an instance of 'Student'.
	 * @param name
	 * @param address
	 * @param gender
	 * @param studentNum
	 * @param studSubject
	 * @param yearStudy
	 */
	public Student(String name, String address, String gender, String studentNum, String studSubject, int yearStudy){
		super(name, address, gender);
		setStudentNum(studentNum);
		setStudSubject(studSubject);
		setYearStudy(yearStudy);		
	}

	
	@Override
	//Overrides the grades method and, for the purposes of this,
	//uses the last two digits in the student number as the grade.
	//In normal circumstances it would be taken from a database.
	public int grades() {
		String subStudentNum = getStudentNum().substring(5, 7);
		int grade = Integer.parseInt(subStudentNum);
		return grade;
	}
	
	//Overrides the gradesLEvel method.
	public char gradeLevel(int grades){
		char level;
		if(grades >70 && grades <=100){
			level = 'A';
		}else if(grades >60 && grades <=70){
			level = 'B';
		}else if(grades >50 && grades <=60){
			level = 'C';
		}else if(grades >40 && grades <=50){
			level = 'D';
		}else{
			level = 'F';
		}			
		return level;
	}
}
