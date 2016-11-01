package classProjectMain;

import java.util.regex.Pattern;

public class ClassProject {

	public static void main(String[] args) {
		Roster roster = new Roster();

		String[] students = { "1,John,Smith,John1989@gmail.com,20,88,79,59",
				"2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
				"3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87", 
				"4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
				"5,Jacob,Hamilton,jhami60@wgu.edu,27,98,75,85" };

		for (String stu : students) {

			String[] temp = stu.split(Pattern.quote(","));
			int age = Integer.parseInt(temp[4].trim());
			int grade1 = Integer.parseInt(temp[5].trim());
			int grade2 = Integer.parseInt(temp[6].trim());
			int grade3 = Integer.parseInt(temp[7].trim());

			Roster.add(temp[0], temp[1], temp[2], temp[3], age, grade1, grade2, grade3);
		}

		Roster.print_all();
		Roster.print_invalid_emails();
		for (int i = 0; i < 5;) {
			Student stu = roster.get(i);
			Roster.print_average_grade(stu.getStudentID());
			i++;
		}
		Roster.remove("3");
		Roster.remove("3");

	}
}