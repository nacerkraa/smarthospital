package bean;

import java.io.Serializable;

public class Cours implements Serializable{
	private String intitule;
	private int disponibles;
	private int nombre_de_seances;
	
	
	public Cours(String intitule, int disponibles, int nombre_de_seances) {
		super();
		this.intitule = intitule;
		this.disponibles = disponibles;
		this.nombre_de_seances = nombre_de_seances;
	}
	
	
	
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getDisponibles() {
		return disponibles;
	}
	public void setDisponibles(int disponibles) {
		this.disponibles = disponibles;
	}
	public int getNombre_de_seances() {
		return nombre_de_seances;
	}
	public void setNombre_de_seances(int nombre_de_seances) {
		this.nombre_de_seances = nombre_de_seances;
	}
	
	
	
	
	
	
	
	
}
