
import java.util.Scanner;

/**
 * Dados los siguientes arreglos double[] promedios = {10, 10, 9.1, 7, 6.1, 4,
 * 8}; String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa
 * Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
 *
 * @author Daniela Briceño
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};

        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < 7; i++) {
            if ((promedios[i] >= 0) && (promedios[i] <= 5.9)) {
                promediosCualitativos[i] = "Promedio Regular";
            } else if ((promedios[i] >= 6) && (promedios[i] <= 8.9)) {
                promediosCualitativos[i] = "Promedio Bueno";
            } else if ((promedios[i] >= 9) && (promedios[i] <= 10)) {
                promediosCualitativos[i] = "Promedio Sobresaliente";
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(estudiantes[i] + " con promedio: " + promedios[i] + " tiene " + promediosCualitativos[i]);
        }
    }
}
/*
 * run:
 * Kimberly Gonzalez con promedio: 10.0 tiene Promedio Sobresaliente
 * Mark Hogan con promedio: 10.0 tiene Promedio Sobresaliente
 * Teresa Martinez con promedio: 9.1 tiene Promedio Sobresaliente
 * Julia Johnson con promedio: 7.0 tiene Promedio Bueno
 * Mark Cook con promedio: 6.1 tiene Promedio Bueno
 * Jennifer Manning con promedio: 4.0 tiene Promedio Regular
 * Juan Vasquez con promedio: 8.0 tiene Promedio Bueno
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
