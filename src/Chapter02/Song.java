package Chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song(String artist, String title, String album) {
		// this.artist = artist;
		// this.title = title;
		// this.album = album; //코드가 중복되므로 아래와 같이 줄인다.
		this(artist, title, album, null, 0, 0);
	}

	public Song(String artist, String title, String album, String composer, int year, int track) {
		this.artist = artist; // this : 인스턴스를 가리킴
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public Song() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
				artist + " " + title + " (" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
}
