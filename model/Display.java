package model;

public class Display{
	
	//constant
	
	public final static int distance = 1500;
	
	//relations
	
	private KangarooZone habitat1;
	private KangarooZone habitat2;
	private KangarooZone habitat3;
	private DragonZone habitat4;
	
	//metodos
	
	public Display( KangarooZone habitat1, KangarooZone habitat2, KangarooZone habitat3, DragonZone habitat4){
		
		this.habitat1 = habitat1;
		this.habitat2 = habitat2;
		this.habitat3 = habitat3;
		this.habitat4 = habitat4;
	}
	
	
	public int getDistance(){
		return distance;
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
	public void deleteKangaroo(int cage, int kg){
		Kangaroo nulled = new Kangaroo("", 0, 0, "", "", null, false, null);
		switch (cage){
			case 1:
				switch (kg){
					case 1:
						if (habitat1.seeKangaroo() != 1)
							habitat1.setKangaroo1(nulled);
					break;
					case 2:
						if (habitat1.seeKangaroo() != 2)
							habitat1.setKangaroo2(nulled);
					break;
					case 3:
						if (habitat1.seeKangaroo() != 3)
							habitat1.setKangaroo3(nulled);
					break;
				}
			break;
			case 2:
				switch (kg){
					case 1:
						if (habitat2.seeKangaroo() != 1)
							habitat2.setKangaroo1(nulled);
					break;
					case 2:
						if (habitat2.seeKangaroo() != 2)
							habitat2.setKangaroo2(nulled);
					break;
					case 3:
						if (habitat2.seeKangaroo() != 3)
							habitat2.setKangaroo3(nulled);
					break;
				}
			break;
			case 3:
				switch (kg){
					case 1:
						if (habitat3.seeKangaroo() != 1)
							habitat3.setKangaroo1(nulled);
					break;
					case 2:
						if (habitat3.seeKangaroo() != 2)
							habitat3.setKangaroo2(nulled);
					break;
					case 3:
						if (habitat3.seeKangaroo() != 3)
							habitat3.setKangaroo3(nulled);
					break;
				}
			break;
		}
	}
	
	public int seeKangaroo1(){
		int kg = 0;
		kg = habitat1.seeKangaroo();
		return kg;
	}
	public int seeKangaroo2(){
		int kg = 0;
		kg = habitat2.seeKangaroo();
		return kg;
	}
	public int seeKangaroo3(){
		int kg = 0;
		kg = habitat3.seeKangaroo();
		return kg;
	}
	
	public String getVaccine(int cage, int kg){
		String dv = "";
		switch (cage){
			case 1:
				dv = habitat1.getVaccine(kg);
			break;
			case 2:
				dv = habitat2.getVaccine(kg);
			break;
			case 3:
				dv = habitat3.getVaccine(kg);
			break;
		}
		return dv;
	}
	
	public Kangaroo copyKangaroo(int habitat, int kangaroo){
		Kangaroo kChange = null;
		switch(habitat){
			case 1:
				switch(kangaroo){
					case 1:
						if(habitat1.getKangaroo1() != null)
							kChange = habitat1.getKangaroo1();
					break;
					case 2:
						if(habitat1.getKangaroo2() != null)
							kChange = habitat1.getKangaroo2();
					break;
					case 3:
						if(habitat1.getKangaroo3() != null)
							kChange = habitat1.getKangaroo3();									
					break;
				}
			break;
			case 2:
				switch(kangaroo){
					case 1:
						if(habitat2.getKangaroo1() != null)
							kChange = habitat2.getKangaroo1();
					case 2:
						if(habitat2.getKangaroo2() != null)
							kChange = habitat2.getKangaroo2();
					break;
					case 3:
						if(habitat2.getKangaroo3() != null)
							kChange = habitat2.getKangaroo3();
					break;
				}
			break;
			case 3:
				switch(kangaroo){
					case 1:
						if(habitat3.getKangaroo1() != null)
							kChange = habitat3.getKangaroo1();
					break;
					case 2:
						if(habitat3.getKangaroo2() != null)
							kChange = habitat3.getKangaroo2();
					break;
					case 3:
						if(habitat3.getKangaroo3() != null)
							kChange = habitat3.getKangaroo3();
					break;
				}
			break;
		}
		return kChange;
	}
	public String changeKangaroo(int habitat, int cage, int kg, Kangaroo kNew){
		Kangaroo kChange = kNew;
		String msj = "";
		if(kChange == null){
				msj = "el canguro que selecciono no existe";
			}
		else if (getGender(habitat) .equalsIgnoreCase(kChange.getGender()))
				msj = "ya hay un macho en esta jaula";
		else
		{
			switch(habitat){
				case 1:
					switch (seeKangaroo1()){
						case 1:
							if(habitat1.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat1.setKangaroo1(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 2:
							if(habitat1.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat1.setKangaroo2(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 3:
							if(habitat1.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat1.setKangaroo3(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;	
					}
				break;
				case 2:
					switch (seeKangaroo1()){
						case 1:
							if(habitat2.fullHabitat())
								msj = "la jaula esta llena";
							else{	
								habitat2.setKangaroo1(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 2:
							if(habitat2.fullHabitat())
								msj = "la jaula esta llena";
							else{	
								habitat2.setKangaroo2(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 3:
							if(habitat2.fullHabitat())
								msj = "la jaula esta llena";
							else{	
								habitat2.setKangaroo3(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;	
					}
				break;
				case 3:
					switch (seeKangaroo1()){
						case 1:
								if(habitat3.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat3.setKangaroo1(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 2:
							if(habitat3.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat3.setKangaroo2(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;
						case 3:
								if(habitat3.fullHabitat())
								msj = "la jaula esta llena";
							else{
								habitat3.setKangaroo3(kChange);
								msj = "el canguro se ha cambiado correctamente";
							}
						break;	
					}
				break;
			}
		deleteKangaroo(cage, kg);
		}
		return msj;	
	}

}	
				
	
