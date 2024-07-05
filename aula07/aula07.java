// (Aula 07) --- Métodos da classe Array em Java
package aula07;
import java.util.Scanner;
import java.util.Arrays;

public class aula07 {
    public static void main(String[] args) {
        /* Criação de variáveis para todo o código */
        Scanner leitor = new Scanner(System.in);
        final int tam = 5; // 'final': indica que a variável não pode ser alterada após ser inicializada. Como o 'const' em JavaScript.


        /* Utilizando o 'for' especial para Arrays/Vetores para percorrer o array */
        int[] vt = {19, 13, 9, 47, 0};

        for(int i=0; i<tam; i++) {
            System.out.println(vt[i]);
        }
        // OU
        for(int i: vt) {
            System.out.println(i);
        }


        /* Método para organizar os elementos de um array em ordem desejada */
        Arrays.sort(vt); // em ordem crescente
        for(int i: vt) {
            System.out.println(i);
        }


        /* Método para preencher um array com valores */
        int[] vt2 = new int[tam];
        Arrays.fill(vt2, 10); // preenche o array com o valor 10
        for(int i:vt2) {
            System.out.println(i);
        }


        /* Método para copiar um Array para o outro */
        System.arraycopy(vt, 0, vt2, 0, tam); // 'vt2' recebe os valores de 'vt'
        for(int i:vt2) {
            System.out.println(i);
        }


        /* Método para comparar dois Arrays */
        if(Arrays.equals(vt, vt2)) System.out.println("São iguais."); // retorna um valor booleano
        else System.out.println("Não são iguais.");


        /* Método para verificar se existe um determinado elemento de um Array */
        System.out.println("Digite um número para verificar se ele existe no vt: ");
        int res = leitor.nextInt();
        if(Arrays.binarySearch(vt, res) >= 0) System.out.println("Encontrado.");
        else System.out.println("Não encontrado.");


        leitor.close();
    }
}
