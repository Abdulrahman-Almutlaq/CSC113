
public class Hotel {

	private String hotelName;
	private Guest arrGuest[];
	private int nbGuests;
	
	public Hotel(int size,String hotelName) {
		this.hotelName = hotelName;
		arrGuest = new Guest[size];
		nbGuests=0;
	}
	
	public boolean addGuest(Guest g) {
		if(nbGuests==arrGuest.length)
			return false;
		arrGuest[nbGuests++]=g;
		return true;
	}
	
	public int countGuests(String nat) {
		int counter = 0;
		for(int i=0;i<nbGuests;i++) 
			if(arrGuest[i].getNationality().equalsIgnoreCase(nat))
				counter++;
		return counter;
	}
	
	public Guest getOldestGuest() {
		Guest max= arrGuest[0];
		for(int i=1;i<nbGuests;i++)
			if(arrGuest[i].getAge()>max.getAge()) 
				max = arrGuest[i];
		return max;
	}
	
	public Guest[] getGuests(String nat) {
		Guest[] temp = new Guest[nbGuests];
		int counter=0;
		for(int i=0;i<nbGuests;i++) 
			if(arrGuest[i].getNationality().equalsIgnoreCase(nat))
				temp[counter++] = arrGuest[i];
		return temp;
	}
	
	public int splitGuests(Guest[] saudi, Guest[] expat) {
		int sc = 0,ec=0;
		for(int i=0;i<nbGuests;i++)
			if(arrGuest[i].getNationality().equalsIgnoreCase("saudi"))
				saudi[sc++]=arrGuest[i];
			else
				expat[ec++]=arrGuest[i];
		return ec;
	}
}
