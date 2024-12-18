
/**
 *Modifique el ciclo repetitivo para que salga del mismo,
 * cuando el usuario ingrese por teclado una letra que coincida con la primera letra de los "nombres"
 * contenidos en el arreglo estudiantes . Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes 
 * , y no quemar de forma constante dichos iniciales, imagine que los estudiantes podrían contener millones de nombres,
 * por lo que fijar iniciales, es ineficiente.
 * @author Ricardo Rosales 
 */
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            switch (inicial){
                case "k": 
                    System.out.println(estudiantes[0]);
                    bandera = false;
                    break;
                case "h":
                    System.out.println(estudiantes[1]);
                    bandera = false;
                    break;
                case "t":
                    System.out.println(estudiantes[2]);
                    bandera = false;
                    break;
                case "l":
                    System.out.println(estudiantes[3]);
                    bandera = false;
                    break;
                case "m":
                    System.out.println(estudiantes[4]);
                    bandera = false;
                    break;
                case "j":
                    System.out.println(estudiantes[5]);
                    bandera = false;
                    break;
                case "a":
                    System.out.println(estudiantes[6]);
                    bandera = false;
                    break;
                default:
                    System.out.println("No existe ninguna inicial con ese nombre guardado");
                
            }
                    
        }

    }
}
/*run:
Ingrese una letra
a
Alcides
*/