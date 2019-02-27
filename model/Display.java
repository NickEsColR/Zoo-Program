package model;

public class Display{
	
	//attributes
	
	private int distance;
	
	//relations
	
	private KangarooZone habitat1;
	private KangarooZone habitat2;
	private KangarooZone habitat3;
	private DragonZone habitat4;
	
	//metodos
	
	public Display(int distance, KangarooZone habitat1, KangarooZone habitat2, KangarooZone habitat3, DragonZone habitat4){
		this.distance = distance;
		this.habitat1 = habitat1;
		this.habitat2 = habitat2;
		this.habitat3 = habitat3;
		this.habitat4 = habitat4;
	}
	
	
	public int getDistance(){
		return distance;
	}
	
	public void setDistance(int theDistance){
		distance = theDistance;
	}
	
	public KangarooZone getHabitat1(){
		return habitat1;
	}
	
	public void setHabitat1(KangarooZone habitat1){
		this.habitat1 = habitat1;
	}
	
	public KangarooZone getHabitat2(){
		return habitat2;
	}
	
	public void setHabitat2(KangarooZone habitat2){
		this.habitat2 = habitat2;
	}
	
	public KangarooZone getHabitat3(){
		return habitat3;
	}
	
	public void setHabitat3(KangarooZone habitat3){
		this.habitat3 = habitat3;
	}
	
	public DragonZone getHabitat4(){
		return habitat4;
	}
	
	public void setHabitat4(DragonZone habitat4){
		this.habitat4 = habitat4;
	}
	
	public void getImc(){
		habitat1.getImc();
	}
	
	public String searchVocals(){
		String theName = "";
		theName += habitat1.searchVocals();
		theName += habitat2.searchVocals();
		theName += habitat3.searchVocals();
		return theName;
	}
	
		public  String seeHabitat(int election){
			String cage = "";
			switch(election){
				case 1:
				if(habitat1.getKangaroo3() == null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 2:
				if(habitat2.getKangaroo3() == null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 3:
				if(habitat3.getKangaroo3() == null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				default:
					cage = "elija una opcion valida";
				break;
		}
			return cage;
		}
}