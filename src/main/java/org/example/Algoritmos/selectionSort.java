package org.example.Algoritmos;

import org.example.utils.buscaMenor;

import java.util.Arrays;

// A MELHOR IMPLEMENTACAO E SEM CRIAR UM ARRAY NOVO EM JAVA (PESQUISAR SOBRE)
public class selectionSort {
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int indice_do_menor = buscaMenor.buscaMenor(array, i);
            int temp = array[i];
            array[i] = array[indice_do_menor];
            array[indice_do_menor] = temp;
        }
        System.out.println("Array ordenado: \n" + Arrays.toString(array));
    }
}
