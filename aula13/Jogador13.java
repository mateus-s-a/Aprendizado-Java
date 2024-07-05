package aula13;

public class Jogador13 {
    private final int maxVidas = 7;
    private int num = 0; // Atributo de instância que pertence ao objeto 'j1'
    private int vidas = 0; // Atributo de instância que pertence ao objeto 'j1'
    static boolean alerta = false; // Atributo estático que pertence a classe e não ao objeto 'j1'
    static int qtdJogadores = 0; // Atributo estático que pertence a classe e não ao objeto 'j1'
    static int pontosJogadores = 0;

    public Jogador13(int p_num) {
        this.num = p_num;
        this.vidas = 1;
        System.out.printf("Jogador número %d criado%n", p_num);
        qtdJogadores++;
    }

    public int getVidas() {
        return this.vidas;
    }
    public void setVidas(int p_qtd) {
        if(this.vidas + p_qtd <= this.maxVidas) this.vidas += p_qtd;
        else this.vidas = this.maxVidas;
    }

    static void setPontos() {
        pontosJogadores += 10;
    }

    public void info() {
        System.out.printf("%nJogador: %d%n", this.num);
        System.out.printf("Vidas: %d%n", this.vidas);
        System.out.printf("Alerta: %s%n", alerta ? "Sim" : "Não"); // como o atributo 'alerta' é um 'static', não precisa de um 'this' para ser acessado
        System.out.printf("Quantidade de Jogadores: %d%n", qtdJogadores); // como o atributo 'qtdJogadores' é um 'static', não precisa de um 'this' para ser acessado
        System.out.printf("Pontos: %d%n", pontosJogadores); // como o atributo 'pontosJogadores' é um 'static', não precisa de um 'this' para ser acessado
        System.out.println("----------------------------");
    }
}
