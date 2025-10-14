package metodos;

import interfaces.InPlaceSort;

public class MergeSort <T extends Comparable<T>> implements InPlaceSort<T> {

        @Override
        public void sort(T[] elementos) {
                T [] arreglo = (T []) new Comparable [elementos.length];
                sort(elementos, arreglo, 0, elementos.length -1);
        }

        // Revisamos ambos lados y luego lo fusionamos
        private void sort(T[] elementos, T[] arreglo, int baja, int alta){
                if(baja >= alta)
                        return;
                int mitad = baja + (alta - baja)/2;
                sort(elementos, arreglo, baja, mitad);
                sort(elementos, arreglo, mitad + 1, alta);
                merge(elementos, arreglo, baja, alta, mitad);
        }

        private void merge(T[] a, T[] b, int baja, int alta, int mitad){
                int i = baja;
                int j = mitad + 1;
                for(int k = baja; k <= alta; k++){
                        if(i <= mitad && j <= alta){
                                if(a[i].compareTo(a[j]) >=0){
                                        b[k] = a[j++];
                                } else {
                                        b[k] = a[i++];
                                }
                        }else if(j > alta && i <= mitad){
                                b[k] = a[i++];
                        } else if (i > mitad && j <= alta) {
                                b[k] = a[j++];
                        }

                }
                for (int n = baja; n <= alta; n++){
                        a[n] = b[n];
                }
        }
}
