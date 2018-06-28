import java.util.*;
import java.math.*;

/**
 * Calcular factorial.
 */
public class FactorialRecursivo {

  public static int factorial(int _numero) {
    if (_numero == 0) {
      return 1;
    } else {
      return _numero * factorial(_numero - 1);
    }
  }

  public static void main(String args[]) {
    System.out.println("Calcular factorial");

    // Captura del número del que hay que obtener el factorial.
    Scanner numeroFactorial = new Scanner(System.in);

    int numero = numeroFactorial.nextInt();
    int factorial = numero;

    System.out.println("El factorial de " + numero + " es: " + factorial(numero));
  }
}
