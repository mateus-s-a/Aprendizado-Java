/* (Aula 13) --- Métodos e atributos STATIC
 * Métodos e Atributos STATIC são métodos e atributos que pertencem a classe e não ao objeto.
 * Ou seja, não precisam de um objeto para serem chamados ou acessados.
 * Têm o mesmo endereço de memória.
 * Têm o mesmo valor, porém, o valor de um atributo não é alterado no outro.
 */
package aula13;

public class aula13 {
    public static void main(String[] args) {
        int num2 = 0;

        System.out.printf("Alerta: %s%n", Jogador13.alerta ? "Sim" : "Não"); // Acessando o atributo estático 'alerta' da classe 'Jogador13'

        Jogador13 j1 = new Jogador13(++num2);
        Jogador13 j2 = new Jogador13(++num2);
        Jogador13 j3 = new Jogador13(++num2);
        
        j1.setVidas(1);
        System.out.printf("Vidas do Jogador 1: %d%n", j1.getVidas());
        System.out.printf("Vidas do Jogador 2: %d%n", j2.getVidas());
        System.out.printf("Vidas do Jogador 3: %d%n", j3.getVidas());
        
        Jogador13.alerta = true;
        Jogador13.setPontos();
        Jogador13.setPontos();
        Jogador13.setPontos();
        
        j1.info();
        j2.info();
        j3.info();


    }
}
