package org.example.Algoritmos;

public class binarySearch {
    public static void buscaBinaria(int[] array, int item) {
        int valorBaixo = 0;
        int valorAlto = array.length - 1;

        while (valorBaixo <= valorAlto) {
            int valorMeio = (valorBaixo + valorAlto) / 2;
            int palpite = array[valorMeio];
            if (palpite == item) {
                System.out.println("Valor encontrado!! " + array[valorMeio]);
            }
            if (palpite > item) {
                valorAlto = valorMeio - 1;
            } else {
                valorBaixo = valorMeio + 1;
            }
        }
    }
}
