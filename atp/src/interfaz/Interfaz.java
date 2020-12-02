package interfaces;

import dominio.*;

public class Interfaz {
	public static void iniciar(String args[]) {
		if (args[0].equals("consulta")) {
			Consulta consulta = new Consulta();
			Modelo modelo = new Modelo();
			AppendStrFile a1 = new AppendStrFile();
			a1.appendStrToFile(./test_data);
			modelo.aprenderModelo();
			System.out.println("El jugador ganador es:" + modelo.aplicarModelo(args[1], args[2]) + "\n");
		}
		else System.out.println("Opción incorrecta \n");
	}
}
