package college;


import java.util.GregorianCalendar;

public class Enrolment {
	
    private int studentID;
    private int courseID;
    private GregorianCalendar enrolmentDate;
    
    public Enrolment(int studentID, int courseID, GregorianCalendar enrolmentDate) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.enrolmentDate = enrolmentDate;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public int getCourseID() {
        return courseID;
    }
    
    public GregorianCalendar getEnrolmentDate() {
        return enrolmentDate;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    
    public void setEnrollmentDate(GregorianCalendar enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }
    
 // method to print enrolment details
    public String printEnrolmentDetails() {
    	return "Student ID: " + studentID + ", Course ID: " + courseID;
    }
}
	


