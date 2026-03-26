package sorting.list;

import java.util.ArrayList;
import java.util.List;

public class MergeSortListTest {

     static void main() {

          List<Integer> num = new ArrayList<>(List.of(6,0,1,10,7,6,17));
          MergeSortList<Integer> merge = new MergeSortList<>();

          List<Integer> nuevo = merge.sort(num);
          nuevo.forEach(System.out::println);

     }
}
