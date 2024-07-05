// (Aula 06) --- Array/Vetor em Java
package aula06;
import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {
        int[] vetor = new int[5]; // uma das formas de criar um array.
        System.out.printf("%d\n", vetor[0]); // por padrão, o Java inicializa os elementos de um array com o valor 0.
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;
        vetor[0] = n1;
        vetor[1] = n2;
        vetor[2] = n3;
        vetor[3] = n4;
        vetor[4] = n5;
        System.out.printf("Vetor1: %d\n", vetor[0]);
        System.out.printf("Vetor1: %d\n", vetor[1]);
        System.out.printf("Vetor1: %d\n", vetor[2]);
        System.out.printf("Vetor1: %d\n", vetor[3]);
        System.out.printf("Vetor1: %d\n", vetor[4]);

        System.out.println("-----------------");

        int[] vetor2 = {10, 20, 30, 40, 50}; // outra forma de criar um array.
        System.out.printf("Vetor2: %d\n", vetor2[0]);
        System.out.printf("Vetor2: %d\n", vetor2[1]);
        System.out.printf("Vetor2: %d\n", vetor2[2]);
        System.out.printf("Vetor2: %d\n", vetor2[3]);
        System.out.printf("Vetor2: %d\n", vetor2[4]);



        // utilizando um loop 'for' para percorrer os dois vetores separadamente.
        for(int i = 0; i<5; i++) {
            System.out.printf("Vetor 1, posição %d: %d\n", i+1, vetor[i]);
        }

        System.out.println("-----------------");

        for(int i = 0; i<5; i++) {
            System.out.printf("Vetor 2, posição %d: %d\n", i+1, vetor2[i]);
        }



        // prática com vetor e scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor3: ");
        int tamanho = leitor.nextInt();
        int[] vetor3 = new int[tamanho];
        for(int i = 0; i<tamanho; i++) {
            System.out.printf("Digite um valor para a %dº posição: ", i+1);
            vetor3[i] = leitor.nextInt();
        }
        for(int i = 0; i<tamanho; i++) {
            System.out.printf("Vetor 3, posição %d: %d\n", i+1, vetor3[i]);
        }



        // mais prática com prova
        char[] gabarito = {'B', 'D', 'C', 'E', 'A'};
        char[] respostas = new char[5];
        int nota = 0;

        for(int i=0; i<5; i++) {
            System.out.printf("%dº) Digite a letra correspondente a resposta:\n1) A\n2) B\n3) C\n4) D\n5) E\nResposta: ", i+1);
            respostas[i] = leitor.next().charAt(0); // 'charAt(0)' pega o primeiro caractere da string.
        }
        for(int i=0; i<5; i++) {
            if((respostas[i] == gabarito[i]) || (respostas[i] == gabarito[i] + 32) || (respostas[i] == gabarito[i] - 16)) nota++;
        }
        System.out.printf("Nota: %d\n", nota);



        leitor.close();
    }
}
