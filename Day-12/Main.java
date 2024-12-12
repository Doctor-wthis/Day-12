
import java.util.Scanner;
import LibreriaSexo.ClaseSexo;
public class Main {
	public static void main (String[] args) {
		// ***** Instanciación de objetos ***** //
		// potenciar para operaciones matemáticas de la clase sexo método Potencia
		ClaseSexo potenciar=new ClaseSexo();
		// factor para calcular el factorial de la clase sexo método Factorial
		ClaseSexo factor=new ClaseSexo();
		// scan para lectura de datos de la clase Scanner
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Programa para calcular Potencias y Factoriales");
		System.out.print("|1| Potencia ; |2| Factorial: ");
		int select=scan.nextInt();
		if (select==1) {
			// Validación de variables Lectura de datos
			int a;
			int b;
			int resultado;
			do {
			System.out.print("Introduzca la base: ");
			a=scan.nextInt();
			System.out.print("Introduzca el exponente: ");
			b=scan.nextInt();
			} while (a<0 && b<0);
		
			// Cálculo
			resultado=potenciar.Potencia(a,b);

			// Escritura de datos y Salida
			System.out.println(a+" elevado a "+b+" es: "+resultado);
		}
		if (select==2) {
			// Validación de variables Lectura de datos
			int x;
			int resultado;
			do {
				System.out.print("Introduzca un número: ");
				x=scan.nextInt();
				if (x<0) {
					System.out.println("No es posible calcular el factorial de un número negativo");
				}
			} while (x<0);
			
			// Cálculo
			resultado=factor.Factorial(x);

			// Escritura de datos y Salida
			System.out.println("El factorial de "+x+" es: "+resultado);
		}
		if (select>2) {
			System.out.println("No hay nada que hacer");
		}
		System.out.println("*** El Programa ha finalizado ***");
	}
}

