package college;


public class Student {

	
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	
	public Student(int id, String firstName, String lastName, String phoneNumber) {
		// TODO Auto-generated constructor stub
		 this.firstName = firstName;
	     this.lastName = lastName;
	     this.phoneNumber = phoneNumber;
	     this.id = id;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNumber() {
		return phoneNumber;
	}


	public void setNumber(String number) {
		this.phoneNumber = number;
	}
	
	// method to print student's details
	public String printStudentDetails()
	{
		return ("Student ID: " + id +  " First name: " + firstName + " Last name: " + lastName + " Phone Number: " + phoneNumber);
	}

}
