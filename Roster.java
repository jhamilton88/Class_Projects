package classProjectMain;

import java.util.ArrayList;

/**
 *
 * @author Jacob Hamilton
 */
public class Roster {
	private static ArrayList<Student> roster;

	public Roster() {
		roster = new ArrayList<>();
	}

	/**
	 * Adds a new student onto the Roster
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
	public static void add(String studentID, String firstName, String lastName, String email, int age, int grade1,
			int grade2, int grade3) {
		Roster.roster.add(new Student(studentID, firstName, lastName, email, age, grade1, grade2, grade3));

	}

	/**
	 *
	 * @param studentID
	 */
	public static void remove(String studentID) {
		boolean found = false;
		int reStu = 5;
		String mID = studentID;
		int mIDint = Integer.parseInt(mID);
		for (Student student : Roster.roster) {
			String sID = student.getStudentID().trim();
			int sIDint = Integer.parseInt(sID);
			if (mIDint == sIDint) {
				reStu = mIDint;
				found = true;
				break;
			}
		}
		if (found == true) {
			roster.remove(reStu - 1);
			System.out.println("Student ID " + studentID + " has been removed from the roster.");
		} else {
			System.out.println("Unable to find student ID " + studentID);
		}
	}

	/**
	 *
	 */
	public static void print_all() {
		for (Student student : Roster.roster) {
			student.print();
		}
	}

	/**
	 *
	 * @param studentID
	 */
	public static void print_average_grade(String studentID) {
		String mID = studentID;
		int i = Integer.parseInt(mID);
		i--;
		Student stu = roster.get(i);
		System.out.println(
				"ID " + stu.getStudentID() + " average grade: " + (stu.getGrades(1) + stu.getGrades(2) + stu.getGrades(3)) / 3);
	}

	/**
	 * Prints a list of all invalid email's. Uses Student.isValidEmail()
	 * to check the instance variable "validEmail" of the student object
	 * to receive a boolean value. A value of true means the email is valid
	 * and a value of value means it is not valid. 
	 * @see Student.isValidEmail()
	 */
	public static void print_invalid_emails() {
		boolean valid = true;
		for (Student student : Roster.roster) {
			valid = student.isValidEmail();

			if (valid == false) {
				System.out.println("ID: " + student.getStudentID() + "\tInvalid eMail: " + student.getEmail());
			}
		}
	}

	public Student get(int index) {
		return Roster.roster.get(index);
	}

}