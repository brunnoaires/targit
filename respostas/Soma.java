package respostas;

public class Soma {

    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        System.out.println("Valores iniciais: K = " + K + ", soma = " + SOMA);

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println("Após incremento: K = " + K + ", soma = " + SOMA);
        }

        System.out.println("Valor final da soma: " + SOMA);
    }
}
// o valor da soma é 77
