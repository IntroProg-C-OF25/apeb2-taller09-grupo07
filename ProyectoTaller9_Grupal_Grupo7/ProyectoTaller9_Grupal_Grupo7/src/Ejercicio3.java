
/**
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número
 * de elementos que el usuario lo disponga. Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 * Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim, i = 0;
        char inicial;
        String marca;
        System.out.print("Ingrese la cantidad de marcas a ingresar: ");
        lim = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[lim];
        while (i < lim) {

            System.out.print("Ingrese la marca del vehiculo: ");
            marca = tcl.next();

            inicial = marca.charAt(0);
            if (inicial == 'A' || inicial == 'a' || inicial == 'C' || inicial == 'c' || inicial == 'T' || inicial == 't') {
                System.out.println("La marca no se contabiliza porque comienza con A, C o T");
            } else {
                marcas[i] = marca;
                i++;
            }
        }
        System.out.println("Las marcas validas ingresadas son: ");
        for (int j = 0; j < i; j++) {
            System.out.println(marcas[j]);
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
