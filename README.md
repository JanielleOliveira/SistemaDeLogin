# Sistema De Login 
Abrange operações de CRUD (Create, Read, Update, Delete).

Este projeto é um simples sistema de login que visa proporcionar ao iniciante na linguagem Java:

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


## Instruções de Compilação

Certifique-se de ter o Java Development Kit (JDK) instalado no seu sistema.

1. **Abra um terminal ou prompt de comando:**
   - Navegue até o diretório que contém o arquivo `SistemaLogin.java` usando o comando `cd`.

2. **Compile o código-fonte:**
   - Utilize o comando `javac` ou `javac.exe` para compilar o código-fonte. Substitua `<caminho-do-arquivo>` pelo caminho completo até o arquivo `SistemaLogin.java`:

     ```bash
     javac ou java.exe <caminho-do-arquivo>/SistemaLogin.java
     ```

   Por exemplo, se você estiver no diretório correto:

     ```bash
     javac SistemaLogin.java
     ```

   Isso criará um arquivo `SistemaLogin.class` no mesmo diretório.

3. **Execute o programa:**
   - Utilize o comando `java` para executar o programa Java compilado. Certifique-se de incluir a extensão `.class` no nome do arquivo:

     ```bash
     java SistemaLogin
     ```

   Isso iniciará a execução do programa e exibirá o menu interativo no console.

Certifique-se de ter permissões de escrita no diretório para salvar os dados no arquivo `usuarios.txt` durante a execução do programa.

Nota: Se você estiver usando um sistema operacional diferente, os comandos podem variar um pouco. Adapte conforme necessário para o seu ambiente.
