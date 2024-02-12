import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Informe o valor da conta de luz: ");
        Double valorTotal = scanner.nextDouble();

        System.out.print("Informe o valor da conta de agua: ");
        valorTotal += scanner.nextDouble();

        System.out.print("Informe o valor da conta de telefone: ");
        valorTotal += scanner.nextDouble();

        System.out.print("Informe o valor da conta de escola: ");
        valorTotal += scanner.nextDouble();

        System.out.print("Informe o valor da conta de cartão: ");
        valorTotal += scanner.nextDouble();

        System.out.print("Informe o valor da conta de mercado: ");
        valorTotal += scanner.nextDouble();

        System.out.println("A soma de todos os valores informados é: " + valorTotal);

        scanner.close();


    }
}
