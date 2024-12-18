
import java.util.Scanner;

/**
 * Dado el arreglo; determinar cuantos elementos están arriba de la media
 * aritmética y cuantos están por debajo de la medía aritmética. int[] arreglo =
 * {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double prom = 0;
        int mas = 0, menos = 0;
        for (int i = 0; i < 13; i++) {
            prom = prom + arreglo[i];
        }
        prom = prom / 13;
        System.out.println("La media aritmetica es: " + prom);
        for (int i = 0; i < 13; i++) {
            if (arreglo[i] < prom) {
                menos++;
            } else {
                mas++;
            }
        }
        System.out.println(mas + " numeros estan por encima de la media aritmetica, y " + menos + " numeros estan por debajo");
    }
}
/*
 * run:
 * La media aritmetica es: 9.538461538461538
 * 8 numeros estan por encima de la media aritmetica, y 5 numeros estan por debajo
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
