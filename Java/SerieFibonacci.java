import java.util.Scanner;

public class SerieFibonacci {

  public static void calcularSerieFibonacci() {
    Scanner numero = new Scanner(System.in);
    int limite = numero.nextInt();

    int n1 = 0;
    int n2 = 1;
    int aux;

    System.out.print(n1 + " ");
    System.out.print(n2 + " ");

    while(n2 + n1 <= li\mite) {
      aux = n1;
      n1 = n2;
      n2 = aux + n1;

      System.out.print(n2 + " ");
    }

    System.out.println();
  }

  public static void main(String args[]) {
    System.out.println("\nSerie de Fibonacci\n");
    System.out.print("Introduzca un entero máximo para la serie: ");

    calcularSerieFibonacci();
  }
}
