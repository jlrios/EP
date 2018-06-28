import java.util.*;
import java.math.*;

/**
 * Calcular factorial.
 */
public class Factorial {

  public static void main(String args[]) {
    System.out.println("Calcular factorial");

    // Captura del número del que hay que obtener el factorial.
    Scanner numeroFactorial = new Scanner(System.in);

    int numero = numeroFactorial.nextInt();
    int factorial = numero;

    for (int i = numero; i > 1; i-- ) {
      factorial = factorial * (i - 1);
    }

    System.out.println("El factorial de " + numero + " es: " + factorial);
  }
}
