package ui;

import model.*;
import java.util.Scanner;

public class Main{

	//dependence
	//prueba 1
	
	private Display zoo;
	
	public Main(){
		int cont = 0;
		Scanner option = new Scanner(System.in);
		//necesito saber como llamar el metodo de calculo correctamente
		Dragon female = new Dragon(0.4, 0.5, 1.6, 1.2);
		Dragon male = new Dragon(0.5, 0.6, 1.38, 1.035);
		DragonZone dz = new DragonZone(38, true, male, female);
		Date dk4 = new Date(18, 11, 2018);//first Kangaroo in habitat3
		Kangaroo k4 = new Kangaroo("Ezio", 44, 1.3, "Male", "AB", 26, 39, "Riesgo moderado", dk4, 48.4, true, null);//editar
		KangarooZone kz3 = new KangarooZone(1, 78, 10.4, k4);//third habitat3
		Date vdk3 = new Date(24,07, 2007);//first kangaroo in habitat2
		Date dk3 = new Date(24, 07, 2017);//first kangaroo in habitat2
		Kangaroo k3 = new Kangaroo("Felicity", 30, 1.2, "Female", "o", 21, 31.25, "Riesgo bajo", dk3, 33, false, vdk3);//first kangaroo in habitat2
		KangarooZone kz2 = new KangarooZone(1, 54, 9.6, k3);//second habitat; modificar el 5 con la creacion del segundo canguro
		Date vdk1 = new Date(2, 5, 2017);//first kangaroo in habitat1
		Date dk1 = new Date(2, 5, 2016); //first kangaroo in habitat1
		Kangaroo k1 = new Kangaroo("Stone", 70, 1.4, "Male", "AB", 35, 52.5, "Riesgo moderado", dk1, 48.8, false, vdk1); //first kangaroo in habitat1
		KangarooZone kz1 = new KangarooZone(2, 10, 19.2, k1); //first habitat
		Date vdk2 = new Date(20, 10, 2017);//second kangaroo in habitat 
		Date dk2 = new Date(20, 10, 2016);//second kangaroo in habitat1
		Kangaroo k2 = new Kangaroo("Dany", 40, 1.0, "Female", "A", 40, 60, "Riesgo alto", dk2, 44, false, vdk2); //second kangaroo in habitat1
		kz1.setKangaroo2(k2);
		zoo = new Display(1500, kz1, kz2, kz3, dz );
		
		while (cont != 6){
			showMenu();
			int election = option.nextInt();
			switch (election){
				case 1:
					System.out.println("*************************************************************************");
					System.out.println("crear un canguro nuevo");
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
					String vocal = zoo.searchVocals();
					System.out.println("*************************************************************************");
					System.out.println("El animal del zoologico con mas vocales es ");
					System.out.println(vocal);
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
}

