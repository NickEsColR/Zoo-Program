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
		String vocal = "";
		int vocal1 = kangaroo1.searchVocals();
		int vocal2 = 0;
		int vocal3 = 0;
		if (kangaroo2 != null)
			 vocal2 = kangaroo2.searchVocals();
		if (kangaroo3 != null)
			 vocal3 = kangaroo3.searchVocals();
		if(vocal1 > vocal2){
			if(vocal1 > vocal3)
				vocal = "kangaroo1" + vocal1;
			else 
				vocal = "kangaroo3" + vocal3;
		}
		else{
			if(vocal2 > vocal3)
				vocal = "kangaroo2" + vocal2;
			else
				vocal = "kangaroo3" + vocal3;
		}
		return vocal;
	}
}
