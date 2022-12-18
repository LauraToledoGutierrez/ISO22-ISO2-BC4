package es.uclm.esi.iso2.bc04.pilgrimfy.dominio.app_servidor_0_1_0;

public class Ruta {

	private int idRuta;
	private String nombreRuta;
	private double distanciaKM;
	private String[] caminos;
	private String[] recursos;
	private String origen;
	private String destino;

	/**
	 * 
	 * @param idRuta
	 * @param nombreRuta
	 * @param distanciaKM
	 * @param caminos
	 * @param recursos
	 * @param origen
	 * @param destino
	 */
	public Ruta(int idRuta, String nombreRuta, double distanciaKM, String[] caminos, String[] recursos, String origen, String destino) {
		// TODO - implement Ruta.Ruta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param origen
	 * @param destino
	 */
	public Ruta buscarRuta_Server(String origen, String destino) {
		// TODO - implement Ruta.buscarRuta_Server
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param origen
	 * @param destino
	 * @param Caminos
	 */
	public Ruta crearRuta_Server(String origen, String destino, String[] Caminos) {
		// TODO - implement Ruta.crearRuta_Server
		throw new UnsupportedOperationException();
	}

}