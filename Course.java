package college;


public class Course {
	
	
    private String title;
    private double enrollmentFee;
    private int id;
    
    public Course(String title, double enrollmentFee, int id) {
        this.title = title;
        this.enrollmentFee = enrollmentFee;
        this.id = id;
        
    }
    
    
    public String getTitle() {
        return title;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public double getEnrollmentFee() {
        return enrollmentFee;
    }
    
    
    public void setEnrollmentFee(double enrollmentFee) {
        this.enrollmentFee = enrollmentFee;
    }
    
    
    public int getId() {
        return id;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    // method to print course's details
    public String printCourseDetails() {
		return ("Course ID: " + id + ", Title: " + title + ", Enrollment Fee: $" + enrollmentFee);
    }
    
    
}