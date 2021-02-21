public class Television {

	private String name;
	private boolean isOn;
	private int channel;
	private int volume;

	public void setName(String tvName) {
		name = tvName;
}

	public String getName(){
		return name;
}
	public void setChannel(int channelNumber) {
		channel = channelNumber;
	
}
	public void changeChannelUp(){
		if(channel >= 0 && channel <= 99)
 		channel++;

}
	
	public void changeChannelDown(){
		if(channel >= 1 && channel <= 100)
		channel--;
}
	public int getChannel(){
		return channel;
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