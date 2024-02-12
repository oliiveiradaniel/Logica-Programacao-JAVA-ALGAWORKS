import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //chamando a função scanner

        //pedindo os valores ao usuario e guardando nas variaveis "valorProduto" e "valorPassadoPeloCliente"
        System.out.println("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.println("Digite quantidade passada pelo cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        //fazendo a conta dos valores passados e guardando em "resultado"
        double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println("Troco: " + resultado);

        scanner.close(); //precisa sempre fechar o scanner quando não for usar maisS
    }
}
