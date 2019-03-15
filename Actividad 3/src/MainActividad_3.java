import java.util.Scanner;

/**
 * El programa 'MainActividad_3' nos ofrece una aplicación para poder realizar la búsqueda de un 
 * número en un array predefinido mediante la utilización de una función de búsqueda lineal.
 * 
 * @author  Daniel Villarreal Peña
 * @since  15-03-2019
 * @version  1.0
 *
 */

public class MainActividad_3 {

	public static void main(String[] args) {
		
	//DATOS E IMPORTS
		
		Scanner sc = new Scanner (System.in);
		int array [] = {5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 16};
		int num;
		
	//INSTRUCCIONES
		
		
		System.out.print("Introduzca el número que desea buscar en el array: ");
		num = sc.nextInt();  //Se recoge el dato introducido por el usuario.
		
		//Si la función devuelve true nos mostrará el primer mensaje, en caso contrario nos mostrará el segundo.
		if (buscarLineal (num, array)) {
			System.out.println("\nEl número introducido está en el array.");
		}
		else {
			System.out.println("\nEl número introducido NO está en el array.");
		}
		
		array = incrementarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array [i]); 
		}
		
		sc.close();
	}

	//Función para realizar una búsqueda lineal
	/**
	 * Función encargada de realizar una búsqueda lineal sobre el parámetro 'array' que le pasamos de 
	 * un número que le pasamos en el parámetro 'valor'. Si se encuentra el número la función nos 
	 * devuelve (return) la variable 'encontrado' a true y en caso contrario la devuelve a false.
	 * 
	 * @param valor
	 * @param array
	 * @return encontrado
	 */
	private static boolean buscarLineal (int valor, int array []) {
		boolean encontrado = false;
		for (int i = 0; i < array.length && !encontrado; i++) {
			if (array [i] == valor) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	//Función encargada de sumar 1 a todos los valores del array
	/**
	 * Función encargada de incrementar en 1 todos los valores del array.
	 * @param array
	 * @return array
	 */
	private static int [] incrementarArray (int array []) {
		for (int i = 0; i < array.length; i++) {
			array [i] = array [i] + 1; 
		}
		return array; 
	}
	
}
