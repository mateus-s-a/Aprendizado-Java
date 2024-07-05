// (Aula09) --- Entendendo Métodos em Java
/*
 * Modificador de Acesso:
 * ---> 'public': Acesso público, tem acesso ao método fora da classe
 * ---> 'private': Acesso privado, tem acesso ao método apenas na classe
 * ---> 'protected': Acesso protegido, tem acesso ao método na classe e nas classes que herdam da classe
 * ---> 'default: Acesso padrão, tem acesso ao método na classe
 * 
 * Retorno:
 * ---> 'void': Não retorna nada
 * 
 * Nome:
 * ---> 'main': Nome do método
 * 
 * Parâmetro:
 * ---> 'String[] args': Parâmetro do método
 * 
 */
package aula09;

public class aula09 {
    public static void main(String[] args) {
        msgCurso("Java", 3);
        msgCurso("Python", 2);
        msgCurso("C++", 4);

        System.out.println(soma(4, 9));
        System.out.println(somatorio(1, 2, 3, 4, 5));
        System.out.println(somatorio(1.1, 2.2, 3.3, 4.4, 5.5));
    }

    public static void msgCurso(String curso, int loop) {
        for(int i = 0; i<loop; i++) {
            System.out.println("Curso de " + curso);
        }
    }

    public static int soma(int n1, int n2) {
        int resposta = n1 + n2;
        return resposta;
    }

    // public static int somatorio(int[] numeros) // Outra forma de receber um número indefinido de parâmetros
    public static int somatorio(int... numeros) { // Recebe um número indefinido de parâmetros
        int total = 0;
        for(int n: numeros) {
            total += n;
        }
        return total;
    }

    public static double somatorio(double... numeros) {
        double total = 0.0;
        for(double n: numeros) {
            total += n;
        }
        return total;
    }
}