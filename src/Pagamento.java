public class Pagamento {

    public void pagar(Aluno aluno, Plano plano) {

        System.out.println("\n=== PAGAMENTO ===");
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Plano: " + plano.getNome());
        System.out.println("Valor: R$ " + plano.getValor());
    }
}