import java.util.Scanner;

public class SenhaInserida {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        scanner.close();

        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso premitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
