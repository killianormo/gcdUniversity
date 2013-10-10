package ie.gcd.universityAssignment;
/**
 * @author KillianOrmond
 *
 */

import java.util.Calendar;

public abstract class Person {
	protected String name;
	protected String address;
	protected String gender;
	
	public abstract int completionYear();
	public abstract void name();
	public abstract void address();
	public abstract void gender();
	
	/**
	 * Returns the name of the person.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the person.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the address of the person.
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address of the person.
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the gender of the person. 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of the person.
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	//Get's the current year using the calendar class.
		public int getYear(){
			Calendar cal = Calendar.getInstance();
			  int year = cal.get(Calendar.YEAR);
			  return year;
		}			
	
	/**
	 * Custom constructor.
	 * @param name
	 * @param address
	 * @param gender
	 */
	public Person(String name, String address, String gender){
		this.name = name;
		this.address = address;
		this.gender = gender;
	}	
	
	//Create a method to convert the elements of the person class to a string.
	public String toString(){
		String person = name+"\n"+address+"\n"+gender+"\n";
		return person;
	}
	
		
}
