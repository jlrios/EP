import java.util.Scanner;

public class SerieFibonacci {

  public static void calcularSerieFibonacci(int _numeroSerie) {
    int nf = 1;

    for (int f = 1; f <= _numeroSerie; f++) {
      System.out.println(nf);
    }
  }

  public static void main(String args[]) {
    System.out.println("\nSerie de Fibonacci\n");
    System.out.print("Introduzca un entero máximo para la serie: ");

    Scanner numero = new Scanner(System.in);
    int numeroSerie = numero.nextInt();

    System.out.println(calcularSerieFibonacci(numeroSerie));

  }
}
