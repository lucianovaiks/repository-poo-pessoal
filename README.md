Atividade FitLife Unidade 4

Autor: Luciano Schuck

Features

Cadastro e listagem de alunos.
Cadastro e listagem de planos.
Realização de matrículas.
Cancelamento de matrículas.
Edição de alunos.
Edição de planos.
Ativação e desativação de planos.
Relatórios de alunos, planos e matrículas.
Armazenamento temporário dos dados em memória durante a execução do programa.

Execução

Requisitos
Java JDK 21 (ou superior)
VS Code (ou outra IDE compatível com Java)

Compilar
javac src/*.java

Executar
java -cp src Main

Estrutura do Projeto
src/
├── Main.java
├── Aluno.java
├── Plano.java
├── Matricula.java
└── Relatorios.java


Conceitos demonstrados
Classes e objetos: Aluno, Plano, Matricula e Relatorios.
Encapsulamento: utilização de atributos privados com métodos getters e setters.
Abstração: separação das responsabilidades entre as classes do sistema.
Associação: uma matrícula associa um aluno a um plano.
Colaboração entre objetos: as classes trabalham em conjunto para realizar o cadastro, gerenciamento e consulta das informações.
Coleções: utilização de ArrayList para armazenar alunos, planos e matrículas.
Estruturas de decisão e repetição: uso de switch, if/else, for e do-while.
Programação Orientada a Objetos: organização do sistema em classes independentes, promovendo reutilização e manutenção do código.
