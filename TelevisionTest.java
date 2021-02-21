public class TelevisionTest{

	public static void main(String[] args) {
	
	Television myTelevision = new Television(); 
		
		
		
		
		
		

	System.out.println("Is the television on? " + myTelevision.isOn());
	System.out.println("Turn on the television");
	myTelevision.setOn(true); 
	System.out.println("Is the television on? " + myTelevision.isOn());
	
	myTelevision.setName("LG"); 
	System.out.println(myTelevision.getName() + " - Life is Good");
	
	myTelevision.setChannel(20);
	myTelevision.changeChannelUp();
	myTelevision.changeChannelUp();
	System.out.println("The TV is now on channel " + myTelevision.getChannel());

	myTelevision.setVolume(29);
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	myTelevision.increaseVolume();
	System.out.println("The new TV volume is " + myTelevision.getVolume());
}


}