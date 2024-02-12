import java.util.Scanner;

public class CalculandoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero que deseja multiplicar ao quadrado: ");
        Double num = scanner.nextDouble();

        Double res = num * num;

        System.out.println("O quadrado de " + num + " é: " + res);
    }
}
