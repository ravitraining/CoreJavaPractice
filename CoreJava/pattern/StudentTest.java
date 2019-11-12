package pattern;

public class StudentTest

{
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "shashank";

		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "manoj";

		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);

		s1 = new Student();

		System.out.println(s1.rollno);
		System.out.println(s1.name);
	}

}