package patterns.structural.adapter.advancedmedia;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
	}

}
