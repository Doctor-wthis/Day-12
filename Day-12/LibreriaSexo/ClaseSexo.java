
package LibreriaSexo;
public class ClaseSexo {
	// Método Potencia para elevar un número entero positivo
	public int Potencia(int base, int exponente) {
		int pot=1;
		for (int i=1;i<=exponente;i++) {
			pot=pot*base;
		}
		return pot;
	}
	// Método Factorial para calcular el factorial de un número entero positivo
	public int Factorial(int x) {
		int fact=1;
		for (int i=1;i<=x;i++) {
			fact=fact*i;
		}
		return fact;
	}
}

