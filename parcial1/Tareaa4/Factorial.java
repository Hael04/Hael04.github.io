package parcial1.tarea4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
	{
		try (Scanner numero = new Scanner( System.in )) {
            double factorial;
            double n;

            System.out.print("Introduce un número: ");
            n=numero.nextInt();
            factorial=1;

            for (double i = n; i > 0; i-- ){
             factorial = factorial * i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }

	}
}