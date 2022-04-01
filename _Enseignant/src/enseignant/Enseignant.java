package enseignant;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import bean.Cours;
import service.Ienseignant;


public class Enseignant {

	public static void main(String[] args) {
		Registry reg;
		try {
			reg = LocateRegistry.getRegistry(2000);
			Ienseignant stub = (Ienseignant) reg.lookup("rmi://localhost:2000/nacer");
			Cours C4 = new Cours("SAD",2,4);
			stub.ajouterCours(C4);
			
			stub.consulterEleve(null);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}

}
