import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Um simples Sistema de Login em Java que incorpora operações CRUD.
 * Permite cadastrar, autenticar, listar, atualizar e excluir usuários.
 * Os dados dos usuários são armazenados em um array bidimensional e persistidos em um arquivo de texto (usuarios.txt).
 */

public class SistemaLogin {

    // Array bidimensional para armazenar os dados dos usuários (nome, nome de usuário, senha)
    static String[][] usuarios = new String[10][3];

    /**
     * Função principal que inicia o Sistema de Login e interage com o usuário.
     * Permite escolher entre diferentes operações CRUD através de um menu interativo.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializa um Scanner para receber entrada do usuário a partir do console
        carregarDados();// Carregar dados a partir do arquivo "usuarios.txt" ao iniciar

        int opcao;
        do { // Inicia um loop que mantém o programa em execução
            System.out.println("**** SISTEMA DE LOGIN ****"); // Exibe o menu de opções
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Autenticar Usuário");
            System.out.println("3. Listar Usuários");
            System.out.println("4. Atualizar Dados");
            System.out.println("5. Excluir Usuário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");// Solicita ao usuário uma escolha

            opcao = sc.nextInt();// Lê a escolha do usuário

            switch (opcao) {  // Realiza a operação correspondente para lidar com a escolha do usuário
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    autenticarUsuario();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    atualizarSenha();
                    break;
                case 5:
                    excluirUsuario();
                    break;
                case 6:
                    salvarDados(); // Salva os dados dos usuários no arquivo ao sair
                    System.out.println("Obrigado por usar o Sistema de Login. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); // Trata escolhas inválidas
            }
        } while (opcao != 6); // Continua o loop enquanto o usuário não escolher a opção 6 (sair)

        sc.close(); // Fecha o Scanner para evitar vazamentos de recursos
    }

    /**
     * Cadastra um novo usuário no sistema.
     * Solicita informações como nome completo, nome de usuário e senha.
     * Os dados do usuário são armazenados no array de usuários.
     */
    private static void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("        *** CADASTRO DE USUARIO ***         ");
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Nome de usuário: ");
        String nomeUser = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] == null) {
                usuarios[i][0] = nome;
                usuarios[i][1] = nomeUser;
                usuarios[i][2] = senha;
                System.out.println("Usuário cadastrado com sucesso!!!");
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Limite de usuários atingido. Não foi possível cadastrar.");
    }

    /**
     * Autentica um usuário no sistema.
     * Solicita nome de usuário e senha e verifica se correspondem a um usuário existente.
     * Exibe mensagem de autenticação bem-sucedida ou falha.
     */
    private static void autenticarUsuario() {
        System.out.println("---------------------------------------------");
        System.out.println("**** AUTENTICAR ****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuário: ");
        String user = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][1] != null && usuarios[i][1].equals(user) && usuarios[i][2].equals(senha)) {
                System.out.println("Autenticação bem-sucedida.");
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Credenciais inválidas. Autenticação falhou.");
    }

    /**
     * Lista os usuários cadastrados no sistema.
     * Exibe o nome de cada usuário na saída padrão.
     */
    private static void listarUsuarios() {
        System.out.println("---------------------------------------------");
        System.out.println("LISTA DE USUARIOS: ");
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                System.out.println("Usuário: " + usuarios[i][0]);
            }
        }
        System.out.println("---------------------------------------------");
    }

    /**
     * Atualiza a senha de um usuário existente no sistema.
     * Solicita o nome de usuário, verifica a existência e permite a atualização da senha.
     */
    private static void atualizarSenha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("**** ALTERAR SENHA ****");
        System.out.print("Digite o nome de usuário para atualizar a senha: ");
        String nomeUser = sc.nextLine();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][1] != null && usuarios[i][1].equals(nomeUser)) {
                System.out.print("Digite a nova senha: ");
                String novaSenha = sc.nextLine();
                usuarios[i][2] = novaSenha;
                System.out.println("Senha atualizada com sucesso.");
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Usuário não encontrado. Atualização falhou.");
    }

    /**
     * Exclui um usuário do sistema.
     * Solicita o nome de usuário, verifica a existência e remove os dados do usuário.
     */
    private static void excluirUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("**** DELETAR USUARIO ****");
        System.out.print("Digite o nome de usuário para excluir: ");
        String nomeUser = sc.nextLine();
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][1] != null && usuarios[i][1].equals(nomeUser)) {
                usuarios[i][0] = null;
                usuarios[i][1] = null;
                usuarios[i][2] = null;
                System.out.println("Usuário excluído com sucesso.");
                System.out.println("---------------------------------------------");
                return;
            }
        }
        System.out.println("Usuário não encontrado. Exclusão falhou.");
    }

    /**
     * Carrega os dados dos usuários de um arquivo de texto.
     * Os dados são armazenados no array de usuários.
     */
    private static void carregarDados() {
        try (BufferedReader dados = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            int i = 0;
            while ((linha = dados.readLine()) != null) {
                String[] partes = linha.split(", ");
                usuarios[i][0] = partes[0].trim(); // trim(); Remover espaços em branco em excesso
                usuarios[i][1] = partes[1].trim();
                usuarios[i][2] = partes[2].trim();
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados do arquivo: " + e.getMessage());
        }
    }

    /**
     * Salva os dados dos usuários em um arquivo de texto.
     * Apenas os usuários não nulos são salvos.
     */
    private static void salvarDados() {
        try (FileWriter arquivo = new FileWriter("usuarios.txt")) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i][0] != null) {
                    arquivo.write(usuarios[i][0] + ", " + usuarios[i][1] + ", " + usuarios[i][2] + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }
}
