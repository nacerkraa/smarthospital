package Methodes;

import java.util.ArrayList;
import java.util.List;

import bean.Cours;

public class ClientEnseignant {
	
	

	List<Cours> ListCours = new ArrayList<Cours>();
	Cours c1 = new Cours("SR",3, 1);
	Cours c2 = new Cours("PLF",4, 2);
	Cours c3 = new Cours("SD",0, 2);
	
	public ClientEnseignant() {
		
		ListCours.add(c1);
		ListCours.add(c2);
		ListCours.add(c3);
		
	}
	
	public List<Cours> ListCours() {
		return ListCours;
	}

	
	
	
	
	
	

	
	

}
