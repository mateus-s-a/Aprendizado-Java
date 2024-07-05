/* (Aula 14) --- Herança em Java.
 * É quando uma classe herda atributos e métodos de outra classe.
 */
package aula14;

public class aula14 {
    public static void main(String[] args) {
        Carro14 carro1 = new Carro14("Fusca");
        CarroCombate14 carro2 = new CarroCombate14("Tanque", 100);

        carro1.setLigado(true);
        carro2.setLigado(true);
        carro2.atirar(10);
        carro2.setQtdArmamento(10);
        carro1.sofrerDano(50);

        carro1.info();
        carro2.info();

    }
}
