import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Plano> planos = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();

        Relatorios relatorio = new Relatorios();

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("      ACADEMIA FITLIFE");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar plano");
            System.out.println("3 - Realizar matrícula");
            System.out.println("4 - Mostrar alunos");
            System.out.println("5 - Mostrar planos");
            System.out.println("6 - Editar aluno");
            System.out.println("7 - Editar plano");
            System.out.println("8 - Alterar status do plano");
            System.out.println("9 - Mostrar matrículas");
            System.out.println("10 - Cancelar matrícula");
            System.out.println("11 - Relatórios");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                
                case 1:

                    System.out.println("\n=== CADASTRAR ALUNO ===");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Aluno aluno = new Aluno(nome, cpf, idade, telefone);

                    alunos.add(aluno);

                    System.out.println("\nAluno cadastrado com sucesso!");

                    break;

                 case 2:

                    System.out.println("\n=== CADASTRAR PLANO ===");

                    System.out.print("Nome do plano: ");
                    String nomePlano = scanner.nextLine();

                    System.out.print("Valor do plano: ");
                    double valor = scanner.nextDouble();

                    System.out.print("Duração (meses): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();

                    Plano plano = new Plano(nomePlano, valor, duracao);

                    planos.add(plano);

                    System.out.println("\nPlano cadastrado com sucesso!");

                    break;

                case 3:

                    if (alunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados.");
                        break;
                    }

                    if (planos.isEmpty()) {
                        System.out.println("Não há planos cadastrados.");
                        break;
                    }

                    System.out.println("\n=== ALUNOS ===");

                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println((i + 1) + " - " + alunos.get(i).getNome());
                    }

                    System.out.print("Escolha o aluno: ");
                    int indiceAluno = scanner.nextInt() - 1;

                    System.out.println("\n=== PLANOS ===");

                    for (int i = 0; i < planos.size(); i++) {
                        System.out.println((i + 1) + " - " + planos.get(i).getNome());
                    }

                    System.out.print("Escolha o plano: ");
                    int indicePlano = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indiceAluno >= 0 && indiceAluno < alunos.size()
                            && indicePlano >= 0 && indicePlano < planos.size()) {

                        if (!planos.get(indicePlano).getAtivo()) {

                            System.out.println("Não é possível realizar a matrícula. O plano está inativo.");

                        } else {

                            Matricula matricula = new Matricula(
                                    alunos.get(indiceAluno),
                                    planos.get(indicePlano));

                            matriculas.add(matricula);

                            System.out.println("Matrícula realizada com sucesso!");
                        }

                    } else {

                        System.out.println("Aluno ou plano inválido.");

                    }

                    break;

                case 4:

                    relatorio.listarAlunos(alunos);

                    break;

                case 5:

                    relatorio.listarPlanos(planos);

                    break;

                case 6:

                    if (alunos.isEmpty()) {

                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    System.out.println("\n=== EDITAR ALUNO ===");

                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println((i + 1) + " - " + alunos.get(i).getNome());
                    }

                    System.out.print("Escolha o aluno: ");
                    int indice = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indice >= 0 && indice < alunos.size()) {

                        System.out.print("Novo nome: ");
                        alunos.get(indice).setNome(scanner.nextLine());

                        System.out.print("Novo CPF: ");
                        alunos.get(indice).setCpf(scanner.nextLine());

                        System.out.print("Nova idade: ");
                        alunos.get(indice).setIdade(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("Novo telefone: ");
                        alunos.get(indice).setTelefone(scanner.nextLine());

                        System.out.println("\nDados atualizados com sucesso!");

                    } else {

                        System.out.println("Aluno não encontrado.");
                    }

                    break;

                case 7:

                    if (planos.isEmpty()) {

                        System.out.println("Nenhum plano cadastrado.");
                        break;
                    }

                    System.out.println("\n=== EDITAR PLANO ===");

                    for (int i = 0; i < planos.size(); i++) {
                        System.out.println((i + 1) + " - " + planos.get(i).getNome());
                    }

                    System.out.print("Escolha o plano: ");
                    int indicePlanoEditar = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indicePlanoEditar >= 0 && indicePlanoEditar < planos.size()) {

                        System.out.print("Novo nome do plano: ");
                        planos.get(indicePlanoEditar).setNome(scanner.nextLine());

                        System.out.print("Novo valor: ");
                        planos.get(indicePlanoEditar).setValor(scanner.nextDouble());

                        System.out.print("Nova duração (meses): ");
                        planos.get(indicePlanoEditar).setDuracao(scanner.nextInt());
                        scanner.nextLine();

                        System.out.println("\nPlano atualizado com sucesso!");

                    } else {

                        System.out.println("Plano não encontrado.");
                    }

                    break;

                case 8:

                    if (planos.isEmpty()) {

                        System.out.println("Nenhum plano cadastrado.");
                        break;
                    }

                    System.out.println("\n=== PLANOS ===");

                    for (int i = 0; i < planos.size(); i++) {

                        String status = planos.get(i).getAtivo() ? "Ativo" : "Inativo";

                        System.out.println((i + 1) + " - "
                                + planos.get(i).getNome()
                                + " (" + status + ")");
                    }

                    System.out.print("Escolha o plano: ");
                    int indicePlanoStatus = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indicePlanoStatus >= 0 && indicePlanoStatus < planos.size()) {

                        System.out.println("\n1 - Ativar");
                        System.out.println("2 - Desativar");

                        System.out.print("Escolha: ");
                        int escolhaStatus = scanner.nextInt();
                        scanner.nextLine();

                        if (escolhaStatus == 1) {

                            planos.get(indicePlanoStatus).ativar();

                        } else if (escolhaStatus == 2) {

                            planos.get(indicePlanoStatus).desativar();

                        } else {

                            System.out.println("Opção inválida.");
                        }

                    } else {

                        System.out.println("Plano não encontrado.");
                    }

                    break;

                case 9:

                    relatorio.listarMatriculas(matriculas);

                    break;

                case 10:

                    if (matriculas.isEmpty()) {

                    System.out.println("Não há matrículas cadastradas.");
                    break;
                
                    }

                    System.out.println("\n=== MATRÍCULAS ===");

                    for (int i = 0; i < matriculas.size(); i++) {

                        System.out.println((i + 1) + " - "
                                + matriculas.get(i).getAluno().getNome()
                                + " ("
                                + matriculas.get(i).getPlano().getNome()
                                + ")");
                    }

                    System.out.print("Escolha a matrícula: ");
                    int escolha = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (escolha >= 0 && escolha < matriculas.size()) {

                        if (matriculas.get(escolha).getStatus().equals("Inativa")) {

                            System.out.println("Essa matrícula já está cancelada.");

                        } else {

                            matriculas.get(escolha).cancelar();

                            System.out.println("Matrícula cancelada com sucesso!");
                        }

                    } else {

                        System.out.println("Opção inválida.");
                    }  

                    break;

                case 11:

                    int opcaoRelatorio;

                    do {

                        System.out.println("\n=== RELATÓRIOS ===");
                        System.out.println("1 - Listar alunos");
                        System.out.println("2 - Listar planos");
                        System.out.println("3 - Listar matrículas");
                        System.out.println("4 - Alunos por plano");
                        System.out.println("5 - Total de alunos");
                        System.out.println("0 - Voltar");

                        System.out.print("Escolha uma opção: ");
                        opcaoRelatorio = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoRelatorio) {

                            case 1:
                                relatorio.listarAlunos(alunos);
                                break;

                            case 2:
                                relatorio.listarPlanos(planos);
                                break;

                            case 3:
                                relatorio.listarMatriculas(matriculas);
                                break;

                            case 4:
                                relatorio.alunosPorPlano(matriculas);
                                break;

                            case 5:
                                relatorio.totalAlunos(alunos);
                                break;

                            case 0:
                                System.out.println("Retornando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcaoRelatorio != 0);

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");

                                }

        } while (opcao != 0);

        scanner.close();
    }
}