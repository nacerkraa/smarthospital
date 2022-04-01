package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import bean.Cours;

public interface Ienseignant extends Remote{
	public void ajouterCours(Cours c) throws RemoteException;
	public String[] consulterEleve (String intitule_cours) throws RemoteException;
}
