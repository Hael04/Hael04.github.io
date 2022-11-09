package parcial1.tarea4;

import java.util.Scanner;

public class Promedio {
    public static void main(String args[]){

        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Introduzca un numero: ");
            int n=sn.nextInt();
            int i = 1;
            double num = 0;

            for (i = 1; i <= n; i=i+1){
                System.out.println(i);
                num += i;
            }
            
            System.out.println("El promedio es: "+ num/n);
        }
    }
}