package interfaz;

import dominio.*;

public class Interfaz {
	public static void iniciar(String args[]) {
		if (args[0].equals("consulta")) {
			Consulta consulta = new Consulta(Integer.parseInt(args[1]), args[2], args[3],
				Integer.parseInt(args[4]),Integer.parseInt(args[5]),Integer.parseInt(args[6]),Integer.parseInt(args[7]));
			Modelo modelo = new Modelo();
			modelo.aprenderModelo();
			System.out.println("El jugador ganador es:" + modelo.aplicarModelo(consulta));
		}
		else System.out.println("Opción incorrecta \n");
	}
}
