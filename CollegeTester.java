package college;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CollegeTester {

    public CollegeTester() {
        // TODO Auto-generated constructor stub
    }

 // Method to generate students and use methods
    public void createStudents(College college) {
        college.addStudent(new Student(101, "John", "Harpher", "07745 236532"));
        college.addStudent(new Student(102, "Naomi", "Campbell", "07535 665434"));
        college.addStudent(new Student(103, "Steven", "Esmareld", "07455 537473"));
        college.addStudent(new Student(104, "Felix", "Bernard", "07935 256334"));
        college.addStudent(new Student(105, "Bella", "Arnault", "07635 767462"));
        college.addStudent(new Student(106, "Angel", "Maria", "07648 946383"));
        college.addStudent(new Student(107, "Kendall", "Ruby", "07732 645252"));
        college.addStudent(new Student(108, "Devin", "Brooker", "07632 765433"));
        //college.findStudent(101);
        //System.out.println(college.getStudentById(101).printStudentDetails());  
        //college.searchStudentsBySurname("h");
        //college.printAllStudents();
        //college.removedStudents(101);
        
        
    }
    
 // Method to generate courses and use methods
    public void createCourses(College college) {

        college.addCourse(new Course("Biology", 2000, 431));
        college.addCourse(new Course("Maths", 2500, 562));
        college.addCourse(new Course("Physics", 3000, 495));
        college.addCourse(new Course("Law", 2500, 612));
        college.addCourse(new Course("French", 3000, 751));
        college.addCourse(new Course("Sports", 1500, 325));
        //college.findCourse(7);
        //System.out.println(college.getCourseById(431).printCourseDetails());  
        //college.searchCoursesByTitle("s");
        //college.printAllCourses();
        //college.removedCourses(436);
    }
    
    
   // Method to generate enrolments and add them to the college
     public void createEnrolments(College college) {
    	 GregorianCalendar enrolmentDate = new GregorianCalendar(2023, 8, 12); // creates a date of August 12, 2023
    	 GregorianCalendar enrolmentDate1 = new GregorianCalendar(2023, 9, 24); // creates a date of September 24, 2023

    	 Enrolment enrolment1 = new Enrolment(101, 431, enrolmentDate);
         Enrolment enrolment2 = new Enrolment(102, 495, enrolmentDate1);
         Enrolment enrolment3 = new Enrolment(103, 562, enrolmentDate1);
         Enrolment enrolment4 = new Enrolment(104, 495, enrolmentDate);
         Enrolment enrolment5 = new Enrolment(103, 751, enrolmentDate);
         Enrolment enrolment6 = new Enrolment(101, 495, enrolmentDate1);
         Enrolment enrolment7 = new Enrolment(102, 431, enrolmentDate1);
         
         college.addEnrolment(enrolment1);
         college.addEnrolment(enrolment2);
         college.addEnrolment(enrolment3);
         college.addEnrolment(enrolment4);
         college.addEnrolment(enrolment5);
         college.addEnrolment(enrolment6);
         college.addEnrolment(enrolment7);
         college.removeEnrolment(101, 431);
         college.printAllEnrolments();
     }

     
    public static void main(String[] args) {
        College c = new College();
        CollegeTester tester = new CollegeTester();
        tester.createStudents(c);
        tester.createCourses(c);
        tester.createEnrolments(c);
        GregorianCalendar startDate = new GregorianCalendar(2023, Calendar.JUNE, 1);
        GregorianCalendar endDate = new GregorianCalendar(2023, Calendar.OCTOBER, 31);
        c.printEnrolmentsBetweenDates(startDate, endDate);

     
     
    }

	
}


	