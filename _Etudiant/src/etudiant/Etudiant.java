package etudiant;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import bean.Cours;
import service.Ietudiant;

public class Etudiant {

	public static void main(String[] args) {
		Registry reg;
		try {
			reg = LocateRegistry.getRegistry(2000);
			Ietudiant stub = (Ietudiant) reg.lookup("rmi://localhost:2000/nacer");
			System.out.println("Hello Eleve!");
			List<Cours> cours = stub.consulterCours();
			for(Cours e:cours) {
				System.out.println("Id Client : " + e.getIntitule() + " Nom Client : " + e.getNombre_de_seances() + " Pronom :" + e.getDisponibles() );
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
