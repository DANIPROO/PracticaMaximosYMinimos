package clases;

/**
 * Esta clase proporciona metodos para encontrar el maximo de enteros positivos
 */
public class Maximos {

    /**
     * Devuelve el valor maximo de dos enteros positivos.
     *
     * @param a El primer entero
     * @param b El segundo entero
     * @return El maximo de los dos enteros
     * @throws IllegalArgumentException si alguno de los parametros es menor que 0
     */
    public static int MaximoDe2EnterosPositivos(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los parametros deben ser enteros positivos.");
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Devuelve el valor maximo de tres enteros positivos.
     *
     * @param a El primer entero
     * @param b El segundo entero
     * @param c El tercer entero
     * @return El maximo de los tres enteros
     * @throws IllegalArgumentException si alguno de los parametros es menor que 0
     */
    public static int MaximoDe3EnterosPositivos(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Los parametros deben ser enteros positivos.");
        }
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}