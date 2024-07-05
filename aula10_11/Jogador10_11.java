package aula10_11;

public class Jogador10_11 {

    /* Geralmente os atributos são criados com modificador de acesso 'private' */
    // public int num = 0; // Atributo de instância, 'num' só consegue ser acessado fora da classe 'Jogador' porque ele tem um modificador de acesso 'public'
    private int num = 0;
    private int vidas = 0;

    /* Método Construtor, por padrão, ele não retorna nada */
    public Jogador10_11(int param_num) {
        this.num = param_num; // 'this.num' = é o num da classe 'Jogador'; 'param_num' = é o parâmetro do método
        this.vidas = 3;
        System.out.printf("Jogador número %d criado%n", param_num);
    }
}
