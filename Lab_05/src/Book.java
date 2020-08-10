
public class Book {
	protected String title, auther;

	public Book(String title, String auther) {
		this.title = title;
		this.auther = auther;
	}

	public String getTitle() {
		return title;
	}

	public String getAuther() {
		return auther;
	}

	@Override
	public String toString() {
		return "The title is " + title + ", and the auther is " + auther;
	}
}
