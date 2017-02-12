package Proyecto;
import java.io.*;
import java.util.*;
public class Agenda {
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
    	for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= n-i; j++) {
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
try {
	
} catch (Exception e) {

}	
}
//ELIMINAR
public void eliminar()
{
	
}
//MODIFICAR
public void modificar() {
	try {
		
	} catch (Exception e) {
		
	}
}

}