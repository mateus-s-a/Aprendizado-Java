package aula12;

public class Jogador12 {

    private final int maxVidas = 7;
    private int num = 0;
    private int vidas = 0;

    public Jogador12(int p_num) {
        this.num = p_num;
        this.vidas = 1;
        System.out.printf("Jogador nmero %d criado%n", p_num);
    }

    public int getVidas() {
        return this.vidas;
    }
    public void addVidas(int p_qtd) {
        if(this.vidas + p_qtd <= this.maxVidas) this.vidas += p_qtd;
        else this.vidas = this.maxVidas;
    }
}
