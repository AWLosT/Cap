package Proyecto;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Agenda {
	static String dato;
Contacto[]lista = new Contacto[100];//Se crea una nueva lista de tipo contacto
private int contador=0;//Contador de objetos
//VALIDACIONES
public void Consultar(String nombre, String apellidoP, String apellidoM, String mediosCon)
{
for (int i = 0; i < contador; i++) {
	if((nombre.equalsIgnoreCase(this.lista[i].Get_Nombre()) && (apellidoP.equalsIgnoreCase(this.lista[i].Get_ApellidoP())))){
		System.out.println("Ya existe un contacto con ese nombre.");}
}	
}
//AGREGAR
public void Agregar(String nombre, String apellidoP, String apellidoM,String mediosCon)
{
if (contador<100) {
	this.lista[contador] = new Contacto();
	this.lista[contador].Set_Nombre(nombre);
	this.lista[contador].Set_ApellidoP(apellidoP);
	this.lista[contador].Set_ApellidoM(apellidoM);
	this.lista[contador].Set_MediosCon(mediosCon);
	this.contador++;
	ordenar();
}
else {
	System.out.println("La agenda está llena");
}
}
//BUSCAR
public void Buscar(String nombre, String apellidoP)
{
boolean encontrado= false;
for (int i = 0; i < contador; i++) {
	if ((nombre.equalsIgnoreCase((this.lista[i].Get_Nombre()))&&(apellidoP.equalsIgnoreCase(this.lista[i].Get_ApellidoP())))) {//Compara que sea el nombre correcto
		System.out.println(this.lista[i].Get_Nombre() + " " + this.lista[i].Get_ApellidoP() + ": " + this.lista[i].Get_MediosCon() );//Imprime
	    encontrado=true;
	}
}
if (!encontrado) {
	System.out.println("No se encontró registro de ese contacto.");
}
}
//ORDENAR POR NOMBRE
public void ordenar()//Se usa el metodo burbuja
{
	int n = this.contador;
	String nombre1, nombre2;
    if (contador>=2) {
    	for (int i = 1; i <= n-1; i++) {
			for (int j = 1; j <= n-i; j++) {
				nombre1 = this.lista[j-1].Get_Nombre();
				nombre2 = this.lista[j].Get_Nombre();
				if (nombre1.charAt(0) > nombre2.charAt(0)) {
					Contacto tmp = this.lista[j-1];
					this.lista[j-1]= this.lista[j];
					this.lista[j]=tmp;
				}
			}
		}
	}
}
//ELIMINAR TODOS LOS CONTACTOS
public void eliminart()
{

}
//ELIMINAR
public void eliminar()
{
	boolean encontrado=false;
	System.out.println("Nombre del contacto a eliminar:");
	pedirdatos();
	String eliminar = dato;
	System.out.println("Apellido Paterno del contacto a eliminar:");
	pedirdatos();
	String eliminar1 = dato;
	if (contador==0) {
		System.out.println("No hay contactos.");
	} else {
		for (int i = 0; i < contador; i++) {
			if ((eliminar.equalsIgnoreCase((this.lista[i].Get_Nombre()))&&(eliminar1.equalsIgnoreCase(this.lista[i].Get_ApellidoP())))) {
				System.out.println(i+1+". "+this.lista[i].Get_Nombre() +" " +this.lista[i].Get_ApellidoP() + ": " + this.lista[i].Get_MediosCon());
			    encontrado=true;
			}
		}
	if(encontrado)
	{
		System.out.println("Que contacto quieres eliminar, introduce algún medio de contacto asociado.");
		pedirdatos();
		String medio = dato;//Aqui falta comparar el medio y eliminar el contacto si el medio es igual.
	
	}
	}
	
}
//MOSTRAR
public void mostrar()
{
if (this.contador == 0) {
	System.out.println("|        NO HAY CONTACTOS        |");
	System.out.println("|________________________________|");

}	
else {
	for (int i = 0; i < contador; i++) {
		System.out.printf("%-34s","|"+this.lista[i].Get_Nombre());
		System.out.println();
		System.out.printf("%-34s","|"+this.lista[i].Get_ApellidoP());
		System.out.println();
		System.out.printf("%-34s","|"+this.lista[i].Get_MediosCon());
		System.out.println();
		System.out.println("|________________________________|");
	}
}
}
//MODIFICAR
public void modificar() {
boolean encontrado=false;
System.out.println("Nombre del contacto a modificar:");
pedirdatos();
String modificar = dato;
System.out.println("Apellido Paterno del contacto a modificar:");
pedirdatos();
String modificar1 = dato;
if (contador==0) {
	System.out.println("No hay contactos.");
} else {
	for (int i = 0; i < contador; i++) {
		if ((modificar.equalsIgnoreCase((this.lista[i].Get_Nombre()))&&(modificar1.equalsIgnoreCase(this.lista[i].Get_ApellidoP())))) {
			System.out.println(i+1+". "+this.lista[i].Get_Nombre() +" " +this.lista[i].Get_ApellidoP() + ": " + this.lista[i].Get_MediosCon());
		    encontrado=true;
		}
	
	if(encontrado)//Falta poner condicionales para todos y poner dependiendo el tipo de persona.
	{
		System.out.println("Que es lo que quieres modificar?: introduce 1: para el nombre, 2: para el apellido paterno, 3: para el medio de contacto");
        pedirdatos();
        String modifi = dato;
        switch (modifi) {
		case "1":
			System.out.println("Dame el nuevo nombre");
			pedirdatos();
			String nombrenuevo = dato;
			this.lista[i].Set_Nombre(nombrenuevo);
			break;

		case "2":
			System.out.println("Dame el nuevo apellido paterno");
			pedirdatos();
			String nuevoapp = dato;
			this.lista[i].Set_Nombre(nuevoapp);
			break;
			
		case "3":
			System.out.println("Dame el nuevo apellido materno");
			pedirdatos();
			String nuevoapm = dato;
			this.lista[i].Set_Nombre(nuevoapm);
			break;
			
		default:
			System.out.println("Introduce un valor correcto");
			break;
		}
	}
	else{System.out.println("No hay contactos similares.");}
}
}
}

public static void pedirdatos()
{
	try {
BufferedReader dato1 = new BufferedReader(new InputStreamReader(System.in));
	dato= dato1.readLine().toUpperCase();
} catch (IOException e) {
	Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, e);
	e.printStackTrace();
}
}
}