import java.util.Scanner;

public class DoacaoDeSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <=65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido){
            System.out.println("O doador é compatível para doacão de sangue.");
        } else {
            System.out.println("O doador não e compatível. Motivo: ");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido){
                System.out.println("- Deve pesar mais de 50kg.");
            }
        }
        scanner.close();
    }
}
