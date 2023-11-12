# Sistema De Login 
Abrange operações de CRUD (Create, Read, Update, Delete).

Este projeto de sistema de login visa proporcionar ao iniciante na linguagem Java:

#### - Lógica de Programação Prática:
Desenvolver habilidades práticas na implementação de operações básicas como cadastro, autenticação e persistência de dados.

#### - Manipulação de Dados em Java: 
Aprender a manipular arrays, estruturas condicionais e operações de entrada/saída em Java para construir um sistema funcional de login.

#### - Organização e Modularidade: 
Praticar a organização de código em funções modulares, promovendo clareza, manutenção e entendimento da estrutura básica de um programa.

## Requisistos do Projeto:
- Cadastro de Usuário:

A aplicação deve permitir o cadastro de novos usuários.
Cada usuário deve ter um nome de usuário único.

- Autenticação de Usuários:

Usuários cadastrados devem poder se autenticar fornecendo um nome de usuário e senha.
Listagem de Usuários:

A aplicação deve ser capaz de listar todos os usuários cadastrados.
Atualização de Dados:

Usuários devem poder atualizar suas senhas.

- Exclusão de Usuários:

Usuários devem poder excluir suas contas.

- Persistência de Dados:

Os dados dos usuários devem ser persistidos para que não se percam entre diferentes execuções do programa.
Atributos:

- Nome de Usuário (String):

Identifica cada usuário de forma única.

- Senha (String):

Garante a segurança da conta do usuário.

## Regras de Negócios:
- Unicidade de Nome de Usuário:

Não podem existir dois usuários com o mesmo nome de usuário.

- Autenticação Bem-sucedida:

Para autenticar um usuário, o nome de usuário e a senha fornecidos devem coincidir com as informações cadastradas.

- Limite de Usuários:

Existe um limite fixo de usuários que podem ser cadastrados.

## Tecnologias Utilizadas:
- Java:

A linguagem de programação principal para o desenvolvimento do projeto.

- Scanner (java.util.Scanner):

Utilizado para a entrada de dados do usuário.

- Manipulação de Arquivos em Java:

Utilizado para persistência de dados, permitindo a leitura e escrita de informações em um arquivo.

- Estruturas de Controle (if, switch):

Utilizadas para controlar o fluxo do programa com base nas escolhas do usuário.

## Observações Adicionais:
- Projeto Sem POO:

O projeto foi implementado sem utilizar Programação Orientada a Objetos.

- Armazenamento de Dados:

Os dados dos usuários são armazenados em um arquivo de texto simples.
