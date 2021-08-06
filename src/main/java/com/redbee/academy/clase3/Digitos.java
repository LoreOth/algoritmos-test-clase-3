package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        if (numero == 0) {
            return 1;
        } else {
            Integer total = 0;
            while (numero != 0) {
                total++;
                numero = numero / 10;
            }
            return total;
        }
    }
}
