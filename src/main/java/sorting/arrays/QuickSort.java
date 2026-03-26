package sorting.arrays;

public class QuickSort {

        public static void quickSort(int [] arreglo, int baja, int alta){
                if(baja < alta){
                        int pivote = particion(arreglo, baja, alta);
                        quickSort(arreglo, baja, pivote - 1); // ordenar la parte izquierda del pivote
                        quickSort(arreglo, pivote + 1, alta); // ordenar la parte derecha del pivote
                }
        }

        // Metodo que hace la partición usando el último elemento como pivote
        private static int particion(int [] arreglo, int baja, int alta){
                int pivote = arreglo[alta];
                int i = baja - 1; // índice del elemento más pequeño
                for(int j = baja; j < alta; j++){
                        if(arreglo[j] <= pivote){
                                i++;
                                //intercambio de arreglo[i] y arreglo[j]
                                int temp = arreglo[i];
                                arreglo[i] = arreglo[j];
                                arreglo[j] = temp;
                        }
                }
                //intercambio del pivote con el elemento siguiente
                int temp = arreglo[i + 1];
                arreglo[i + 1] = arreglo[alta];
                arreglo[alta] = temp;
                return i +1;

        }


}
