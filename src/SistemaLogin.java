import java.util.Scanner;

public class SistemaLogin {

    static String[][] usuarios = new String[10][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Sistema de Login");
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
                case 6:
                    System.out.println("Obrigado por usar o Sistema de Login. Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);


    }

    static void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("        *** CADASTRO DE USUÁRIO ***         ");
        System.out.println("---------------------------------------------");
        System.out.print("Nome completo: ");
        String nome = sc.next();
        System.out.println("Data de Nascimento (formato: dd/MM/yyyy): ");
        String dataNasc = sc.next();
        System.out.println("CPF (formato: 000.000.000-00): ");
        String cpf = sc.next();
        System.out.print("Nome de usuário: ");
        String nomeuser = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] == null) {
                usuarios[i][0] = nome;
                usuarios[i][1] = dataNasc;
                usuarios[i][2] = cpf;
                usuarios[i][3] = nomeuser;
                usuarios[i][4] = senha;
                System.out.println("Usuário cadastrado com sucesso!!!");
                return;
            }

        }
        System.out.println("Limite de usuários atingido. Não foi possível cadastrar.");
    }

    private static void autenticarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuário: ");
        String user = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(user) && usuarios[i][1].equals(senha)) {
                System.out.println("Autenticação bem-sucedida.");
                return;

            }

        }
        System.out.println("Credenciais inválidas. Autenticação falhou.");
    }
}
