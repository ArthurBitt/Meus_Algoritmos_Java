package Algoritmos_Java.OrdenarInsercao;

import java.util.Arrays;

public class SortInsertion {
    /* O algoritmo começa no segundo elemento do array (índice 1). Este elemento é considerado a “chave”.
    Ele então compara a “chave” com cada elemento à sua esquerda.
    Se a “chave” for menor que o elemento à sua esquerda, o elemento à esquerda é movido uma posição para a direita.
    Este processo é repetido até que a “chave” seja maior que o elemento à sua esquerda ou até que chegue ao início do array.
    A “chave” é então inserida na posição correta.
    O algoritmo então passa para o próximo elemento do array e repete o processo até que o array esteja
    completamente ordenado*/


    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            System.out.println(Arrays.toString(arr));
            int chave = arr[i];// valor atual
            int j = i - 1;// valor a esquerda do valor atual
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j]; // valor a direita do valor atual
                j--;
                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = chave;
            System.out.println(Arrays.toString(arr));
        }
    }

}
