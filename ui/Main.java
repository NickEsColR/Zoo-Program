package ui;

import model.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

	//dependence
	
	private Display zoo;
	
	public Main(){
		boolean dv = false;
		String needVaccine = "";
		int cont = 0;
		Scanner option = new Scanner(System.in);
		//necesito saber como llamar el metodo de calculo correctamente
		Dragon female = new Dragon(0.4, 0.5, 1.6, 1.2);
		Dragon male = new Dragon(0.5, 0.6, 1.38, 1.035);
		DragonZone dz = new DragonZone(38, true, male, female);
		Date dk4 = new Date(18, 11, 2018);//first Kangaroo in habitat3
		Kangaroo k4 = new Kangaroo("Ezio", 44, 1.3, "Male", "AB", dk4, true, null);//editar
		KangarooZone kz3 = new KangarooZone(1, 78, 10.4, k4);//third habitat3
		Date vdk3 = new Date(24,07, 2007);//first kangaroo in habitat2
		Date dk3 = new Date(24, 07, 2017);//first kangaroo in habitat2
		Kangaroo k3 = new Kangaroo("Felicity", 30, 1.2, "Female", "o", dk3,false, vdk3);//first kangaroo in habitat2
		KangarooZone kz2 = new KangarooZone(1, 54, 9.6, k3);//second habitat; modificar el 5 con la creacion del segundo canguro
		Date vdk1 = new Date(2, 5, 2017);//first kangaroo in habitat1
		Date dk1 = new Date(2, 5, 2016); //first kangaroo in habitat1
		Kangaroo k1 = new Kangaroo("Stone", 70, 1.4, "Male", "AB", dk1, false, vdk1); //first kangaroo in habitat1
		KangarooZone kz1 = new KangarooZone(2, 10, 19.2, k1); //first habitat
		Date vdk2 = new Date(20, 10, 2017);//second kangaroo in habitat 
		Date dk2 = new Date(20, 10, 2016);//second kangaroo in habitat1
		Kangaroo k2 = new Kangaroo("Dany", 40, 1.0, "Female", "A", dk2, false, vdk2); //second kangaroo in habitat1
		kz1.setKangaroo2(k2);
		zoo = new Display(1500, kz1, kz2, kz3, dz );
		zoo.setImc1a();
		zoo.setImc1b();
		zoo.setImc2a();
		zoo.setImc3a();
		zoo.setWater1a();
		zoo.setWater1b();
		zoo.setWater2a();
		zoo.setWater3a();
		zoo.setHealth1a();
		zoo.setHealth1b();
		zoo.setHealth2a();
		zoo.setHealth3a();
		while (cont != 6){
			showMenu();
		
			int election = option.nextInt();
			switch (election){
				case 1:
					System.out.println("*************************************************************************");
					System.out.println("Digite la jaula a donde lo va a poner");
					int cage = option.nextInt();
					System.out.println(zoo.seeHabitat(cage));
					String kg = addKangaroo(cage);
					System.out.println(kg);
					System.out.println("*************************************************************************");
				break;
				case 2:
					System.out.println("*************************************************************************");
					System.out.println("¿En que jaula se encuentra el canguro a eliminar?");
					cage = option.nextInt();
					System.out.println("¿cual es el numero del canguro a eliminar");
					int delete = option.nextInt();
					System.out.println(deleteKangaroo(cage, delete));
					System.out.println("*************************************************************************");
				break;
				case 3:
					System.out.println("*************************************************************************");
					System.out.println("Digite la jaula en la que se encuentra el canguro que desea cambiar");
					cage = option.nextInt();
					System.out.println("Digite la jaula a donde va a poner el canguro");
					int cage2 = option.nextInt();
					System.out.println(zoo.seeHabitat(cage2));
					System.out.println("Digite la posicion del canguro en la jaula inicial");
					int kangaroo = option.nextInt();
					System.out.println("*************************************************************************");
				break;
				case 4:
					String theName = zoo.searchVocals();
					System.out.println("*************************************************************************");
					System.out.println("el animal cuyo nombre empieza por vocal y termina por vocal ");
					System.out.println(theName);
					System.out.println("*************************************************************************");
				break;
				case 5:
					System.out.println("*************************************************************************");
					System.out.println("Digite la jaula en la que se encuentra el canguro");
					cage = option.nextInt();
					System.out.println("Digite el canguro del cual quiere conocer su fecha de vacunacion");
					kangaroo = option.nextInt();
					dv = zoo.getVaccine(cage,kangaroo);
					if (dv)
						needVaccine = "necesita vacuna";
					else
						needVaccine = "no necesita vacuna";
					System.out.println(needVaccine);
					System.out.println("*************************************************************************");
				break;
				case 6:
					System.out.println("*************************************************************************");
					System.out.println("que vuelva pronto");
					System.out.println("*************************************************************************");
					cont = 6;
				break;
				default:
					System.out.println("*************************************************************************");
					System.out.println("Porfavor elija una opcion valida");
					System.out.println("*************************************************************************");
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();

	}
	
	public void showMenu(){
		
		System.out.println("digite el numero de la opcion que desea");
		System.out.println("1. Crear un canguro nuevo y asignarlo a una jaula");
		System.out.println("2. Eliminar un canguro");
		System.out.println("3. Cambiar el canguro de jaula");
		System.out.println("4. Animal(es) del zoologico cuyo nombre empieza y termina en vocal");
		System.out.println("5. Ver fecha de vacunacion de los canguros");
		System.out.println("6. Salir del programa");
	}
	
	public String addKangaroo(int cage){
		Scanner option = new Scanner(System.in);
		KangarooZone kz1 = null;
		KangarooZone kz2 = null;
		KangarooZone kz3 = null;
		int putKangaroo = 0;
		int theDayV = 0;
		int theMonthV = 0;
		int theYearV = 0;
		String msj = "";
		boolean vaccine = false;
		System.out.println("Digite el nombre del canguro");
		String theName = option.nextLine();
		System.out.println("Digite el peso del canguro");
		int theWeight = option.nextInt();
		System.out.println("Digite la altura del canguro en centimetros");
		double theHeight = option.nextInt();
		hegith = height / 100;
		System.out.println("Digite el genero del canguro");
		String theGender = option.nextLine();
		System.out.println("Digite el tipo de sangre del canguro");
		String theBlood = option.nextLine();
		System.out.println("Digite el dia de nacimiento del canguro");
		int theDay = option.nextInt();
		System.out.println("Digite el mes de nacimiento del canguro");
		int theMonth = option.nextInt();
		System.out.println("Digite el año de nacimiento del canguro");
		int theYear = option.nextInt();
		System.out.println("¿El canguro esta vacunado? si o no");
		String theVaccine = option.nextLine();
		if (theVaccine .equalsIgnoreCase("si"))
			vaccine = true;
		else if(theVaccine .equalsIgnoreCase("no"))
			vaccine = false;
		if(vaccine){
			System.out.println("Digite el dia de vacunacion del canguro");
			theDayV = option.nextInt();
			System.out.println("Digite el mes de vacunacion del canguro");
			theMonthV = option.nextInt();
			System.out.println("Digite el año de vacunacion del canguro");
			theYearV = option.nextInt();
		}
		
		if (theGender .equalsIgnoreCase("male")){
			if(theGender .equalsIgnoreCase(zoo.getGender(cage)))
				msj = "ya existe un macho en esta jaula";
		}
		else{
			Date vdkn = new Date(theDayV, theMonthV, theYearV);//vaccine date for the new kangaroo
			Date dkn = new Date(theDay, theMonth, theYear);//born date for the new kangaroo
			Kangaroo kn = new Kangaroo(theName, theWeight, theHeight, theGender, theBlood, dkn,vaccine, vdkn);//a new kangaroo is created
			switch(cage){
				case 1:
					putKangaroo = zoo.seeKangaroo1();
					switch(putKangaroo){
						case 1:
							kz1.setKangaroo1(kn);
						break;
						case 2:
							
							kz2.setKangaroo1(kn);
						break;
						case 3:
							
							kz3.setKangaroo1(kn);
						break;
					}
				break;
				case 2:
					putKangaroo = zoo.seeKangaroo2();
					switch(putKangaroo){
						case 1:
							kz1.setKangaroo2(kn);
						break;
						case 2:
							kz2.setKangaroo2(kn);
						break;
						case 3:
							kz3.setKangaroo2(kn);
						break;
					}
				break;
				case 3:
					putKangaroo = zoo.seeKangaroo3();
					switch(putKangaroo){
						case 1:
							kz1.setKangaroo3(kn);
						break;
						case 2:
							kz2.setKangaroo3(kn);
						break;
						case 3:
							kz3.setKangaroo3(kn);
						break;
					}
				break;
			}
			

			msj = "el canguro se ha creado";
		}
		return msj;
	}		
	public String deleteKangaroo(int cage, int kg){
		String msj = "";
		msj = zoo.deleteKangaroo(cage,kg);
		return msj;
	}
}
	
	
