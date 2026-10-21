public class Plano {

    // Atributos
    private String nome;
    private double valor;
    private int duracao;
    private boolean ativo;

    // Construtor
    public Plano(String nome, double valor, int duracao) {
        this.nome = nome;
        this.valor = valor;
        this.duracao = duracao;
        this.ativo = true;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean getAtivo() {
        return ativo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Exibir informações do plano
    public void mostrarPlano() {

        String status = ativo ? "Ativo" : "Inativo";

        System.out.println("Plano: " + nome);
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Duração: " + duracao + " meses");
        System.out.println("Status: " + status);
    }

    // Ativar plano
    public void ativar() {
        ativo = true;
        System.out.println("O plano " + nome + " foi ativado.");
    }

    // Desativar plano
    public void desativar() {
        ativo = false;
        System.out.println("O plano " + nome + " foi desativado.");
    }
}