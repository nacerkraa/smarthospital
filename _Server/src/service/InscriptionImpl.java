package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import Methodes.ClientEleve;
import bean.Cours;



public class InscriptionImpl extends UnicastRemoteObject implements Ienseignant,Ietudiant {
	
	private List<Cours> LCours= new ArrayList<>();
	private String[] Leleve = new String[10] ;
	
	ClientEleve ce = new ClientEleve();
	

	public InscriptionImpl() throws RemoteException {
		super();
		
		
	}


	@Override
	public void ajouterCours(Cours c) throws RemoteException {
		LCours.add(c);
		
	}

	@Override
	public boolean inscrire(String nom_eleve, String intitule_cours) throws RemoteException {
		
		 
		return true;
	}

	@Override
	public List<Cours> consulterCours() throws RemoteException {
		
		LCours = ce.ListDipo();
		return LCours;
	}

	@Override
	public String[] consulterEleve(String intitule_cours) throws RemoteException {
		for (int i = 0; i < Leleve.length; i++) {
			String string = Leleve[i];
			
		}
		return Leleve;
	}

	

}