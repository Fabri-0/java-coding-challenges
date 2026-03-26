package sorting.arrays;

import org.junit.Test;

import static sorting.arrays.QuickSort.quickSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

        @Test
        public void pruebaQuickSort() {
                int[] arr = {4, 21, 23, 54, 24, 75, 87, 24};
                quickSort(arr, 0, arr.length - 1);

                // El arreglo esperado
                int[] esperado = {4, 21, 23, 24, 24, 54, 75, 87};
                assertArrayEquals(esperado, arr);
        }
}
