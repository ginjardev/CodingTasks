public class Mp3PlayerTest{

	public static void main(String[] args) {
	
	Mp3Player myMp3Player = new Mp3Player(); 
		
		
			

	System.out.println("Is the Mp3 Player on? " + myMp3Player.isOn());
	System.out.println("Turn on the Mp3 Player");
	myMp3Player.setOn(true); 
	System.out.println("Is the Mp3 Player on? " + myMp3Player.isOn());
	
	myMp3Player.setName("Sony"); 
	System.out.println(myMp3Player.getName() + " - touching lives...");
	
	myMp3Player.setTrack(20);
	myMp3Player.nextTrack();
	myMp3Player.previousTrack();
	System.out.println("My Mp3 player is playing track " + myMp3Player.getTrack());

	myMp3Player.setVolume(29);
	myMp3Player.increaseVolume();
	myMp3Player.increaseVolume();
	myMp3Player.increaseVolume();
	System.out.println("The new Mp3 volume is " + myMp3Player.getVolume());

}



}