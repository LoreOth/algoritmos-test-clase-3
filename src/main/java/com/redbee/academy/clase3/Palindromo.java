package com.redbee.academy.clase3;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     * <p>
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        String cadenaModificada = palabra.replaceAll("\\s+","");
        Integer tamaño = cadenaModificada .length();
        Integer i = 0;
        boolean ok = true;
        while ((i <= tamaño / 2) && (ok)) {
            if (cadenaModificada.toLowerCase().charAt(i) != cadenaModificada.toLowerCase().charAt(cadenaModificada .length() - (i+1))) {
                ok = false;
            }
            i++;
        }
        return ok;
    }
}
