Atividade FitLife Unidade 4

Autor: Luciano Schuck

## Funcionalidades

- Cadastro, edição e listagem de alunos.

- Cadastro, edição e listagem de planos.

- Ativação e desativação de planos.

- Realização e cancelamento de matrículas.

- Cadastro e listagem de treinos.

- Simulação de pagamento de mensalidade.

- Relatórios de alunos, planos, matrículas, alunos por plano e total de alunos.

- Validação de dados e tratamento de exceções.

- Encapsulamento, associação e colaboração entre objetos.

O pagamento é uma simulação didática, sem integração com sistemas bancários. Os dados são armazenados apenas em memória e são perdidos ao encerrar o programa.

## Execução

Requisitos

- Java JDK 21 (ou superior)

- VS Code (ou outra IDE compatível com Java)

Compile o projeto:

```bash
javac *.java
```

Execute o programa:

```bash
java Main
```

Estrutura do Projeto
src/
├── Main.java

├── Aluno.java

├── Plano.java

├── Matricula.java

├── Relatorios.java

├── Treino.java

└── Pagamento.java


## Conceitos demonstrados

- **Classes e objetos:** `Aluno`, `Plano`, `Matricula`, `Treino`, `Pagamento` e `Relatorios`.

- **Encapsulamento:** atributos privados com utilização de getters e setters.

- **Validação:** tratamento de entradas inválidas com `try/catch` e verificações de valores.

- **Associação:** `Matricula` associa um aluno a um plano.

- **Colaboração:** as classes trabalham em conjunto para realizar matrículas, gerar relatórios, cadastrar treinos e processar pagamentos.

- **Coleções:** utilização de `ArrayList` para armazenar os dados do sistema.
