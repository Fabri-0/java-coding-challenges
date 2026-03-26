package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxArraysTest {

     static void main() {
          Scanner sc = new Scanner(System.in);

          int opcion;
          Integer [] arreglo = {23,65,23,7,9,-9};
          MinMaxArrays<Integer> operacion = new MinMaxArrays<>();

          System.out.println("Determina el MAX ó MIN de un valor");
          while (true) {
               System.out.println("1) Mínimo");
               System.out.println("2) Máximo");
               System.out.println("3) Salir...");
               System.out.print("Digite la operación a realizar: ");
               if (!sc.hasNextInt()) {
                    System.out.println("Debe ingresar un número entero...!!!");
                    sc.next();
                    continue; // ← regrese al inicio del while
               }
               opcion = sc.nextInt();

               switch (opcion) {
                    case 1:
                         System.out.println("El valor mínimo es: " + operacion.minimo(arreglo));
                         break;
                    case 2:
                         System.out.println("El valor máximo es: " + operacion.maximo(arreglo) );
                         break;
                    case 3:
                         System.out.println("Saliendo...");
                         sc.close();
                         return; // sale del metodo main() por completo

                    default:
                         System.out.println("Opcion inválida...!!!");
               }
          }
     }
}
