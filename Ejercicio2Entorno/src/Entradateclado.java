

import java.util.InputMismatchException;
import java.util.Scanner;


public class Entradateclado {

	static Scanner teclado;
	static{
		teclado = new Scanner(System.in);
	}

	public String pedirCadena(String cad){
		String cadena;
		System.out.println(cad);
		cadena = teclado.nextLine();
		return cadena;
	}

	public static int pedirEntero(String cad){
		int num = 0;
		boolean esEntero = false;

		do{

			try {
				System.out.println(cad);
				num = teclado.nextInt();
				if (num >= 16) {
					esEntero = false;
				}else{
					System.out.println("Error numero no valido");
					esEntero = true;
				}
				
			} catch (InputMismatchException e) {
				System.err.println("ha introducido letras en vez de numeros");
				esEntero = true;
			}finally{
				teclado.nextLine();
			}
		}while(esEntero);

		return num;
	}

	public float pedirFloat(String cad){
		float num = 0;
		boolean esFloat = false;
		do{
			try {
				System.out.println(cad);
				num = teclado.nextFloat();
				if (num < 0) {
					System.out.println("Error numero no valido");
					esFloat = false;
				}else{
					esFloat = true;
				}
			} catch (InputMismatchException e) {
				System.err.println("ha introducido letras en vez de numeros");
				esFloat = false;
			}finally{
				teclado.nextLine();
			}
		}while(!esFloat);

		return num;
	}

	public double pedirDouble(String cad){
		double num = 0;
		boolean esNumero = false;
		do{
			try {
				System.out.println(cad);
				num = teclado.nextFloat();
				esNumero = true;
			} catch (InputMismatchException e) {
				System.err.println("ha introducido letras en vez de numeros");
				esNumero = false;
			}finally{
				teclado.nextLine();
			}
		}while(!esNumero);

		return num;
	}

	public char pedirChar(String cad){
		String cadena;
		char car = 0;
		boolean esCaracter = true;

		do{


			System.out.println(cad);
			cadena = teclado.nextLine();
			if (cadena.length() > 1 || cadena.length() == 0) {
				System.out.println("No ha insertado un caracter");
				esCaracter = false;
			}else{
				car = cadena.charAt(0);
				esCaracter = true;
			}
		}while(!esCaracter);



		return car;
	}

	public long pedirLong(String cad){
		long num = 0;
		boolean esNumero = false;
		do{
			try {
				System.out.println(cad);
				num = teclado.nextLong();
				esNumero = true;
			} catch (InputMismatchException e) {
				System.err.println("ha introducido letras en vez de numeros");
				esNumero = false;
			}finally{
				teclado.nextLine();
			}
		}while(!esNumero);

		return num;
	}
}
