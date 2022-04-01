package service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import bean.Cours;

public class Server {

	public static void main(String[] args) {
		try {
			InscriptionImpl obj = new InscriptionImpl();
			Registry reg = LocateRegistry.createRegistry(2000);
			reg.rebind("rmi://localhost:2000/nacer", obj);
			System.out.println("le Server est démarré..");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	}

