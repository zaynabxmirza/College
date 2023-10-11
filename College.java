package college;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * Represents a college that maintains collections of students and courses, and enrolments between them.
 */
public class College {
	
	/** A list of students */
	private ArrayList<Student> students;
	/** A list of courses */
	private ArrayList<Course> courses;
	/** A list of enrolments */
	private ArrayList<Enrolment> enrolments;


	/**
	 * Constructs the college with empty lists of students, courses, and enrolments.
	 */
    public College() {
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
        enrolments = new ArrayList<Enrolment>();
    }
    

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public ArrayList<Course> getCourses(){
    	return courses;
    }
    
    public void setCourses(ArrayList <Course> courses) {
    	this.courses = courses;
    }
    
    public ArrayList<Enrolment> getEnrolment(){
    	return enrolments;
    }
    
    public void setEnrolment (ArrayList <Enrolment> enrolments) {
    	this.enrolments = enrolments;
    }
    
    
    /**
     * Adds a new student to the list of students in the college.
     * 
     * @param student to add to the list
     */
    public void addStudent(Student newStudent) {
    	students.add(newStudent);
    	System.out.println("Student added: " + newStudent.getId() + " " + newStudent.getFirstName() + " " + newStudent.getLastName() + " " + newStudent.getNumber());

    }
    
    
    /**
     * Prints student based on the given student ID
     * 
     * @param studentId
     */
    public void findStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
            	System.out.println("Student found: ");
                System.out.println(student.printStudentDetails());
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found."); //student not found
    }
    
    
    /**
     * Returns a student based on the given student ID
     * @param studentId
     * @return
     */
    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }
    

    /**
     * Searches for and prints all students whose surname contains a particular search string.
     * @param search string for surname
     */
    public void searchStudentsBySurname(String search) {
        boolean found = false;
        for (Student student : students) {
            if (student.getLastName().contains(search)) {
            	System.out.println("The students found are: ");
                System.out.println(student.printStudentDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with surname containing \"" + search + "\"");
        }
    }
    
    
    /**
     * prints a list of all students
     */
    public void printAllStudents() {
        System.out.println("All current students:");
        System.out.println("-----------------------------------------------------");
        for (Student element : students) {
            System.out.println(element.printStudentDetails());
        }
    }


        /**
         * new list of removed students
         * @param studentId
         * @return
         */
    public ArrayList<Student> removedStudents(int studentId) {
        ArrayList<Student> removedStudentsList = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == studentId) {
                iterator.remove();
                removedStudentsList.add(student);
                System.out.println("Student with ID " + studentId + " removed successfully.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
        return removedStudentsList;
    }
    
    
    
    /**
     * Adds a new course to the list of courses in the college.
     * 
     * @param course the course to add to the list
     */
    public void addCourse(Course newCourse) {
    	courses.add(newCourse);
    	System.out.println("Course added: " + newCourse.getId() + " " + newCourse.getTitle() + " " + newCourse.getEnrollmentFee());
    }
    
    
    /**
     * Returns the course with the given ID number.
     * 
     * If the course is not found, it returns null.
     */
    public void findCourse(int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
            	System.out.println("Course found: ");
                System.out.println(course.printCourseDetails());
                return;
            }
        }
        System.out.println("Course with ID " + courseId + " not found."); // course not found
    }
    
    
    /**
     * Returns a course based on the given course ID
     * @param courseId
     * @return
     */
    public Course getCourseById(int courseId) {
    	for (Course course : courses) {
            if (course.getId() == courseId) {
                return course;
            }
        }
		return null;

    }

    
    /**
     * Searches for and prints all courses whose title contains a particular search string.
     *
     * @param search 
     */
    public void searchCoursesByTitle(String search) {
        boolean found = false;
        for (Course course : courses) {
            if (course.getTitle().contains(search)) {
                System.out.println(course.printCourseDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found with title containing \"" + search + "\"");
        }
    }


    /**
     * prints a list of all courses
     */
    public void printAllCourses() {
    	System.out.println("All current courses:");
    	System.out.println("-----------------------------------------------------");
    	for (Course element : courses) {
    		System.out.println(element.printCourseDetails());
    	}
    }
    
    
    
    /**
     * creates a list of removed courses
     * @param courseId
     * @return
     */
    public ArrayList<Course> removedCourses(int courseId) {
        ArrayList<Course> removedCoursesList = new ArrayList<>();
        Iterator<Course> iterator = courses.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == courseId) {
                iterator.remove();
                removedCoursesList.add(course);
                System.out.println("Course with ID " + courseId + " removed successfully.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Course with ID " + courseId + " not found.");
        }
        return removedCoursesList;
    }

    
    /**
     * Adds an enrolment per student
     * @param enrolment
     */
    public void addEnrolment(Enrolment enrolment) {
        int studentId = enrolment.getStudentID();
        int courseId = enrolment.getCourseID();
        
        Student student = getStudentById(studentId);
        Course course = getCourseById(courseId);
        
        if (studentId == student.getId() && courseId == course.getId()) {
            
            System.out.println("Enrolment successfully added:" );
            enrolments.add(enrolment);
            System.out.println(enrolment.printEnrolmentDetails());
            
        } else {
            System.out.println("Could not add enrolment: student or course not found.");
        }  
        
    }

    
    /**
     * Removes an enrolment from the college for the given student ID and course ID.
     * If the enrolment is found and removed, a message is printed to confirm the removal.
     * If the enrolment is not found, an error message is printed
     * @param studentId
     * @param courseId
     */
    public void removeEnrolment(int studentId, int courseId) {
        // Find the enrolment with the given student ID and course ID
        Enrolment enrolmentToRemove = null;
        for (Enrolment enrolment : enrolments) {
            if (enrolment.getStudentID() == studentId && enrolment.getCourseID() == courseId) {
                enrolmentToRemove = enrolment;
                break;
            }
        }

        // Remove the enrolment if it was found
        if (enrolmentToRemove != null) {
            enrolments.remove(enrolmentToRemove);
            System.out.println("Enrolment removed:");
            System.out.println(enrolmentToRemove.printEnrolmentDetails());
        } else {
        	System.out.println("------------------------------------------------------");
            System.out.println("Could not remove enrolment: enrolment not found.");
        }
    }
    
    
    /**
     * Prints a list of all enrolments
     */
    public void printAllEnrolments() {
    	System.out.println("All currently enrolled students:");
    	System.out.println("-----------------------------------------------------");
    	for (Enrolment element : enrolments) {
    		System.out.println(element.printEnrolmentDetails());
    		
    	}
    }

    
    /**
     *Prints an enrolment between two dates
     * @param startDate
     * @param endDate
     */
    public void printEnrolmentsBetweenDates(GregorianCalendar startDate, GregorianCalendar endDate) {
        System.out.println("-----------------------------------------------------");
    	System.out.println("Enrolments between " + startDate.getTime() + " and " + endDate.getTime() + ":");
        for (Enrolment enrolment : enrolments) {
            GregorianCalendar enrolmentDate = enrolment.getEnrolmentDate();
            if (enrolmentDate != null && enrolmentDate.compareTo(startDate) >= 0 && enrolmentDate.compareTo(endDate) <= 0) {
            	System.out.println("Student ID: " + enrolment.getStudentID() +
                        ", Course ID: " + enrolment.getCourseID() +
                        ", Enrollment Date: " + enrolment.getEnrolmentDate().getTime());
            }
        }
    }



}
