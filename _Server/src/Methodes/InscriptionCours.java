package Methodes;

public class InscriptionCours {
	
	private String cours ;
	private String  iDetudinat;
	private String  nomEtudinat;
	
	
	public InscriptionCours(String cours, String iDetudinat, String nomEtudinat) {
		super();
		this.cours = cours;
		this.iDetudinat = iDetudinat;
		this.nomEtudinat = nomEtudinat;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public String getiDetudinat() {
		return iDetudinat;
	}
	public void setiDetudinat(String iDetudinat) {
		this.iDetudinat = iDetudinat;
	}
	public String getNomEtudinat() {
		return nomEtudinat;
	}
	public void setNomEtudinat(String nomEtudinat) {
		this.nomEtudinat = nomEtudinat;
	}
	
	
	
	
	
	
	

	
	

}
