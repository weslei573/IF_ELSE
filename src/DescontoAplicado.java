import java.util.Scanner;

public class DescontoAplicado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100){
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado. \nNovo valor: R$ "+valorComDesconto);
        }else {
            System.out.println("Desconto não aplicado. \nValor total: R$ "+ valorCompra);
        }
    }
}
