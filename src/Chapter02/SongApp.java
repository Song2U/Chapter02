package Chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setArtist("������");
		song.setTitle("���� ��");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("�̹μ�");

		Song song1 = new Song("������", "���� ��", "Real", "�̹μ�", 2010, 3);
		Song song2 = new Song("����ģ��", "�ð��� �޷���", "SnowFlake"); // �����ڸ� �������ָ� ���� �����
		song.show();
		song1.show();
		song2.show();
	}
}