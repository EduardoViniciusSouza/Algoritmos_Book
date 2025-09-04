package org.example.utils;
//Funcao que busca o menor valor de um array e o retorna
public class buscaMenor {
    public static int buscaMenor(int array[], int inicio) {
        int menor = array[inicio];
        int indice_do_menor = inicio;

        for (int i = inicio; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
                indice_do_menor = i;
            }
        }
        return indice_do_menor;
    }
}
