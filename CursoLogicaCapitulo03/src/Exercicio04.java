import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Informe a quantidade do produto: ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valorDesconto = 0.0;


        if(quantidadeProduto > 10) {
            valorDesconto = 10.0;
        }

        Double subTotal = valorProduto * quantidadeProduto;
        Double desconto = subTotal *  valorDesconto / 100;
        Double valorTotal = subTotal - desconto;

        System.out.print("O valor que deverá pagar é: " + valorTotal);
    }
}
