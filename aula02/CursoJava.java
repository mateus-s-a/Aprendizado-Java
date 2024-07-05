// (Aula 02) --- Comandos de impressão e primeiras prática com variáveis
package aula02;

public class CursoJava {
    public static void main(String[] args) {
        System.out.print("print: não pula linha.\n"); // \n é para pular uma linha
        System.out.println("println: pula linha."); // println é para pular linha
        System.out.printf("printf: não pula linha.%n"); // printf é para formatar a saída

        System.out.printf("printf: %d.%n", 10); // format: %d é para formatar a saída como um número; args: 10
        System.out.printf("Curso de Java %s.%n", "completo"); // format: %s é para formatar a saída como uma string; args: "completo"
        System.out.printf("Estou estudando %s em menos de %d semana.%n", "Java", 1); // format: %s é para formatar a saída como uma string; args: "Java", 10

        /* VARIVEIS */
        int num = 20; // 'int' é para declarar uma variável inteira
        String nome = "Matthew"; // 'String' é para declarar uma variável de texto
        System.out.println("Variável num: " + num);
        System.out.println("Variável nome: " + nome);
        System.out.println("Meu nome é " + nome + " e possuo " + num + " anos.");

        int num2 = num + 10;
        System.out.println("Variável num2: " + num2);
    }
}