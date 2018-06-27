import java.util.Scanner;

public class NumerosPrimos {

  public static boolean esPrimo(int _numero) {

    if(_numero < 2) return false;

    for (int i = 2; i < _numero ; i++) {
      if(_numero % i == 0){
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    System.out.println("\nEncontrar los números primos en un rango determinado de números.");
    System.out.print("Rango máximo: ");

    Scanner scanner = new Scanner(System.in);
    int numeroMaximo = scanner.nextInt();

    System.out.println("Se encontrarán los números primos en el rango de 1 a " + numeroMaximo + ".");

    Boolean primo;

    for (int n=1; n <= numeroMaximo; n++) {
      primo = esPrimo(n);

      if (primo) {
        System.out.println("Primo: " + n);
      }
    }

  }
}
