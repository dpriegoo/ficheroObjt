package view;

import java.util.ArrayList;

import model.coche;

public class Principal {

	public static void main(String[] args) {
		String fileName = "archivos/coches.dat";
		
		escritura(fileName);
		lectura(fileName);

	}

	private static void lectura(String fileName) {
		//coche cocheLeido = ctrl.GestionFch.readData(fileName);
		//System.out.println(cocheLeido);
		
		ArrayList<coche> lst = ctrl.GestionFch.leerArrayObj(fileName);
		
		for (coche c : lst) {
			System.out.println(c);
		}
		
	}

	private static void escritura(String fileName) {
		
		ArrayList<coche> lst = new ArrayList<>();
		
		lst.add(new coche ("Renault", "Clio", 1200));
		lst.add(new coche ("Ford", "Megane", 1300));
		
		ctrl.GestionFch.writeData(fileName, lst);
		

	}

}
