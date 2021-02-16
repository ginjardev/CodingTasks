public class AirConditionerTest{
  
  public static void main (String[] args){
	 
	 AirConditioner brandName = new AirConditioner();
		
		brandName.isOn();
		brandName.setOn(false);
		brandName.setProductName("Samsung");
		brandName.getProductName();
		brandName.getTemperature();
		
		brandName.setTemperature(45);
		brandName.increaseTemperature();
		//brandName.decreaseTemperature();
		

		String newAcName = brandName.getProductName();
		int newAcTemperature = brandName.getTemperature();
		boolean AcState = brandName.isOn();
		
		System.out.printf("The name of the air conditioner is %s%n", newAcName);
		System.out.printf("The temperature of the air conditioner is %d%n", newAcTemperature);
		System.out.printf("Is air conditioner on? " + AcState);
		

  }

}