
/** Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 *
 * @author Ricardo Rosales
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int n = 7;
        int[] fibonacci = new int[n];
        int[] primo = new int[n];
        int contador = 1, numero = 3;

        System.out.println("Serie fibonnaci/Primos");

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        primo[0] = 2;
        while (contador < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primo[contador] = numero;
                contador++;
            }
            numero++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + "/" + primo[i]);

        }
    }

}
/* 
run:
Serie fibonnaci/Primos
1/2
1/3
2/5
3/7
5/11
8/13
13/17
*/
