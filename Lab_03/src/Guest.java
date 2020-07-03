
public class Guest {

	private int guestid,age;
	private String name,nationality,memberName;
	
	public Guest(int id, String name,String nat,int age) {
		guestid= id;
		this.name=name;
		nationality = nat;
		this.age=age;
	}

	public int getGuestid() {
		return guestid;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}
	
	public void displayGuestInfo() {
		System.out.println(" Guest id: "+guestid+" guest name: "+name+
				" guest age: "+age+" guest nat: "+nationality);
	}
	public String toString() {
		return " Guest id: "+guestid+" guest name: "+name+
				" guest age: "+age+" guest nat: "+nationality;
	}
	
}
