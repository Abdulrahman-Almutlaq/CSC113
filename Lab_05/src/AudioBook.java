
public class AudioBook extends Book {
	private int duration;
	private String narrator;

	public AudioBook(String title, String auther,int duration,String narrator) {
		super(title, auther);
		this.duration = duration;
		this.narrator =narrator;
	}
	

	public int getDuration() {
		return duration;
	}

	public String getNarrator() {
		return narrator;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", and the duration is "+ duration + 
				", and the narrator is " + narrator;
	}

	
	
}
