import java.util.ArrayList;

public class Relatorios {

    // Listar todos os alunos
    public void listarAlunos(ArrayList<Aluno> alunos) {

        System.out.println("\n=== ALUNOS ===");

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {

            for (Aluno aluno : alunos) {
                aluno.mostrarDados();
                System.out.println("------------------------------");
            }
        }
    }

    // Listar todos os planos
    public void listarPlanos(ArrayList<Plano> planos) {

        System.out.println("\n=== PLANOS ===");

        if (planos.isEmpty()) {
            System.out.println("Nenhum plano cadastrado.");
        } else {

            for (Plano plano : planos) {
                plano.mostrarPlano();
                System.out.println("------------------------------");
            }
        }
    }

    // Listar todas as matrículas
    public void listarMatriculas(ArrayList<Matricula> matriculas) {

        System.out.println("\n=== MATRÍCULAS ===");

        if (matriculas.isEmpty()) {
            System.out.println("Nenhuma matrícula cadastrada.");
        } else {

            for (Matricula matricula : matriculas) {
                matricula.mostrarMatricula();
                System.out.println("------------------------------");
            }
        }
    }

    // Mostrar alunos por plano
    public void alunosPorPlano(ArrayList<Matricula> matriculas) {

        System.out.println("\n=== ALUNOS POR PLANO ===");

        if (matriculas.isEmpty()) {
            System.out.println("Nenhuma matrícula cadastrada.");
            return;
        }

        for (Matricula matricula : matriculas) {

            String statusPlano =
                    matricula.getPlano().getAtivo() ? "Ativo" : "Inativo";

            System.out.println("Plano: " +
                    matricula.getPlano().getNome());

            System.out.println("Status do plano: " +
                    statusPlano);

            System.out.println("Aluno: " +
                    matricula.getAluno().getNome());

            System.out.println("Status da matrícula: " +
                    matricula.getStatus());

            System.out.println("------------------------------");
        }
    }

    // Total de alunos
    public void totalAlunos(ArrayList<Aluno> alunos) {

        System.out.println("\n=== TOTAL DE ALUNOS ===");
        System.out.println("Quantidade de alunos cadastrados: "
                + alunos.size());
    }
}