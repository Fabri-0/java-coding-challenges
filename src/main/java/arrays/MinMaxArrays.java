package arrays;

public class MinMaxArrays<T extends Comparable<T>> {

     public T minimo(T[] arreglo) {
          if (arreglo == null || arreglo.length == 0) {
               throw new IllegalArgumentException("El arreglo esta vacio");
          }
          T min = arreglo[0];
          for (int i = 1; i < arreglo.length; i++) {
               if (arreglo[i].compareTo(min) < 0) {
                    min = arreglo[i];
               }
          }
          return min;
     }

     public T maximo(T[] arreglo){
          if(arreglo == null || arreglo.length == 0){
               throw new IllegalArgumentException("El arreglo esta vacio");
          }
          T max = arreglo[0];
          for(int i = 1; i < arreglo.length; i++){
               if(arreglo[i].compareTo(max) > 0){
                    max = arreglo[i];
               }
          }
          return max;
     }

}
