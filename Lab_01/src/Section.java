

public class Section {

	private String course;
	private Student[] studentList;
	private int nStudents;

	public Section(String course, int size) {
		this.course = course;
		studentList = new Student[size];
		nStudents = 0;
	}

	public int search(int id) {
		for (int i = 0; i < nStudents; i++)
			if (studentList[i].getId() == id) {
				System.out.println("Object's available");
				return i;
			}

		System.out.println("Object's not available!");
		return -1;

	}

	public void addStudent(int id, String name, int age) {
		if (search(id) != -1 || studentList.length == nStudents) {
			System.out.println("Can't be added!");
			return;
		}
		studentList[nStudents++] = new Student(id, name, age);
		System.out.println("added successfully");
	}

	public void deleteStudent(int id) {
		int temp = search(id);
		if (temp == -1) {
			System.out.println("Can't be deleted!");
			return;
		}
		for (int i = temp; i + 1 < nStudents; i++) {
			studentList[i] = studentList[i + 1];
		}
		nStudents--;
		System.out.println("deleted successfully");
	}

	public void printList() {
		System.out.println("course: " + course);
		for (int i = 0; i < nStudents; i++) {
			System.out.println("Student #" + i + " - name: " + studentList[i].getName() + ", age: "
					+ studentList[i].getAge() + ", id: " + studentList[i].getId());
		}
	}
	

}

