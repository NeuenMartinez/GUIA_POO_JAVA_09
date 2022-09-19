package Servicios09;

import Entidades09.Matematica;
import static java.lang.Math.round;

/**
 *
 * @author NeuenMartinez
 */
public class MatematicaService {

    public static void devolverMayor(Matematica m1) {
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("El Primer numero es mayor que el segundo");
        } else if (m1.getNum1() < m1.getNum2()) {
            System.out.println("El segundo numero es mayor que el primero");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    public static void calcularPotencia(Matematica m1) {
        System.out.println("La potencia del numero mayor elevado al menor es: " + Math.pow(round(Math.max(m1.getNum1(), m1.getNum2())), round(Math.min(m1.getNum1(), m1.getNum2()))));

    }

    public static void calculaRaiz(Matematica m1) {
        System.out.println("La raiz cuadrada del numero menor es: " + Math.sqrt(round(Math.min(m1.getNum1(), m1.getNum2()))));
    }
}
