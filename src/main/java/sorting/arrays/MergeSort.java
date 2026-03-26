package sorting.arrays;

import interfaces.ArraySort;

public class MergeSort <T extends Comparable<T>> implements ArraySort<T> {

        @Override
        public void sort(T[] elements) {
                T[] arreglo = (T[]) new Comparable[elements.length]; //nuevo arreglo con el mismo tamaño
                sort(elements, arreglo, 0, elements.length - 1);
        }

        public void sort(T[] elementos, T[] arreglo, int baja, int alta) {
                if (baja >= alta)
                        return;
                int mitad = baja + (alta - baja) / 2;
                sort(elementos, arreglo, baja, mitad);
                sort(elementos, arreglo, mitad + 1, alta);
                merge(elementos, arreglo, baja, mitad, alta);
        }

        private void merge(T[] a, T[] b, int baja, int mitad, int alta) {
                int i = baja;
                int j = mitad + 1;
                for (int k = baja; k <= alta; k++) {
                        if (i <= mitad && j <= alta) {
                                if (a[i].compareTo(a[j]) >= 0) {
                                        b[k] = a[j++];
                                } else {
                                        b[k] = a[i++];
                                }
                        } else if (i <= mitad) { // i aún tiene cartas, copialas
                                b[k] = a[i++];
                        } else {                 // i ya no tiene, copia j, copialos
                                b[k] = a[j++];
                        }
                }
                for (int n = baja; n <= alta; n++) {
                        a[n] = b[n];
                }
        }
}
