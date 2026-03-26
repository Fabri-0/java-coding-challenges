package list;

import java.util.List;

public class MinMaxList<T extends Comparable<T>> {

     public T minimo(List<T> lista) {
          T min = lista.getFirst();
          for (int i = 1; i < lista.size(); i++) {
               if (lista.get(i).compareTo(min) < 0) {
                    min = lista.get(i);
               }
          }
          return min;
     }

     public T maximo(List<T> lista) {
          T max = lista.getFirst();
          for (int i = 0; i < lista.size(); i++) {
               if (lista.get(i).compareTo(max) > 0) {
                    max = lista.get(i);
               }
          }
          return max;
     }
}
