package Practica2;

import java.lang.ClassNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class Metodos {

	// a) Método que recibe un entero y retorna la cantidad de dígitos pares
	public static int contarDigitosPares(int numero) {
		int contador = 0;
		numero = Math.abs(numero);
		while (numero > 0) {
			int digito = numero % 10;
			if (digito % 2 == 0)
				contador++;
			numero /= 10;
		}
		return contador;
	}

	// b) Método que verifica si una cadena es palíndromo
	public static boolean esPalindromo(String texto) {
		texto = texto.replaceAll("\\s+", "").toLowerCase();
		int i = 0, j = texto.length() - 1;
		while (i < j) {
			if (texto.charAt(i) != texto.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	// c) Método que verifica si un entero es capicúa
	public static boolean esCapicua(int numero) {
		String s = String.valueOf(Math.abs(numero));
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	// d) Método que cuenta las ocurrencias de un flotante en un arreglo
	public static int contarOcurrencias(float[] arreglo, float x) {
		int contador = 0;
		for (float num : arreglo) {
			if (num == x)
				contador++;
		}
		return contador;
	}

	// e) Método que organiza chaquiras de colores en parejas ordenadas
	public static int[] organizarChaquiras(int[] colores) {
		int[] conteo = new int[6]; // índices 1..5
		for (int c : colores)
			conteo[c]++;

		int[] resultado = new int[colores.length];
		int index = 0;
		for (int color = 1; color <= 5; color++) {
			while (conteo[color] >= 2) {
				resultado[index++] = color;
				resultado[index++] = color;
				conteo[color] -= 2;
			}
		}
		return resultado;
	}

	// f) Método que retorna los colores únicos en una imagen
	public static int[] coloresUnicos(Imagen img) {
		Set<Integer> conjunto = new HashSet<>();
		for (int pixel : img.getPixeles()) {
			conjunto.add(pixel);
		}
		return conjunto.stream().mapToInt(Integer::intValue).toArray();
	}
}
