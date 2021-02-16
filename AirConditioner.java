public class AirConditioner {
	
	private boolean isOn;
	private String productName;
	private int temperature = 14;
	
	public void decreaseTemperature(){
		if(temperature == 30 && temperature >= 14) 
		temperature--;

  }
	public String getProductName(){
		return productName;

  }
	public int getTemperature(){
		return temperature;
  }
	public void increaseTemperature(){
		if(temperature >= 14 && temperature <= 29)
		temperature++;

  }
	public boolean isOn(){
		return isOn;

  }
	public void setOn(boolean yes){
		isOn = yes;
		//isOn = yes;
  }
	public void setProductName(String deviceName){
		productName = deviceName;

  }
	public void setTemperature(int temperatureNumber){
		if(temperatureNumber == 30 && temperatureNumber >= 14)
		temperature = temperatureNumber;
  }



}