package Proyecto;

public class Estudiante extends Contacto{
	private String lugarN;
	private String carreraE;
	private String eMail;
	private String fechadeN;

	public Estudiante(){
		lugarN="Indefinido.";
		carreraE="Sin definir";
		eMail="ejemplo@ejemplo.com";
	}
	public Estudiante(String nombre, String apellidoP, String apellidoM, String mediosCon, String lugarN,String carreraE, String eMail, String fechadeN){
		super(nombre,apellidoP, apellidoM, mediosCon);
		this.lugarN=lugarN;
		this.carreraE=carreraE;
		this.eMail=eMail;
		this.fechadeN=fechadeN;
	}
	public void Set_LugarN(String lugarN)
	{this.lugarN=lugarN;}
	
	public String Get_LugarN()
	{return lugarN;}
	
	public void Set_CarreraE(String carreraE)
	{this.carreraE=carreraE;}
	
	public String Get_CarreraE()
	{return carreraE;}
	
	public void Set_Email(String eMail)
	{this.eMail=eMail;}
	
	public String Get_Email()
	{return eMail;}
	
	public void Set_FechadeN(String fechadeN)
	{this.fechadeN=fechadeN;}

	public String Get_FechadeN()
	{return fechadeN;}
}
