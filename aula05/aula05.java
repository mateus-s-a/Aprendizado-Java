// (Aula 05) --- Tipos de Loops em Java, For, While e Do...While
package aula05;

public class aula05 {
    public static void main(String[] args) {
        /* FOR */
        // o for é uma estrutura de repetição que permite executar um bloco de código, por um número fixo de vezes.
        int vetor[] = {12, 29, 34, 47, 55};
        for(int i = 0; i<5; i++) {
            System.out.printf("A posição %d é: %d\n", i+1, vetor[i]);
        }

        /* WHILE */
        // o while é uma estrutura de repetição que permite executar um bloco de código, enquanto uma condição for verdadeira.
        int i = 0, max = 5;
        while(i < max) {
            System.out.printf("O valor de i é: %d\n", i);
            i++;
        }

        /* DO...WHILE */
        // o do...while é uma estrutura de repetição que permite executar um bloco de código, enquanto uma condição for verdadeira.
        i = 0;
        do {
            System.out.printf("Código obrigatório pelo menos uma vez.\n");
            i++;
        } while(i > max); // o código do while é executado pelo menos uma vez, independentemente se a condição é verdadeira ou não.

        System.out.println("[Fim do programa.]");
    }
}
