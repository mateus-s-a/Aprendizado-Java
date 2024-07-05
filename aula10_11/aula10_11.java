/* (Aula 10, 11) --- Aprendendo sobre classes em Java  */
package aula10_11;

public class aula10_11 {
    public static void main(String[] args) {
        int num = 0;
        Jogador10_11 j1 = new Jogador10_11(num++); // 'new' faz a instanciação de um objeto, ele que aloca a memória dinâmica para o objeto
        Jogador10_11 j2 = new Jogador10_11(num++); // 'num++' tem a função de incrementar o valor de 'num' após a criação do objeto, pós-incremento
        Jogador10_11 j3 = new Jogador10_11(++num); // '++num' tem a função de incrementar o valor de 'num' antes da criação do objeto, pré-incremento
    }
}