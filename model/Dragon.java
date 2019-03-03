package model;

public class Dragon
{

	//atributes
	
	private double weight;
	private double height;
	private double imc;
	private double water; 
	
	//metodos
	
	public Dragon(double weight, double height){
		this.weight = weight;
		this.height = height;
		this.imc = setImc();
		this.water = setWater();
	}
	
	public double getWeight(){
	  return weight;
	}
	
	public void setWeigth(double theWeight){
	  weight = theWeight;
	}
	
	public double getHeight(){
	  return height;
	}
	
	public void setHeight(double theHeight){
	  height = theHeight;
	}
	
	public double getImc(){
		return imc;
	}
	
	public double setImc(){
		imc = weight / (height * height);
		return imc;
		
	}
	
	public double getWater(){
	  return water;
	}
	
	public double setWater(){
	  water = imc * 0.75;
	  return water;
	  
	}
}