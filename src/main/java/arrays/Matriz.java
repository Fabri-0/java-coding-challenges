package arrays;

import java.lang.reflect.Array;
import java.util.function.BiFunction;

public class Matriz<T> {

     @SuppressWarnings("unchecked")
     public T[][] crearMatriz(Class<T> clase, int fila, int columna) {
          T[][] matriz = (T[][]) Array.newInstance(clase, fila, columna); // ✅ Crea el tipo real
          return matriz;
     }


     // llenarMatriz
     public void llenarMatriz(T[][] matriz, BiFunction<Integer, Integer, T> valor) {
          for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = valor.apply(i, j);
               }
          }
     }
     // imprimirMatriz
     // buscarElemento
}
