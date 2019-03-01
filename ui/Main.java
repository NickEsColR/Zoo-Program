package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//dependence
	
	private Display zoo;
	
	public Main(){
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
					System.out.println("Eliminar un canguro");
					System.out.println("*************************************************************************");
				break;
				case 3:
					System.out.println("*************************************************************************");
					System.out.println("Cambiar el canguro de jaula");
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
					System.out.println("Fecha de vacunacion del kanguro");
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
		System.out.println("4. Animal del zoologico con mas vocales");
		System.out.println("5. Ver fecha de vacunacion de los canguros");
		System.out.println("6. Salir del programa");
	}
	
	public String addKangaroo(int cage){
		String msj = "";
		boolean vaccine = false;
		System.out.println("Digite el nombre del canguro");
		String theName = option.nextInt();
		System.out.println("Digite el peso del canguro");
		int theWeight = option.nextInt();
		System.out.println("Digite la altura del canguro");
		double theHeight = option.nextInt();
		System.out.println("Digite el genero del canguro");
		String theGender = option.nextInt();
		System.out.println("Digite el tipo de sangre del canguro");
		String theBlood = option.nextInt();
		System.out.println("Digite el dia de nacimiento del canguro");
		int theDay = option.nextInt();
		System.out.println("Digite el mes de nacimiento del canguro");
		int theMonth = option.nextInt();
		System.out.println("Digite el año de nacimiento del canguro");
		int theYear = option.nextInt();
		System.out.println("¿El canguro esta vacunado? si o no");
		String theVaccine = option.nextInt();
		if (theVaccine .equalsIgnoreCase("si"))
			vaccine = true;
		else if(theVaccine .equalsIgnoreCase("no"))
			vaccine = false;
		if(vaccine){
			System.out.println("Digite el dia de vacunacion del canguro");
			int theDayV = option.nextInt();
			System.out.println("Digite el mes de vacunacion del canguro");
			int theMonthV = option.nextInt();
			System.out.println("Digite el año de vacunacion del canguro");
			int theYearV = option.nextInt();
		}
		else{
			theDayV = null;
			theMonthV = null;
			theYearV = null;
		}
		if (theGender .equalsIgnoreCase("male"){
			if(theGender .equalsIgnoreCase(zoo.getGender(cage))
				msj = "ya existe un macho en esta jaula";
		}
		else{
			Date dk4 = new Date(theDayV, theMonthV, theYearV);//vaccine date for the new kangaroo
			Date dk4 = new Date(theDay, theMonth, theYear);//born date for the new kangaroo
			Kangaroo kn = new Kangaroo(theName, theWeight, theHeight, theGender, theBlood, dkn,vaccine, vdkn);//a new kangaroo is created
			msj = "el canguro se ha creado";
		}
		return msj;
	}		
	
	}
	
}	
