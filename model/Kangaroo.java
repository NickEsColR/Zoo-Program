package model;

public class Kangaroo
{

	//constants
	
	public final static double lts = 1.5;
	public final static String typeA = "A";
	public final static String typeAB = "AB";
	public final static String typeB = "B";
	public final static String typeO = "O";
	
	//attributes
	
	private String name;
	private int weight;
	private double height;
	private String gender;
	private String bloodType;
	private double imc;
	private double water;
	private String health;
	private double food;
	private boolean vaccine;
	//relations
	
	private Date bornDate;
	private Date vaccineDate;
	
	//metodo
	
	public Kangaroo (String name, int weight, double height, String gender, String bloodType, Date bornDate, boolean vaccine, Date vaccineDate ){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bloodType = bloodType;
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
	
	public double getImc(){
	  return imc;
	}
	
	public void setImc(){
		imc = weight / (height * height);
		
		}
	
	public double getWater(){
	  return water;
	}
	
	public void setWater(){
	  water = imc * lts;
	}
	
	public String getHealth(){
	  return health;
	}
	
	public void setHealth(){
		if (imc < 18){
			if (bloodType .equals(typeA) || bloodType .equals(typeAB))
				health = "Riesgo bajo";
			else
				health = "Riesgo moderado";
		}	
		else if (imc >= 18 && imc <=25)
			health = "Riesgo bajo";
		else{ 
			if (bloodType .equals(typeA) || bloodType .equals(typeB) || bloodType .equals(typeO))
				health = "Riesgo alto";
			else
				health = "Riesgo moderado";
		}
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
	
	public void setFood(){
		int kWeight = weight - 48;
		if (weight < 30)
			food = weight * 0.80;
		else if (weight >= 30 && weight <=48)
			food = weight * 1.10;
		else
			food = 40 + (0.4 * kWeight);
	}
	
	public boolean getVaccine(){
		return vaccine;
	}
	
	public void setVaccine(boolean vac){
		vaccine = vac;
	}
	public Date getVaccineDate(){
		return vaccineDate;
	}
	
	public void setVaccineDate(Date vaccineDate){
		this.vaccineDate = vaccineDate;
	}
	
	public String searchVocals(){
		String theName = "";
		boolean vocal = false;
		String n = name.toLowerCase(); //modification of name

		if (name != null){
			if (n.charAt(0) == 'a' || n .charAt(0) == 'e' || n .charAt(0) == 'i' || n .charAt(0) == 'o' || n .charAt(0) == 'u'  )
			{
				vocal = true;
			}
			else{
				vocal = false;
			}
			if (n .charAt(name.length()-1) == 'a' || n .charAt(name.length()-1) == 'e' || n .charAt(name.length()-1) == 'i' || 
			n .charAt(name.length()-1) ==  'o' || n .charAt(name.length()-1) == 'u'){
			}
			else{
				vocal = false;
			}
			if (vocal)
				theName = name;
		}
		if (n.charAt(0) == 'a' || n .charAt(0) == 'e' || n .charAt(0) == 'i' || n .charAt(0) == 'o' || n .charAt(0) == 'u'  )
		{
			vocal = true;
		}
		else{
			vocal = false;
		}
		if (n .charAt(name.length()-1) == 'a' || n .charAt(name.length()-1) == 'e' || n .charAt(name.length()-1) == 'i' || 
		n .charAt(name.length()-1) ==  'o' || n .charAt(name.length()-1) == 'u'){
		}
		else{
			vocal = false;
		}
		if (vocal)
			theName = name;	
		return theName;
	}
	
}
