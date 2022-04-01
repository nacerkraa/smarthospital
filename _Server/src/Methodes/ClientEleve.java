package Methodes;

import java.util.ArrayList;
import java.util.List;

import bean.Cours;

public class ClientEleve {
	
	List<Cours> ListCours = new ArrayList<Cours>();
	List<Cours> PlaceDiponible = new ArrayList<Cours>();
	
	ClientEnseignant Le = new ClientEnseignant();
	
	
	
	public List<Cours> ListDipo() {
		
		ListCours = Le.ListCours();
		
		return ListCours;
	}

}
