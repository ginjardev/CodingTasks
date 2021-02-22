public class Mp3Player {

	private String name;
	private boolean isOn;
	private int track;
	private int volume;
	private boolean play;

	public void play(boolean on) {
		on = true;
}
	public void stop(boolean off) {
		off = false;
}

	public String getName(){
		return name;
}
	public void setName(String name){
		this.name = name;
}
	public void setTrack(int trackNumber) {
		track = trackNumber;
	
}
	public void nextTrack(){
		if(track >= 0 && track <= 99)
 		track++;

}
	
	public void previousTrack(){
		if(track >= 1 && track <= 100)
		track--;
}
	public int getTrack(){
		return track;
}
	public boolean isOn() {
		return isOn;
	
}

	public void setOn(boolean on) {
		on = true;
		isOn = on;
}
	public void setVolume(int volumeNumber) {
		volume = volumeNumber;

}

	public int getVolume(){
		return volume;
}
	
	public void increaseVolume(){
		if(volume >= 0 && volume <= 49)
 		volume++;

}
	
	public void decreaseVolume(){
		if(volume >= 1 && volume <= 50)
		volume--;
}
		
}