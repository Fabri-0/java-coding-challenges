package testGeneral;

import metodos.MergeSort;

public class Test {

        static void main() {
                Integer[] datos = { 5, 2, 6, 3, 1, 4 };

                System.out.println("Antes de ordenar:");
                for (int num : datos) System.out.print(num + " ");
                System.out.println();

                MergeSort<Integer> mergeSort = new MergeSort<>();
                mergeSort.sort(datos);

                System.out.println("Después de ordenar:");
                for (int num : datos) System.out.print(num + " ");
                System.out.println();


        }

}
