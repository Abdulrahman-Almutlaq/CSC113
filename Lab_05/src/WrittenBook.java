
public class WrittenBook extends Book{

	private int nPages;
	
	public WrittenBook(String title, String auther,int nPages) {
		super(title, auther);
		this.nPages = nPages;
	}
	

	public int getnPages() {
		return nPages;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", the number of pages is "+ nPages;
	}
}
