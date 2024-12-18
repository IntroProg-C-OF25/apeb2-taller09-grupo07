
/**
 *El primer ciclo paralelo C, cuenta con 28 estudiantes,
 * de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitó
 * las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación más baja.
 *
 * @author Ricardo Rosales
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //ESTR. DATOS ESTATICAS UNIDIMENSIONALES
        //Sintaxis: TipoDato nombArregllo [] = new TipoDato[TamañoArreglo];
        //          "Declarando el arreglo"    "Iniciacilizando el arreglo"
        int lim = 24;
        double notas[] = new double[lim];
        double sumatoria = 0, promedio = 0;
        double mayor = 0, menor = 10;
        int a = 0, b = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            System.out.println("nota[" + i + "] = " + notas[i] + ",");
        }
        for (int i = 0; i < notas.length; i++) {
            sumatoria += notas[i];
        }
        promedio = sumatoria / notas.length;
        System.out.println("Sumatoria notas  = " + sumatoria);
        System.out.println("Promedio = " + promedio);
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 6.5) {
                System.out.println("Reprobado " + i);
            } else {
                System.out.println("Aprobado " + i);
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
                a = i;

            } else if (notas[i] < menor) {
                menor = notas[i];
                b = i;

            }
        }
        System.out.println("Estudiante con mayor nota es: " + a + " con una nota de " + notas[a]);
        System.out.println("Estudiante con menor nota es: " + b + " con una nota de " + notas[b]);
    }
}
/*run:
nota[0] = 3.471186448284044,
nota[1] = 1.1775631968873468,
nota[2] = 2.4346059546834486,
nota[3] = 2.3147048976721196,
nota[4] = 6.912600054687702,
nota[5] = 4.783733293082623,
nota[6] = 0.8981526332485912,
nota[7] = 3.112190126258423,
nota[8] = 5.7853314707477566,
nota[9] = 7.2625049846914465,
nota[10] = 8.714528212353214,
nota[11] = 1.5053633893473473,
nota[12] = 5.003670484200176,
nota[13] = 8.34717806045859,
nota[14] = 3.1958363290251137,
nota[15] = 6.103370684165106,
nota[16] = 4.63447105070132,
nota[17] = 8.475757788658125,
nota[18] = 7.409581963972139,
nota[19] = 3.7175245478760632,
nota[20] = 9.667852454545041,
nota[21] = 4.584732248201711,
nota[22] = 2.468869973167256,
nota[23] = 9.616906170575444,
Sumatoria notas  = 121.59821641749016
Promedio = 5.066592350728757
Reprobado 0
Reprobado 1
Reprobado 2
Reprobado 3
Aprobado 4
Reprobado 5
Reprobado 6
Reprobado 7
Reprobado 8
Aprobado 9
Aprobado 10
Reprobado 11
Reprobado 12
Aprobado 13
Reprobado 14
Reprobado 15
Reprobado 16
Aprobado 17
Aprobado 18
Reprobado 19
Aprobado 20
Reprobado 21
Reprobado 22
Aprobado 23
Estudiante con mayor nota es: 20 con una nota de 9.667852454545041
Estudiante con menor nota es: 6 con una nota de 0.8981526332485912
*/
