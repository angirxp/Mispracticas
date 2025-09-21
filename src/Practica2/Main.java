package Practica2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// a) Contar dígitos pares
		System.out.println("a) Dígitos pares en 24863: " + Metodos.contarDigitosPares(24863));

		// b) Palíndromo
		System.out.println("b) 'Anita lava la tina' es palíndromo: " + Metodos.esPalindromo("Anita lava la tina"));

		// c) Número capicúa
		System.out.println("c) 12321 es capicúa: " + Metodos.esCapicua(12321));

		// d) Contar ocurrencias de un flotante
		float[] arr = { 1.1f, 2.2f, 3.3f, 2.2f, 2.2f };
		System.out.println("d) Ocurrencias de 2.2: " + Metodos.contarOcurrencias(arr, 2.2f));

		// e) Organizar chaquiras
		int[] colores = { 1, 5, 4, 5, 3, 3, 2, 1, 1, 2, 3, 4, 4, 3, 3, 2, 2, 5, 5, 5, 1, 1, 2, 3, 4, 5, 3, 3, 2, 1 };
		int[] organizadas = Metodos.organizarChaquiras(colores);
		System.out.println("e) Chaquiras organizadas: " + Arrays.toString(organizadas));

		// f) Colores únicos en imagen
		int[] pixeles = { 0xFFFFFF, 0x000000, 0xFF0000, 0xFFFFFF, 0x00FF00 };
		Imagen img = new Imagen(2, 3, pixeles);
		int[] unicos = Metodos.coloresUnicos(img);
		System.out.println("f) Colores únicos: " + Arrays.toString(unicos));
	}
}
