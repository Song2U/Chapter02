package Chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setArtist("아이유");
		song.setTitle("좋은 날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("이민수");

		Song song1 = new Song("아이유", "좋은 날", "Real", "이민수", 2010, 3);
		Song song2 = new Song("여자친구", "시간을 달려서", "SnowFlake"); // 생성자를 지정해주면 오류 사라짐
		song.show();
		song1.show();
		song2.show();
	}
}