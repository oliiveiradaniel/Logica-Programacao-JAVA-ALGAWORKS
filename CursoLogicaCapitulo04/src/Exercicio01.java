import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo numero: ");
        Double num2 = scanner.nextDouble();

        System.out.print("Informe o tipo de conta que deseja realizar [1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão]: ");
        Integer tipoConta = scanner.nextInt();

        if (tipoConta == 1) {
            Double resultado1 = num1 + num2;
            System.out.println("A soma dos numeros informados é: " + resultado1);
        }
        if (tipoConta == 2) {
            Double resultado2 = num1 - num2;
            System.out.println("A subtração dos numeros informados é: " + resultado2);
        }
        if (tipoConta == 3) {
            Double resultado3 = num1 * num2;
            System.out.println("A multiplicação dos numeros informados é: " + resultado3);
        }
        if (tipoConta == 4) {
            Double resultado4 = num1 / num2;
            System.out.println("A divisão dos numeros informados é: " + resultado4);
        }

        scanner.close();

    }
}
