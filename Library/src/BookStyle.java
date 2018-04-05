
public class BookStyle extends Book {
	private String style;
	
	public BookStyle() {
		super();
	}
	
	public BookStyle(String string, String string2, int i, int j, String string3) {
	}
	
	public String getStyle() {
		return style;
	}
	
	@Override
	public String toString() {
		return super.toString() + "style: " + style;
	}
	
	
}
