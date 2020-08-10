
public class EBook extends WrittenBook{
	private int size;
	
	public EBook(String title, String auther, int nPages,int size) {
		super(title, auther, nPages);
		this.size = size;
	}
	
	public PrintedBook print() {
		WrittenBook wp = new PrintedBook(title, auther, getnPages());
		return (PrintedBook) wp;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", and the size is " + size ;
	}
	
}
