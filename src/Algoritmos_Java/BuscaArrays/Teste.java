package Algoritmos_Java.BuscaArrays;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BuscaLinear b1 = new BuscaLinear();

        System.out.println("Digite o valor buscado: ");
        String elementoBusca = entrada.next();
        double search = Double.parseDouble(elementoBusca);



        System.out.println(b1.buscaLinear(search));
    }
}
