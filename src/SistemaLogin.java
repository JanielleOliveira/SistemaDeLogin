import java.util.Scanner;

public class SistemaLogin {

    static String[][] usuarios = new String[10][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Sistema de Login (Sem POO)");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Autenticar Usuário");
            System.out.println("3. Listar Usuários");
            System.out.println("4. Atualizar Dados");
            System.out.println("5. Excluir Usuário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
        }



    }
}
