import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaLogin {

    static String[][] usuarios = new String[10][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carregarDados();

        int opcao;
        do {
            System.out.println("**** SISTEMA DE LOGIN ****");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Autenticar Usuário");
            System.out.println("3. Listar Usuários");
            System.out.println("4. Atualizar Dados");
            System.out.println("5. Excluir Usuário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
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
                    salvarDados();
                    System.out.println("Obrigado por usar o Sistema de Login. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("        *** CADASTRO DE USUÁRIO ***         ");
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

    private static void listarUsuarios() {
        System.out.println("---------------------------------------------");
        System.out.println("LISTA DE USUÁRIOS: ");
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                System.out.println("Usuário: " + usuarios[i][0]);
            }
        }
        System.out.println("---------------------------------------------");
    }

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

    private static void excluirUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("**** DELETAR USUÁRIO ****");
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

    private static void carregarDados() {
        try (BufferedReader dados = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            int i = 0;
            while ((linha = dados.readLine()) != null) {
                String[] partes = linha.split(", ");
                usuarios[i][0] = partes[0].trim();
                usuarios[i][1] = partes[1].trim();
                usuarios[i][2] = partes[2].trim();
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados do arquivo: " + e.getMessage());
        }
    }

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
