public class Matricula {

    // Atributos
    private Aluno aluno;
    private Plano plano;
    private String status;

    // Construtor
    public Matricula(Aluno aluno, Plano plano) {
        this.aluno = aluno;
        this.plano = plano;
        this.status = "Ativa";
    }

    // Getters
    public Aluno getAluno() {
        return aluno;
    }

    public Plano getPlano() {
        return plano;
    }

    public String getStatus() {
        return status;
    }

    // Cancelar matrícula
    public void cancelar() {
        status = "Inativa";
    }

    // Ativar matrícula
    public void ativar() {
        status = "Ativa";
    }

    // Exibir matrícula
    public void mostrarMatricula() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Plano: " + plano.getNome());
        System.out.println("Status: " + status);
    }
}