// (Aula 03) --- Comandos de decisão em Java (IF, IF...ELSE, SWITCH e ?(TERNÁRIO))
package aula03;

public class aula03 {
    public static void main(String[] args) {
        float nota = 6.5f, media = 6;
        int faltas = 10, max_faltas = 7;

        /* IF...ELSE */
        if(nota >= media && faltas <= max_faltas) {
            System.out.println("Aprovado.");
        } else if(nota >= media - 1) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        /* SWITCH */
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("Num = 1");
                break;
            case 2:
                System.out.println("Num = 2");
                break;
            default:
                System.out.println("Nenhum caso encontrado.");
                break;
        }

        /* ? (TERNÁRIO) */
        int num2 = 4;
        System.out.println(num2 == 2 ? "Num2 = 2" : "Num2 não é 2");
    }
}
