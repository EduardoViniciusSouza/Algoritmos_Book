package org.example;

import org.example.Algoritmos.buscaBinaria;
import org.example.Algoritmos.selectionSort;
import org.example.utils.buscaMenor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array_ordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int[] array_desordenado = {37, 81, 48, 64, 100, 28, 73, 50, 4, 60, 47, 34, 77, 42, 16, 85, 53, 92, 71, 10, 26, 11, 1, 44, 68, 24, 2, 15, 55, 98, 65, 6, 33, 59, 74, 9, 70, 36, 27, 97, 14, 39, 66, 63, 21, 82, 32, 40, 22, 95, 12, 41, 18, 61, 35, 30, 13, 31, 46, 90, 58, 86, 20, 56, 72, 17, 93, 45, 25, 80, 3, 75, 76, 19, 84, 89, 23, 88, 67, 52, 38, 96, 54, 5, 29, 87, 62, 99, 7, 49,
                83, 43, 8, 94, 78, 79, 91, 51, 57, 69};


        System.out.println("Escolha um valor inteiro (1, 2, ...) a baixo para executar um dos algoritmos: ");

        System.out.println(
                "1. Busca Binaria \n" +
                "2. Selection Sort \n" );
        int opcaoEscolhida = sc.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println(" ");
                System.out.println("Escolha o valor inteiro a ser advinhado (1 a 100)");
                int numero_advinhado = sc.nextInt();

                buscaBinaria.buscaBinaria(array_ordenado, numero_advinhado);
            break;
            case 2:
                System.out.println(" ");
                System.out.println("Abaixo o array desordenado: ");
                System.out.println(Arrays.toString(array_desordenado));
                System.out.println("***************************************************************************************");
                selectionSort.selectionSort(array_desordenado);
        }
    }
}
