

public class Main {

	public static void main(String[] args) {
		Section csc113 = new Section("CSC_113", 12);
		csc113.addStudent(1, "ali", 19);
		csc113.addStudent(2, "hasan", 22);
		csc113.addStudent(3, "khalid", 21);
		csc113.addStudent(4, "Ahmad", 23);
		csc113.printList();
		csc113.deleteStudent(2);
		csc113.printList();
	}
}
