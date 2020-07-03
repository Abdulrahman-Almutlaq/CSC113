

public class Main {

	public static void main(String[] args) {
		Section csc113 = new Section("CSC_113", 12);
		csc113.addStudent(1, "ali", 19);
		csc113.addStudent(2, "hasan", 22);
		csc113.addStudent(3, "ali", 21);
		
		System.out.println("===============================================");
		System.out.println(csc113.addStudent(new Student(4, "Ahmad", 23)));
		System.out.println(csc113.addStudent(new Student(4, "Ahmad", 23)));
		System.out.println(csc113.addStudent(new Student(5, "khalid", 20)));
		System.out.println("===============================================");
		
		
		
		csc113.printList();
		
		System.out.println("===============================================");
		System.out.println(csc113.deleteStudent(2));
		System.out.println("===============================================");
		csc113.printList();
		System.out.println("===============================================");
		
		csc113.printStudentAt(2);
		
		
		System.out.print("displaying first ali: ");csc113.getFirst("ali").display();
		
		
		System.out.print("displaying last ali: ");csc113.getLast("ali").display();
		
		
		System.out.println("===============================================");
		Student arr[] =csc113.getStudents(22);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) 
				arr[i].display();	
			
		}
	}
}
