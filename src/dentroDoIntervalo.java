import java.util.Scanner;

public class dentroDoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        int emprestimo = scanner.nextInt();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.println("O valor " + emprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + emprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
