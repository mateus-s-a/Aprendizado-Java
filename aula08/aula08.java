// (Aula 08) --- Matrizes em Java
package aula08;
import java.util.Scanner;
import java.util.Random;

public class aula08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        final int i = 3;
        final int j = 3;
        int[][] matriz = new int[i][j];

        System.out.println("Digite 9 números: ");
        for(int index_I=0; index_I<i; index_I++) {
            for(int index_J=0; index_J<j; index_J++) {
                matriz[index_I][index_J] = leitor.nextInt();
            }
        }

        for(int index_I=0; index_I<i; index_I++) {
            for(int index_J=0; index_J<j; index_J++) {
                System.out.printf("%d ", matriz[index_I][index_J]);
            }
            System.out.println();
        }
        // OU
        for(int[] c: matriz) {
            for(int d: c) {
                System.out.printf("%d ", d);
            }
            System.out.println();
        }


        /* Criação e Impressão de uma matriz com números aleatórios */
        System.out.println("Matriz 2:");
        int[][] matriz2 = {
            {new Random().nextInt(9), new Random().nextInt(9), new Random().nextInt(9)},
            {new Random().nextInt(9), new Random().nextInt(9), new Random().nextInt(9)},
            {new Random().nextInt(9), new Random().nextInt(9), new Random().nextInt(9)}
        };

        for(int[] c: matriz2) {
            for(int d: c) {
                System.out.printf("%d ", d);
            }
            System.out.println();
        }

        leitor.close();
    }
}
