package com.mycompany.codigos;

import java.util.Scanner;

public class AdivinaNum {

    public static void main(String[] args) {

        int numeroEscondido = 2; // El número a adivinar
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Introduce un número para adivinar el número escondido: ");

        do {
            numeroIngresado = scanner.nextInt();

            if (numeroIngresado < numeroEscondido) {
                System.out.println("El número ingresado es menor que el número escondido. ¡Sigue intentando!");
            } else if (numeroIngresado > numeroEscondido) {
                System.out.println("El número ingresado es mayor que el número escondido. ¡Sigue intentando!");
            }

        } while (numeroIngresado != numeroEscondido);

        System.out.println("¡Felicidades! ¡Has encontrado el número escondido!");

    }

}
