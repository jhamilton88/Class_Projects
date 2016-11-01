package classProjectMain;

/**
 *
 * @author Jacob Hamilton
 */
public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private int[] grades = { 0, 0, 0 };
	private boolean validEmail;

	/**
	 * Constructor
	 *
	 * @param studentID
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param age
	 * @param grade1
	 * @param grade2
	 * @param grade3
	 */
	public Student(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2,
			int grade3) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.validEmail = verifyEmail(this.email);
		this.age = age;
		this.grades[0] = grade1;
		this.grades[1] = grade2;
		this.grades[2] = grade3;

	}

	/**
	 *
	 * @return
	 */
	public String getStudentID() {
		return this.studentID;
	}

	/**
	 *
	 * @param studentID
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	/**
	 *
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 *
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 *
	 * @return
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 *
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 *
	 * @return
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *
	 * @return
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 *
	 * @param gradeNumber
	 * @return
	 */
	public int getGrades(int gradeNumber) {
		int grade = 0;
		switch (gradeNumber) {
		case 1:
			grade = this.grades[0];
			break;
		case 2:
			grade = this.grades[1];
			break;
		case 3:
			grade = this.grades[2];
			break;
		}
		return grade;
	}

	/**
	 *
	 * @param grade1
	 * @param grade2
	 * @param grade3
	 */
	public void setGrades(int grade1, int grade2, int grade3) {
		this.grades[0] = grade1;
		this.grades[1] = grade2;
		this.grades[2] = grade3;
	}
	
	/**
	 * Receives a string containing an email and then checks
	 * to see if the email contains "@" and "." symbols, also
	 * checks if the email contains any spaces " ". If checks
	 * for "@" and "." are true, and the check for " " is true
	 * then the method will return a value of true. In any other
	 * case, the method will return a value of false.
	 * @param email Take a string parameter containing an email
	 * to check for validity.
	 * @return boolean If checks are true then the return will be true, else
	 * the return will be false.
	 */
	private boolean verifyEmail(String email) {
		if (email.contains("@") && email.contains(".") && !email.contains(" ")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks the student object's validEmail variable and return the value
	 * @see Student.verifyEmail(String email) for how the email is validated
	 * @return boolean validEmail
	 */
	public boolean isValidEmail() {
		return validEmail;
	}

	public void print() {
		System.out.println("ID: " + this.getStudentID() + "\tFirst Name: " + this.getFirstName() + "\tLast Name: "
				+ this.getLastName() + "\tAge: " + this.getAge() + "\tGrades: {" + this.getGrades(1) + ","
				+ this.getGrades(2) + "," + this.getGrades(3) + "}");
	}
}