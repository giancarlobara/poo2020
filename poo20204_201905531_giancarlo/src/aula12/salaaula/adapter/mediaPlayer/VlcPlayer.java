package aula12.salaaula.adapter.mediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file. Name: " + fileName);;		
	}

	public void playMp4(String fileName) {
		// do nothing
	}
	
}
