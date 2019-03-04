package model;

public class KangarooZone
{
	//attributes
	
	private int kangarooNumber;
	private int code;
	private double area;
	
	//relations
	
	private Kangaroo kangaroo1;
	private Kangaroo kangaroo2;
	private Kangaroo kangaroo3;
	
	//metodo
	
	public KangarooZone(int kangarooNumber, int code, Kangaroo kangaroo1, Kangaroo kangaroo2){
	  this.kangarooNumber = kangarooNumber;
	  this.code = code;
	  this.area = setArea();
	  this.kangaroo1 = kangaroo1;
	  this.kangaroo2 = kangaroo2;
	  
	}
	
	public int getNumber(){
	  return kangarooNumber;
	}
	
	public void setNumber(int number){
	  kangarooNumber = number;
	}
	
	public int getCode(){
	  return code;
	}
	
	public void setCode(int theCode){
	  code = theCode;
	}
	
	public double getArea(){
	  return area;
	}
	
	public double setArea(){
		if (kangaroo1 != null){
			double area1 = kangaroo1.getHeight() * 8 ;
			area += area1;
		}
		if (kangaroo2 != null){
			double area2 = kangaroo2.getHeight()* 8;
			area += area2;
		}
		if (kangaroo3 != null){
			double area3 = kangaroo3.getHeight() * 8;
			area += area3;
		}
		return area;
	}
	
	public Kangaroo getKangaroo1(){
	  return kangaroo1;
	}
	
	public void setKangaroo1(Kangaroo kangaroo1){
	  this.kangaroo1 = kangaroo1;
	}
	
	public Kangaroo getKangaroo2(){
	  return kangaroo2;
	}
	
	public void setKangaroo2(Kangaroo kangaroo2){
	  this.kangaroo2 = kangaroo2;
	}
	
	public Kangaroo getKangaroo3(){
	  return kangaroo3;
	}
	
	public void setKangaroo3(Kangaroo kangaroo3){
	  this.kangaroo3 = kangaroo3;
	}
	
	public double getImc(){
		double imc = kangaroo1.getImc();
		return imc;
	}
	
	public String searchVocals(){
		String theName = "";
		if (kangaroo1 != null)
			theName += kangaroo1.searchVocals() + " ";
		if (kangaroo2 != null)
			theName += kangaroo2.searchVocals() + " ";
		if (kangaroo3 != null)
			theName += kangaroo3.searchVocals() + " ";
		return theName;
	}
	public String getGender(){
		String theGender = "";
		if(kangaroo1 != null){
			if (kangaroo1.getGender() .equalsIgnoreCase("male"))
				theGender = kangaroo1.getGender();
		}
		if(kangaroo2 != null){
			if (kangaroo2.getGender() .equalsIgnoreCase("male"))
				theGender = kangaroo2.getGender();
		}
		if(kangaroo3 != null){
			if (kangaroo3.getGender() .equalsIgnoreCase("male"))
			theGender = kangaroo3.getGender();
		}
	return theGender;

	}
	
	public int seeKangaroo(){
		int kg = 0;
		if (kangaroo1 == null)
			kg = 1;
		else if (kangaroo2 == null)
			kg = 2;
		else if (kangaroo3 == null)
			kg = 3;
		return kg;

	}
	public boolean getVaccine( int kg){
		
		boolean dv = false;
		switch (kg){
			case 1:
				if (kangaroo1 != null)
					dv = kangaroo1.getVaccine();
			break;
			case 2:
				if (kangaroo2 != null)
					dv = kangaroo2.getVaccine();
			break;
			case 3:
				if (kangaroo3 != null)	
					dv = kangaroo3.getVaccine();
			break;

		}
		return dv;
	}
	public String getGender1(){
		String gender = kangaroo1.getGender();
		return gender;
	}
	public String getGender2(){
		String gender = kangaroo2.getGender();
		return gender;
	}
	public String getGender3(){
		String gender = kangaroo3.getGender();
		return gender;
	}
	public boolean fullHabitat(){
		boolean full = false;
		if(kangaroo1 != null && kangaroo2 != null && kangaroo3 != null)
			full = true;
		return full;
	}
}
