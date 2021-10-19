package ctrl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.coche;


public class GestionFch {

	public static void writeData(String fileName, coche c) {

		try {
			FileOutputStream fch = new FileOutputStream(fileName);

			ObjectOutputStream buff = new ObjectOutputStream(fch);
		
			buff.writeObject(c);
						
			buff.close();
			fch.close();
		
		} catch (FileNotFoundException e) {

			System.err.println("ERROR: El fichero " + fileName + " no existe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR: No se puede escribir en el fichero");
		}

	}
	
	
	
	public static void writeData(String fileName, ArrayList<coche> listado) {

		try {
			FileOutputStream fch = new FileOutputStream(fileName);

			ObjectOutputStream buff = new ObjectOutputStream(fch);
		
			/*
			for(coche c : listado) {
				
				buff.writeObject(c);
			}*/
			
			buff.writeObject(listado);
		
						
			buff.close();
			fch.close();
		
		} catch (FileNotFoundException e) {

			System.err.println("ERROR: El fichero " + fileName + " no existe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR: No se puede escribir en el fichero");
		}

	}
	
	
	
	

	public static coche readData(String fileName) {
		
		coche c = null;

		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			c = (coche) buff.readObject();
			
			
			
			
			fch.close();
			buff.close();
			
		} catch (FileNotFoundException e) {

			System.err.println("ERROR: El fichero " + fileName + " no existe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR: No se puede leer el fichero");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
		
	}



	public static ArrayList<coche> leerArrayObj(String fileName) {
		
		ArrayList<coche> listado = new ArrayList();
		
		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			/*Object obj = buff.readObject();
					
			while (obj!= null) {
				
				if (obj instanceof coche) {
					listado.add((coche) obj);
				}
			obj =buff.readObject();
				
			}
			*/
			
			listado = (ArrayList<coche>) buff.readObject();
			
			
			fch.close();
			buff.close();
			
		} catch (FileNotFoundException e) {

			System.err.println("ERROR: El fichero " + fileName + " no existe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR: No se puede leer el fichero");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listado;
	}
}
