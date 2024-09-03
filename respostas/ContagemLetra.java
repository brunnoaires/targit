package respostas;

import java.util.Scanner;

public class ContagemLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String entrada = scanner.nextLine();
        scanner.close();

        int contagem = contarLetra(entrada);

        if (contagem > 0) {
            System.out.println("a letra 'a' aparece " + contagem + " vez(es) na frase.");
        } else {
            System.out.println("a letra 'a' nao aparece na frase.");
        }
    }

    public static int contarLetra(String str) {
        int contagem = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }
        return contagem;
    }
}
