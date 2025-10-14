import metodos.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

        Factorial factorial = new Factorial();

        @Test
        public void factorialI(){
                int resultado = factorial.factorialIterativo(3);
                assertEquals(6, resultado);
        }

        @Test
        public void factorialR (){
              int resultado = factorial.factorialRecursivo(5);
              assertEquals(120, resultado);
        }

        @Test
        public void factorialS(){
                int resultado = factorial.factorialStream(5);
                assertEquals(120, resultado);
        }


}
