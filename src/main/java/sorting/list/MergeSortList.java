package sorting.list;

import interfaces.ListSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortList<T extends Comparable<T>> implements ListSort<T> {

     @Override
     public List<T> sort(List<T> elements) {
          if (elements.size() <= 1) {
               return elements;
          }
          int mitad = elements.size() / 2;
          List<T> izquierda = sort(new ArrayList<>(elements.subList(0, mitad)));
          List<T> derecha = sort(new ArrayList<>(elements.subList(mitad, elements.size())));

          return merge(izquierda, derecha);
     }

     private List<T> merge(List<T> izquierda, List<T> derecha) {
          List<T> resultado = new ArrayList<>();
          int i = 0;
          int j = 0;

          while (i < izquierda.size() && j < derecha.size()) {
               if (izquierda.get(i).compareTo(derecha.get(j)) >= 0) {
                    resultado.add(derecha.get(j++));
               } else {
                    resultado.add(izquierda.get(i++));
               }
          }
          while (i < izquierda.size()) {
               resultado.add(izquierda.get(i++));
          }
          while (j < derecha.size()) {
               resultado.add(derecha.get(j++));
          }
          return resultado;
     }
}