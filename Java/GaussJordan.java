import java.util.Scanner;

public class GaussJordan {

  static double matriz[][] = {
    {2,  3,  1,  1},
    {3, -2,  4, -3},
    {5, -1, -1,  4}
  };

  static Scanner columnas = new Scanner(System.in);
  static double columna;

  public static void imprimirMatriz() {
    System.out.println();

    for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 4; y++) {
        System.out.print(matriz[x-1][y-1] + "  ");
      }
      System.out.println();
    }
  }

  public static void hacerCeros(int f) {
    double c = matriz[f][0];

    if (matriz[f][0] < 0) {
      for (int i = 0; i <=3; i++) {
        matriz[0][i] = matriz[0][i] * matriz[f][0];
      }
    } else {
      for (int i = 0; i <=3; i++) {
        matriz[f][i] = (-c * matriz[0][i]) + matriz[f][i];
      }
    }

    //for (int i = 0; i <=3; i++) {
      //matriz[1][i] = matriz[0][i] + matriz[1][i];
    //}

    imprimirMatriz();
  }

  public static void obtenerUnos() {
    // Multiplicar x el inverso para obtener el primer 1 en la fila 1 columna 1.
    Double inverso = 1 / matriz[0][0];

    for (int i = 0; i <= 3; i++) {
        matriz[0][i] = inverso * matriz[0][i];
    }

  }

  public static void resolverMatriz()  {
    obtenerUnos();
    hacerCeros(1);
    hacerCeros(2);
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



    System.out.println();

    for (int x = 1; x <= 3; x++) {
      for (int y = 1; y <= 4; y++) {
        System.out.print(matriz[x-1][y-1] + "  ");
      }
      System.out.println();
    }

    resolverMatriz();
  }
}
