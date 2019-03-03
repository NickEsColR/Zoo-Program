package model;

public class DragonZone
{

	//attributes
	
	private int temperature;
	private boolean alert;
	
	//relations
	
	private Dragon male;
	private Dragon female;
	
	//metodos
	
	public DragonZone(int temperature, boolean alert, Dragon male, Dragon female){
		this.temperature = temperature;
		this.alert = alert;
		this.male = male;
		this.female = female;
	}
	
	public int getTemperature(){
	  return temperature;
	}
	
	public void setTemperature(int theTemp){
	  temperature = theTemp;
	}
	
	public boolean getAlert(){
		return alert;
	}
	
	public void setAlert(boolean theAlert){
		alert = theAlert;
	}
	
	public Dragon getMale(){
	  return male;
	}
	
	public void setMale(Dragon male){
		this.male = male;
	}
	
	public Dragon getFemale(){
	  return female;
	}
	
	public void setFemale(Dragon female){
	  this.female = female;
	}
	public void setImcMale(){
		male.setImc();
	}
	public void setImcFemale(){
		female.setImc();
	}
}
