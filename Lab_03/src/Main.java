
public class Main {

	public static void main(String[] args) {
		Hotel hry = new Hotel(20,"Hry");
		hry.addGuest(new Guest(1, "ali", "saudi", 22));
		hry.addGuest(new Guest(2, "hasan", "saudi", 23));
		hry.addGuest(new Guest(3, "khalid", "non_saudi", 25));
		hry.addGuest(new Guest(4, "abdu", "non_saudi", 24));
		hry.addGuest(new Guest(5, "mohammad", "non_saudi", 26));
		hry.addGuest(new Guest(6, "ahmad", "saudi", 21));
		System.out.println(hry.countGuests("saudi"));
		System.out.println(hry.getOldestGuest());
		Guest temp[] = hry.getGuests("saudi");
		for(int i=0;i<temp.length;i++)
			if(temp[i]!=null)
				System.out.println(temp[i]);
		
		System.out.println("=========================");
		Guest temp2[] = hry.getGuests("non_saudi");
		
		System.out.println(hry.splitGuests(temp, temp2));
		
		for(int i=0;i<temp2.length;i++)
			if(temp2[i]!=null)
				System.out.println(temp2[i]);
	}
}
