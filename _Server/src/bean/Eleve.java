package bean;

public class Eleve {
	
	private long id;
	private String nom;
	public Eleve(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
