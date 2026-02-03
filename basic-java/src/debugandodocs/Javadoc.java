package debugandodocs;

/**
 * Classe do meu programa
 *
 * @author Alex Junior
 * @version 1.0
 * @since 1.0
 */

@Deprecated(since = "v2.0", forRemoval = false)
public class Javadoc {

    /**
     *
     * Metodo main.
     * @param  args Parametros de linha de comando
     */
    public static void main(final String[] args) {
        m1(10);
    }

    /**
     * Este é um método
     * @param x O número.
     */
    public static void m1(int x){
    }

    /**
     * Este é outro método
     * @param n1 Número 1.
     * @param n2 Número 2.
     * @return Por enquanto, True
     */
    private static boolean m2(double n1, double n2){
        return true;
    }
}
