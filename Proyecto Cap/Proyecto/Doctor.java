package Proyecto;

public class Doctor extends Contacto {
	private String especial;
	private String nombrehos;
	private String direcch;
	private String fechadeN;
	public Doctor(String nombre, String apellidoP, String apellidoM, String mediosCon, String especial, String nombrehos, String direcch, String fechadeN)
	{
		super(nombre, apellidoP, apellidoM, mediosCon);
		this.especial=especial;
		this.nombrehos=nombrehos;
		this.direcch=direcch;
		this.fechadeN=fechadeN;
	}
	
	public void Set_Especial(String especial)
	{this.especial=especial;}
	
	public String Get_Especial()
	{return especial;}
	
	public void Set_NombreHos(String nombrehos)
	{this.nombrehos=nombrehos;}
	
	public String Get_NombreHos()
	{return nombrehos;}

	public void Set_Direcch(String direcch)
	{this.direcch=direcch;}
	
	public String Get_Direcch()
	{return direcch;}
	
	public void Set_FechadeN(String fechadeN)
	{this.fechadeN=fechadeN;}

	public String Get_FechadeN()
	{return fechadeN;}
}
