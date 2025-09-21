package Practica2;

public class Imagen {
	private int renglones;
	private int columnas;
	private int[] pixeles;

	public Imagen(int r, int c, int[] p) {
		this.renglones = r;
		this.columnas = c;
		this.pixeles = p;
	}

	public int[] getPixeles() {
		return pixeles;
	}
}