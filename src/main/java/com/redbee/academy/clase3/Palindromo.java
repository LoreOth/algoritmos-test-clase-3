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
        Integer tamaño = palabra.length();
        Integer i = 1;
        boolean ok = false;
        while ((i <= tamaño / 2) && (!ok)) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i)) {
                ok = true;
            }
        }

        return ok;
    }
}
