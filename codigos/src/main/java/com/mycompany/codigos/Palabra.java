package com.mycompany.codigos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nicole
 */
public class Palabra {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        String frase;
        int n;
        int v;
        int x;
        System.out.println("Ingresa una frase");
        frase = bufEntrada.readLine();
        n = frase.length();
        x = 1;
        v = 0;
        while (x <= n) {
            switch (frase.substring(x - 1, x)) {
                case "a":
                case "A":
                    v = v + 1;
                    break;
                case "e":
                case "E":
                    v = v + 1;
                    break;
                case "i":
                case "I":
                    v = v + 1;
                    break;
                case "o":
                case "O":
                    v = v + 1;
                    break;
                case "u":
                case "U":
                    v = v + 1;
                    break;
                default:
                    c = c + 1;
            }
            x = x + 1;
        }
        System.out.println("La frase " + frase + " tiene " + v + " vocales");
        System.out.println("La frase " + frase + " tiene " + c + " consonantes");
    }

}
