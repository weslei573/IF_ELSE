import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Loca";
        System.out.println("Digiter seu salario: ");
        double salario = scanner.nextDouble();

        int numeroDependentes = 2;
        boolean isento = false;
        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor irrf: " + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf.");
        } else {
            System.out.println("Não há valores de irrf.");
        }
    }
}