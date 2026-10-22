public class Treino {

    private Aluno aluno;
    private String descricao;

    public Treino(Aluno aluno, String descricao) {
        this.aluno = aluno;
        this.descricao = descricao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getDescricao() {
        return descricao;
    }
}