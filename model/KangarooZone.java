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
	
	public KangarooZone(int kangarooNumber, int code, double area, Kangaroo kangaroo1){
	  this.kangarooNumber = kangarooNumber;
	  this.code = code;
	  this.area = area;
	  this.kangaroo1 = kangaroo1;
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
	
	public void setArea(double theArea){
	  area = theArea;
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
		theName += kangaroo1.searchVocals() + " ";
		if (kangaroo2 != null)
			theName += kangaroo2.searchVocals() + " ";
		if (kangaroo3 != null)
			theName += kangaroo3.searchVocals() + " ";
		return theName;
	}
	public String getGender(){
		String theGender = "";
		if (kangaroo1.getGender() .equalsIgnoreCase("male"))
			theGender = kangaroo1.getGender();
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
}
