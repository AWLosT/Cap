package Proyecto;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UsoAgenda {
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		String key="1";
		do{
		System.out.println("__________________________________");
		System.out.println("|____________AGENDA______________|");
		System.out.println("|1.-: AGREGA NUEVO CONTACTO......|");
		System.out.println("|2.-: BUSCAR UN CONTACTO.........|");
		System.out.println("|3.-: MODIFICAR UN CONTACTO......|");
		System.out.println("|4.-: ELIMINAR UN CONTACTO.......|");
		System.out.println("|5.-: VACIAR AGENDA..............|");
		System.out.println("|0.-: SALIR......................|");
		System.out.println("|________________________________|");
		System.out.println("|___________CONTACTOS____________|");
		agenda.mostrar();
		try {BufferedReader teclado1 = new BufferedReader(new InputStreamReader(System.in));
		key=teclado1.readLine().toUpperCase();
		

		switch (key) {
		case "1":
			String nombre;
			String apellidoP;
			String mediosCon;
			String apellidoM;
			boolean validar;
			System.out.println("Introduzca el nombre");
			nombre=teclado1.readLine();
			System.out.println("Introduzca el Apellido Paterno");
			apellidoP=teclado1.readLine();
			System.out.println("Introduzca el medio de comunicacion");
			mediosCon=teclado1.readLine();
			System.out.println("Si tiene apellido materno, teclee si:");
			String valido=teclado1.readLine();
			if(valido.equalsIgnoreCase("si"))
			{
			System.out.println("Introduzca el apellidomaterno");
			apellidoM=teclado1.readLine();
			}
			else{apellidoM=" ";}
			agenda.Consultar(nombre, apellidoP, apellidoM, mediosCon);
			agenda.Agregar(nombre, apellidoP, apellidoM, mediosCon);
			break;
		case "2":
			System.out.println("Introduce el nombre a buscar:");
			nombre=teclado1.readLine().toUpperCase();
			System.out.println("Introduce el apellido paterno:");
			apellidoP=teclado1.readLine().toUpperCase();
			agenda.Buscar(nombre, apellidoP);
			break;
		case "3":
			agenda.modificar();
			break;
		case "4":
			agenda.eliminar();
			break;
		case "5":
			//mostrar
			break;
		case "6":
			agenda.eliminart();
			break;
		default:
			break;
		}  
		}
		catch (IOException e) {
			Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		}
		}while(key != "0");  
	}
}
