package com.mycompany.codigos;

import java.util.Scanner;

/**
 *
 * @author nicole
 */
public class NumParImpar {
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        int n=0, i=0, r=0;
        int veces_cero=0;
        System.out.println(" ingresa un numero: ");
        n=tecla.nextInt();
        r=n%2;
        if(n==0){
            System.out.println("el numero es impar ");
        }else{
            System.out.println("el numero es par ");
        }
        for(i=1;i<=n;i++){
            r=n%i;
            if(r==0){
                veces_cero++;
            }
        }
        if(veces_cero==2){
            System.out.println("el numero es primo ");
        }else{
            System.out.println("el numero no es primo ");
        }
    }
}

    

