package arrays;

import java.util.Scanner;

public class MatrizTest {

     static void main() {
          Scanner sc = new Scanner(System.in);
          Matriz<Integer> matr = new Matriz<>();
          MatrizTest mt = new MatrizTest();
          int fila, columna;

          System.out.println("Creación de una matriz");
          fila = mt.verificaNumeroEntero(sc, "Ingrese el número de filas: ");
          columna = mt.verificaNumeroEntero(sc, "Ingrese el número de columas: ");

          Integer[][] matriz = matr.crearMatriz(Integer.class, fila, columna);
          matr.llenarMatriz(matriz, (i, j) -> mt.verificaNumeroEntero(sc, "Ingrese valor para [" + i + "][" + j + "]: "));


     }

     private int verificaNumeroEntero(Scanner sc, String mensaje) {
          while (true) {
               System.out.print(mensaje);
               if (!sc.hasNextInt()) {
                    System.out.println("Debe ingresar un número válido...!!!");
                    sc.next();
               } else {
                    int valor = sc.nextInt();
                    if (valor <= 0) {
                         System.out.println("Ingrese un número mayor que 0");
                    } else {
                         return valor;
                    }
               }
          }
     }

}
