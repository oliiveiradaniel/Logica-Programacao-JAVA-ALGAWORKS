import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double frete = 15.0;
        Integer valorDescontoFrete = 100;

        System.out.print("Informe o valor da compra para calculo do frete: ");
        Double valor = scanner.nextDouble();

        if(valor >= valorDescontoFrete) {
            System.out.println("O valor final da sua compra é de R$" + valor);
        } else {
            Double valorComFrete = valor + frete;
            System.out.println("O valor final da sua compra é de R$" + valorComFrete);
        }
    }
}
