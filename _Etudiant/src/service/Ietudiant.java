package service;

import java.rmi.RemoteException;
import java.util.List;

import bean.Cours;

public interface Ietudiant {
	
	public List<Cours> consulterCours() throws RemoteException;
	public boolean inscrire(String nom_eleve, String intitule_cours) throws RemoteException;

}
