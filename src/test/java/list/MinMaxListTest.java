package list;

import java.util.ArrayList;
import java.util.List;

public class MinMaxListTest {
     static void main() {
          List<Integer> lista = new ArrayList<>(List.of(20, 45, 67, -2, -78));
          MinMaxList<Integer> operacion = new MinMaxList<>();

          int minimo = operacion.minimo(lista);
          int maximo = operacion.maximo(lista);
          System.out.println(minimo);
          System.out.println(maximo);
     }

}
