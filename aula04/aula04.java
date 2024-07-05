// (Aula 04) --- Obtendo dados do teclado com um objeto da classe Scanner.
// 'Scanner' é uma classe do pacote 'java.util' que permite a leitura de dados do teclado.
package aula04;
import java.util.Scanner; // Importa a classe 'Scanner' do pacote 'java.util'.

public class aula04 {
    public static void main(String[] args) {
        /* com STRINGS */
        Scanner leitor = new Scanner(System.in); // Cria um objeto da classe 'Scanner' do tipo string e armazena na variável 'leitor'.
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine(); // Lê a entrada do usuário e armazena na variável 'nome'.
        System.out.println("Seu nome é: " + nome);
        
        /* com NÚMEROS */
        Scanner leitor2 = new Scanner(System.in); // Cria um objeto da classe 'Scanner' do tipo inteiro e armazena na variável 'leitor2'.
        System.out.println("Digite sua idade: ");
        int idade = leitor2.nextInt(); // Lê a entrada do usuário e armazena na variável 'idade'.
        System.out.println("Sua idade é: " + idade);

        /* com STRINGS e NÚMEROS */
        Scanner leitor3 = new Scanner(System.in); // Cria um objeto da classe 'Scanner' do tipo string e armazena na variável 'leitor3'.
        System.out.println("Digite seu nome: ");
        String nome2 = leitor3.nextLine(); // Lê a entrada do usuário e armazena na variável 'nome2'.
        System.out.println("Digite sua idade: ");
        int idade2 = leitor3.nextInt(); // Lê a entrada do usuário e armazena na variável 'idade2'.
        System.out.printf("Seu nome é %s e sua idade é %d.%n", nome2, idade2);

        /* com STRINGS e NÚMEROS, utilizando IF...ELSE */
        Scanner leitor4 = new Scanner(System.in);
        System.out.println("Digite a nota do aluno (entre 0 e 100): ");
        int nota = leitor4.nextInt();
        if (nota >= 60) System.out.println("Aprovado!");
        else System.out.println("Reprovado!");

        leitor.close(); // Fecha o objeto Scanner para evitar erros.
        leitor2.close();
        leitor3.close();
        leitor4.close();
    }
}
