

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
			return ;
		}
		studentList[nStudents++] = new Student(id, name, age);
		System.out.println("added successfully");
		return ;
	}
	
	public boolean addStudent(Student s) { // first modification is adding the method addStudent(*Student s*)
		if (search(s.getId()) != -1 || studentList.length == nStudents) {
			System.out.println("Can't be added!");
			return false;
		}
		studentList[nStudents++] = new Student(s.getId(), s.getName(), s.getAge());
		System.out.println("added successfully");
		return true;
	}
	
	
	public boolean deleteStudent(int id) { // second modification is changing the return type of the method deleteStudent(int id)
		int temp = search(id);
		if (temp == -1) {
			System.out.println("Can't be deleted!");
			return false;
		}
		for (int i = temp; i + 1 < nStudents; i++) {
			studentList[i] = studentList[i + 1];
		}
		nStudents--;
		System.out.println("deleted successfully");
		return true;
	}

	public void printList() { // third modification printList() should use display() method in the student class
		System.out.println("course: " + course);
		for (int i = 0; i < nStudents; i++) {
			studentList[i].display();
		}
	}
	
	public void printStudentAt(int index) {// first addition is printStudentAt(index: int)
		if(index<0||index>=nStudents) {
			System.out.println("invalid index");
			return;
		}
		System.out.print("student # "+ (index+1)+" is: ");
		studentList[index].display();
	}
	public Student getFirst(String name) {// second addition is getFirst(String name)
		for(int i=0;i<nStudents;i++)
			if(studentList[i].getName().equalsIgnoreCase(name))
				return studentList[i];
		return null;
	}
	
	public Student getLast(String name) {// third addition is getLast(String name)
		int j=-1;
		for(int i=0;i<nStudents;i++)
			if(studentList[i].getName().equalsIgnoreCase(name))
				j=i;
		if(j==-1)
		return null;
		return studentList[j];
	}
	
	public Student[] getStudents(int age) {// fourth addition is getStudents(int age)
		Student temp[] = new Student[nStudents];
		int counter=0;
		for(int i=0;i<nStudents;i++)
			if(studentList[i].getAge()<age)
				temp[counter++]=studentList[i];
		return temp;
				
	}

}

