package hanglemez;

public class hanglemez {

	String artist;
	String title;
	int length;
	
	public hanglemez(String artist, String title, int length) {
		this.artist = artist;
		this.title = title;
		this.length = length;
	}
	@Override
	public String toString() {
		return artist+": "+title+", "+length+" perc";
	}
	public int compareLength(hanglemez other) {
		if (length > other.length) {
			return 1;
		}
		else if (length < other.length) {
			return -1;
		}
		return 0;
	}
	
	public boolean artistEquals (String artist) {
		return this.artist.equalsIgnoreCase(artist);
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

}
