/* (Aula 12) --- Aprendendo sobre os métodos GET e SET
 * Métodos do tipo GET e SET são usados para obter e definir o valor de um atributo de uma classe, que por virtude, 
 * não podem ser acessados diretamente, pois são privados.
 */
package aula12;

public class aula12 {
    public static void main(String[] args) {
        int num = 0;
        Jogador12 j1 = new Jogador12(num++);
        Jogador12 j2 = new Jogador12(num++);
        Jogador12 j3 = new Jogador12(++num);

        j1.addVidas(100);
        System.out.printf("Vidas do Jogador 1: %d%n", j1.getVidas());
        System.out.printf("Vidas do Jogador 2: %d%n", j2.getVidas());
        System.out.printf("Vidas do Jogador 3: %d%n", j3.getVidas());
    }
}
