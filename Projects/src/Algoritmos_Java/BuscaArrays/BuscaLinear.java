package Algoritmos_Java.BuscaArrays;

public class BuscaLinear {

    double[] arrayDouble = {1,2,3,4,5,6};

    public String buscaLinear(double elemento) {
        for (int i = 0; i < this.arrayDouble.length; i++) {
            if (this.arrayDouble[i] == elemento) {
                return "o valor buscado está no: " + i + "° índice do Array";
            }
        }
        return "Valor: " + elemento + "Não encontrado"; // Elemento não encontrado
    }

}



