
public class PrintedBook extends WrittenBook{
	private int ISBN;
	private boolean hardcover;

	public PrintedBook(String title, String auther, int nPages,int ISBN,boolean hardcover) {
		super(title, auther, nPages);
		this.ISBN = ISBN;
		this.hardcover = hardcover;
	}

	public PrintedBook(String title, String auther, int nPages) {
		super(title, auther, nPages);
	}

	public int getISBN() {
		return ISBN;
	}

	public boolean isHardcover() {
		return hardcover;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", and the ISBN is " + ISBN + 
				", and the state of hard_cover is: "+hardcover;
	}
	
	

}
