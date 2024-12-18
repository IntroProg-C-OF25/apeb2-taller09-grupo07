
/**
 * Con el objetivo practicar el uso del ciclo repetitivo for, se propone que
 * dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite
 * es 4: Figura 1:
 *
 **
 ***
 ****
 * Figura 2:
 *
 *
 ***
 *****
 *******
 * Figura 3:
 *
 *
 ***
 *****
 *******
 *****
 ***
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim;
        System.out.print("Ingrese el limite: ");
        lim = tcl.nextInt();
        System.out.println("Figura 1: ");
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Figura 2: ");
        for (int i = 0; i <= lim; i++) {
            for (int j = 1; j <= lim - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Figura 3: ");
        for (int i = 0; i <= lim; i++) {
            for (int j = 1; j <= lim - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = lim - 1; i > 0; i--) {
            for (int j = 1; j <= lim - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
 * run:
 * Ingrese la cantidad de marcas a ingresar: 4
 * Ingrese la marca del vehiculo: kia
 * Ingrese la marca del vehiculo: suzuki
 * Ingrese la marca del vehiculo: audi
 * La marca no se contabiliza porque comienza con A, C o T
 * Ingrese la marca del vehiculo: bmw
 * Ingrese la marca del vehiculo: toyota
 * La marca no se contabiliza porque comienza con A, C o T
 * Ingrese la marca del vehiculo: hyundai
 * Las marcas validas ingresadas son: 
 * kia
 * suzuki
 * bmw
 * hyundai
 * BUILD SUCCESSFUL (total time: 13 seconds)
*/