package Proyecto;

public class Deportista extends Contacto{
private String genero;
private String deporte;
private String fechadeN;
public Deportista(String nombre, String apellidoP, String apellidoM,String mediosCon, String genero, String deporte, String fechadeN)
{
super(nombre, apellidoP, apellidoM, mediosCon);	
this.genero=genero;
this.deporte=deporte;
this.fechadeN=fechadeN;
}
public void Set_Genero(String genero)
{this.genero=genero;}

public String Get_Genero()
{return genero;}

public void Set_Deporte(String deporte)
{this.deporte=deporte;}

public String Get_Deporte()
{return deporte;}

public void Set_FechadeN(String fechadeN)
{this.fechadeN=fechadeN;}

public String Get_FechadeN()
{return fechadeN;}
}
