
public class Video {

	private int id, duration;
	private String title;
	private Category category;

	public Video(int id, int duration, String title, Category category) {
		this.id = id;
		this.duration = duration;
		this.title = title;
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public Category getCategory() {
		return category;
	}

	public boolean equals(Video v) {
		if (id == v.id)
			return true;
		return false;
	}

	public String toString() {
		return "the id is :" + id + " & duration is " + duration + " & title " + title + " & category " + category;
	}

}
