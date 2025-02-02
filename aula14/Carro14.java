package aula14;

public class Carro14 {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro14(String nome) { // Método Construtor
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    /* GETS */
    public String getNome() {
        return this.nome;
    }
    public Boolean getLigado() {
        return this.ligado;
    }
    public Boolean getDestruido() {
        return this.destruido;
    }
    public int getBlindagem() {
        return this.blindagem;
    }
    public Boolean getArmamento() {
        return this.armamento;
    }
    
    /* SETS */
    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
    // public void setDestruido(Boolean destruido) {
    //     this.destruido = destruido;
    // }
    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }
    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public void sofrerDano(int dano) {
        this.blindagem -= dano;
        if(this.blindagem <= 0) {
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }

    public void info() {
        System.out.println("----------------------------------");
        System.out.printf("Nome..........: %s\n", this.nome);
        System.out.printf("Ligado........: %s\n", this.ligado ? "Sim" : "Não");
        System.out.printf("Destruído.....: %s\n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem.....: %d\n", this.blindagem);
        System.out.printf("Armamento.....: %s\n", this.armamento ? "Sim" : "Não");
        System.out.println("----------------------------------");
    }
}
