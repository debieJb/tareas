
package com.mycompany.codigos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nicole
 */
public class Operaciones {
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double div;
		double multi;
		double n;
		int opc;
		double res;
		double sum;
		double x;
		System.out.println("Por favor elija una opcion");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Division");
		System.out.println("5: Salir");
		opc = Integer.parseInt(bufEntrada.readLine());
		switch (opc) {
		case 1:
			System.out.println("Ingrese un numero");
			n = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingrese otro numero");
			x = Double.parseDouble(bufEntrada.readLine());
			sum = n+x;
			System.out.println("La suma de los numeros es de "+sum);
			break;
		case 2:
			System.out.println("Ingrese un numero");
			n = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingrese otro numero");
			x = Double.parseDouble(bufEntrada.readLine());
			res = n-x;
			System.out.println("La resta de los numeros es de "+res);
			break;
		case 3:
			System.out.println("Ingrese un numero");
			n = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingrese otro numero");
			x = Double.parseDouble(bufEntrada.readLine());
			multi = n*x;
			System.out.println("La multiplicacion de los numeros es de "+multi);
			break;
		case 4:
			System.out.println("Ingrese un numero");
			n = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingrese otro numero");
			x = Double.parseDouble(bufEntrada.readLine());
			div = n/x;
			System.out.println("La division de los numeros es de "+div);
			break;
		case 5:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("Opcion invalida");
		}
	}

    
}
