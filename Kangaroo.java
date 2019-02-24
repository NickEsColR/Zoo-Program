package model;

public class Kangaroo
{
	
	//attributes
	
	private String name;
	private int weight;
	private double height;
	private String gender;
	private String bloodType;
	private int imc;
	private double water;
	private String health;
	private double food;
	private boolean vaccine;
	//relations
	
	private Date bornDate;
	
	//metodo
	
	public Kangaroo (String name, int weight, double height, String gender, String bloodType, int imc, double water, String health, Date bornDate, double food, boolean vaccine){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
		this.imc = imc;
		this.water = water;
		this.health = health;
		this.bornDate = bornDate;
		this.vaccine = vaccine;
	}
	
	public String getName(){
	  return name;
	}
	
	public void setName(String theName){
	  name = theName;
	}
	
	public int getWeight(){
	  return weight;
	}
	
	public void setWeight(int theWeight){
	  weight = theWeight;
	}
	
	public double getHeight(){
	  return height;
	}
	
	public void setHeight(double theHeight){
	  height = theHeight;
	}
	
	public String getGender(){
	  return gender;
	}
	
	public void setGender(String theGender){
	  gender = theGender;
	}
	
	public String getBloodType(){
	  return bloodType;
	}
	
	public void setBloodType(String theBlood){
	  bloodType = theBlood;
	}
	
	public int getImc(){
	  return imc;
	}
	
	public void setImc(int theImc){
		imc = theImc;
	}
	
	public double getWater(){
	  return water;
	}
	
	public void setWater(double theWater){
	  water = theWater;
	}
	
	public String getHealth(){
	  return health;
	}
	
	public void setHealth(String theHealth){
	  health = theHealth;
	}
	
	public Date getBornDate(){
		return bornDate;
	}
	
	public void setBornDate(Date bornDate){
		this.bornDate = bornDate;
	}
	
	public double getFood(){
		return food;
	}
	
	public void setFood(double theFood){
		food = theFood;
	}
	
	public boolean getVaccine(){
		return vaccine;
	}
	
	public void setVaccine(boolean vac){
		vaccine = vac;
	}
}
