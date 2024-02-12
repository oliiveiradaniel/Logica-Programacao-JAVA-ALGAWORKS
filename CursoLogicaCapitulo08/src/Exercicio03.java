import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o a operação que deseja fazer [1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão]: ");
        Integer operacao = scanner.nextInt();

        System.out.print("Informe o primeiro numero: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo numero: ");
        Double num2 = scanner.nextDouble();

        switch (operacao) {
            case 1:
                System.out.println("O resultado da adição é: " + adicao(num1, num2));
                break;

            case 2:
                System.out.println("O resultado da subtracao é: " + subtracao(num1, num2));
                break;

            case 3:
                System.out.println("O resultado da multiplicacao é: " + multiplicacao(num1, num2));
                break;

            case 4:
                System.out.println("O resultado da divisao é: " + divisao(num1, num2));
                break;

            default:
                System.err.println("Operação invalida!");
                System.exit(1);
        }
    }

    static Double adicao(Double num1, Double num2) {
        Double resultado = num1 + num2;
        return resultado;
    }

    static Double subtracao(Double num1, Double num2) {
        Double resultado = num1 - num2;
        return resultado;
    }

    static Double multiplicacao(Double num1, Double num2) {
        Double resultado = num1 * num2;
        return resultado;
    }

    static Double divisao(Double num1, Double num2) {
        Double resultado = num1 / num2;
        return resultado;
    }
}
