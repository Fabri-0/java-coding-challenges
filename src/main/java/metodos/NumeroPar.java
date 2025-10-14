package metodos;

public class NumeroPar {

        public String numeroPar(int numero){
                return (numero & 1) == 1 ? "IMPAR" : "PAR";
        }
}
