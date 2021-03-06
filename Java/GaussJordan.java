import java.util.Scanner;

public class GaussJordan {

  /*static double matriz[][] = {
    {2,  3,  1,  1},
    {3, -2,  -4, -3},
    {5, -1, -1,  4}
  };*/

  static double matriz[][] = {
    {2, -1, 3, 5},
    {2, 2, 3, 7},
    {-2, 3, 0, -3}
  };

  static Scanner columnas = new Scanner(System.in);
  static double columna;

  public static void imprimirMatriz() {
    System.out.println();

    for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 4; y++) {
        System.out.print(String.format("%.2f", matriz[x - 1][y - 1]) + "  ");
      }
      System.out.println();
    }

    System.out.println();
  }

  public static void hacerCeros(int fila, int columna, int filaAux) {
    double c = matriz[fila][columna];

    if (c < 0) {
      c = Math.abs(c);
    }

    if (matriz[fila][columna] < 0) {
      for (int i = 0; i <= 3; i++) {
        matriz[fila][i] = (c * matriz[filaAux][i]) + matriz[fila][i];
      }
    } else {
      for (int i = 0; i <= 3; i++) {
        matriz[fila][i] = ((-c) * matriz[filaAux][i]) + matriz[fila][i];
      }
    }
}

  public static void obtenerUnos(int fila, int columna) {
    double inverso;

      inverso = 1 / matriz[fila][columna];

    for (int i = 0; i <= 3; i++) {
        matriz[fila][i] = inverso * matriz[fila][i];
    }

  }

  public static void resolverMatriz()  {
    obtenerUnos(0, 0);
    hacerCeros(1, 0, 0);
    hacerCeros(2, 0, 0);
    obtenerUnos(1, 1);
    hacerCeros(2, 1, 1);

    obtenerUnos(1, 1);
    obtenerUnos(2, 2);

    hacerCeros(1, 2, 2);
    hacerCeros(0, 2, 2);
    hacerCeros(0, 1, 1);

    imprimirMatriz();
  }

  public static void main(String args[]) {
    System.out.println("\n= = = = = = = = = = = = = = =");
    System.out.println("Calcular matríz Gauss-Jordan");
    System.out.println("= = = = = = = = = = = = = = =\n");

    /*System.out.println("Proporcione los coeficientes (3 x 3)\n");

    for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 3; y++) {
        System.out.print("F" + x + ", C" + y + ": ");
        columna = columnas.nextDouble();
        matriz[x-1][y-1] = columna;
      }
    }

    System.out.print("\nR1: ");
    columna = columnas.nextDouble();
    matriz[0][3] = columna;

    System.out.print("R2: ");
    columna = columnas.nextDouble();
    matriz[1][3] = columna;

    System.out.print("R3: ");
    columna = columnas.nextDouble();
    matriz[2][3] = columna;*/

    for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 4; y++) {
        System.out.print(matriz[x-1][y-1] + "  ");
      }
      System.out.println();
    }

    resolverMatriz();
  }
}
