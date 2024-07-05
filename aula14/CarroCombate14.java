package aula14;

public class CarroCombate14 extends Carro14 { // Aqui está o conceito de herança, onde o CarroCombate14 herda as propriedades do Carro14
    private final int max_Armamento = 100;
    private final int min_Armamento = 0;
    private int qtd_Armamento;

    public CarroCombate14(String nome, int blindagem) {
        super(nome); // 'super' faz referência ao construtor da classe pai
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtd_Armamento = 100;
    }

    public void setQtdArmamento(int qtd_Vezes) {
        for(int i = 0; i < qtd_Vezes; i++) {
            this.qtd_Armamento -= 1;
        }
        System.out.println("Atirando...");
        if(this.qtd_Armamento > max_Armamento) this.qtd_Armamento = max_Armamento;
        if(this.qtd_Armamento < min_Armamento) this.qtd_Armamento = min_Armamento;
    }
    
    public int getQtdArmamento() {
        return this.qtd_Armamento;
    }
    
    public void atirar(int qtd_Vezes) {
        if(this.qtd_Armamento > 0) setQtdArmamento(qtd_Vezes);
        else System.out.println("Sem munição");
    }

    public void info() {
        super.info();
        System.out.printf("Qtd. Arm......: %d\n", this.qtd_Armamento);
        System.out.println("----------------------------------");
    }
}
