package com.redbee.academy.clase3;

public class CombinacionDados {

    /**
     * INCOMPLETO
     *
     * Cuando tiramos 2 dados y sumamos los valores es posible generar un resultado comprendido entre 2 al 12.
     * <p>
     * Generar un algoritmo que diga con cuantas combinaciones posibles se puede generar un valor dado.
     * <p>
     * Por ej:
     * Para sacar 4 hay 3 combinaciones posibles: 1+3, 2+2 y 3+1
     * Para sacar 3 hay 2 combinaciones posibles: 1+2 y 2+1
     * para sacar 6 hay  5  ( 1+5,2+4,3+3,4+2,5+1)
     * para sacar 5 hay  4  (1+4,2+3,3+2,4+1)
     * para sacar 1 hay 0
     * para sacar 2 hay 1
     * <p>
     * 3 dados
     * Hay una forma posible de que tres dados sumen 3
     * 3 vías para 4
     * 6 por 5
     * 10 por 6
     * 15 por 7
     * 21 por 8
     * 25 por 9
     * 27 por 10
     * 27 por 11
     * 25 por 12
     * 21 por 13
     * 15 por 14
     * 10 por 15
     * 6 por 16
     * 3 por 17
     * 1 por 18
     * <p>
     *
     */


    public static Integer resolverCombinacionesPosiblesCon2Dados(Integer valor) {
        return null;

    }

    /**
     * Lo mismo pero con 3 dados
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon3Dados(Integer valor) {

        return
    }


    public static Integer calculoFactorial(Integer valor) {
        Integer factorial = 1;
        while (valor != 0) {
            factorial = factorial * valor;
            valor--;
        }
        return factorial;
    }
}
