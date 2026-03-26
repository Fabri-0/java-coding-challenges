package recursion;

import java.util.stream.IntStream;

public class Factorial {

     public int factorialIterativo(int numero) {
          int factorial = 1;
          for (int i = 2; i <= numero; i++) {
               factorial *= i;
          }
          return factorial;
     }

     public int factorialRecursivo(int numero) {
          if (numero < 2)
               return 1;
          return numero * factorialRecursivo(numero - 1);
     }

     public int factorialStream(int numero) {
          return IntStream.rangeClosed(1, numero).reduce(1, (a, b) -> a * b);
     }
}

