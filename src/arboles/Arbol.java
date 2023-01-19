package arboles;

public class Arbol {
private int id;
private String nombreComun;
private String nombreCientifuico;
private String habitat;
private int altura;
private  String origen;

public void Arbol(int id, String nombreComun,String nombreCientifuico,String habitat,int altura,String origen) {
	this.id = id;
	this.nombreComun = nombreComun;
	this.nombreCientifuico = nombreCientifuico;
	this.habitat = habitat;
	this.altura = altura;
	this.origen = origen;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombreComun() {
	return nombreComun;
}
public void setNombreComun(String nombreComun) {
	this.nombreComun = nombreComun;
}
public String getNombreCientifuico() {
	return nombreCientifuico;
}
public void setNombreCientifuico(String nombreCientifuico) {
	this.nombreCientifuico = nombreCientifuico;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public String getOrigen() {
	return origen;
}
public void setOrigen(String origen) {
	this.origen = origen;
}

}
