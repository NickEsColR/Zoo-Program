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
		if (theName == null)
			theName = "no hay animales que empiecen y terminen en vocal";
		return theName;
<<<<<<< HEAD
	}
	
		public  String seeHabitat(int election){
			String cage = "";
			switch(election){
				case 1:
				if(habitat1.getKangaroo3() != null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 2:
				if(habitat2.getKangaroo3() != null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 3:
				if(habitat3.getKangaroo3() != null)
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
	public String getGender(int cage){
		String theGender = "";
		switch (cage){
			case 1:
			theGender = habitat1.getGender();
			break;
			case 2:
			theGender = habitat2.getGender();
			break;
			case 3:
			theGender = habitat3.getGender();
			break;
		}
		return theGender;
	}
	public String deleteKangaroo(int cage, int kg){
		String msj = "";
		Kangaroo nulled = new Kangaroo(null, 0, 0, null, null, null, false, null);
		switch (cage){
			case 1:
				switch (kg){
					case 1:
						habitat1.setKangaroo1(nulled);
					break;
					case 2:
						habitat1.setKangaroo2(nulled);
					break;
					case 3:
						habitat1.setKangaroo3(nulled);
					break;
				}
			case 2:
				switch (kg){
					case 1:
						habitat2.setKangaroo1(nulled);
					break;
					case 2:
						habitat2.setKangaroo2(nulled);
					break;
					case 3:
						habitat2.setKangaroo3(nulled);
					break;
				}
			switch (kg){
					case 1:
						habitat3.setKangaroo1(nulled);
					break;
					case 2:
						habitat3.setKangaroo2(nulled);
					break;
					case 3:
						habitat3.setKangaroo3(nulled);
					break;
				}
		}
		msj = "el canguro se borro correctamente";
		return msj;
	}
	public void setImc1a (){
		habitat1.setImc1();
	}
	public void  setImc1b (){
		habitat1.setImc2();
	}
	public void setImc1c (){
		habitat1.setImc3();
	}
	public void setImc2a (){
		habitat2.setImc1();
	}
	public void setImc2b (){
		habitat2.setImc2();
	}
	public void setImc2c (){
		habitat2.setImc3();
	}
	public void setImc3a (){
		habitat3.setImc1();
	}
	public void setImc3b (){
		habitat3.setImc2();
	}
	public void setImc3c (){
		habitat3.setImc3();
	}
	public void setWater1a(){
		habitat1.setWater1();
	}
	public void setWater1b(){
		habitat1.setWater2();
	}
	public void setWater1c(){
		habitat1.setWater3();
	}
	public void setWater2a(){
		habitat2.setWater1();
	}
	public void setWater2b(){
		habitat2.setWater2();
	}
	public void setWater2c(){
		habitat2.setWater3();
	}
	public void setWater3a(){
		habitat3.setWater1();
	}
	public void setWater3b(){
		habitat3.setWater2();
	}
	public void setWater3c(){
		habitat3.setWater3();
	}
	public void setHealth1a(){
		habitat1.setHealth1();
	}
	public void setHealth1b(){
		habitat1.setHealth2();
	}
	public void setHealth1c(){
		habitat1.setHealth3();
	}
	public void setHealth2a(){
		habitat2.setHealth1();
	}
	public void setHealth2b(){
		habitat2.setHealth2();
	}
	public void setHealth2c(){
		habitat2.setHealth3();
	}
	public void setHealth3a(){
		habitat3.setHealth1();
	}
	public void setHealth3b(){
		habitat3.setHealth2();
	}
	public void setHealth3c(){
		habitat3.setHealth3();
	}
	public int seeKangaroo1(){
		int kg = 0;
		kg = habitat1.seeKangaroo();
		return kg;
	}
	public int seeKangaroo2(){
		int kg = 0;
		habitat2.seeKangaroo();
		return kg;
	}
	public int seeKangaroo3(){
		int kg = 0;
		habitat3.seeKangaroo();
		return kg;
=======
>>>>>>> 32f60eacdfd1277b9afe94bca3da8d6e4f821b9a
	}
	
		public  String seeHabitat(int election){
			String cage = "";
			switch(election){
				case 1:
				if(habitat1.getKangaroo3() != null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 2:
				if(habitat2.getKangaroo3() != null)
					cage = "Esta jaula esta llena";
				else
					cage = "puede continuar";
				break;
				case 3:
				if(habitat3.getKangaroo3() != null)
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
	public String getGender(int cage){
		String theGender = "";
		switch (cage){
			case 1:
			theGender = habitat1.getGender();
			break;
			case 2:
			theGender = habitat2.getGender();
			break;
			case 3:
			theGender = habitat3.getGender();
			break;
		}
		return theGender;
	}
	public String deleteKangaroo(int cage, int kg){
		String msj = "";
		Kangaroo nulled = new Kangaroo(null, 0, 0, null, null, null, false, null);
		switch (cage){
			case 1:
				switch (kg){
					case 1:
						habitat1.setKangaroo1(nulled);
					break;
					case 2:
						habitat1.setKangaroo2(nulled);
					break;
					case 3:
						habitat1.setKangaroo3(nulled);
					break;
				}
			case 2:
				switch (kg){
					case 1:
						habitat2.setKangaroo1(nulled);
					break;
					case 2:
						habitat2.setKangaroo2(nulled);
					break;
					case 3:
						habitat2.setKangaroo3(nulled);
					break;
				}
			switch (kg){
					case 1:
						habitat3.setKangaroo1(nulled);
					break;
					case 2:
						habitat3.setKangaroo2(nulled);
					break;
					case 3:
						habitat3.setKangaroo3(nulled);
					break;
				}
		}
		msj = "el canguro se borro correctamente";
		return msj;
	}
	
}