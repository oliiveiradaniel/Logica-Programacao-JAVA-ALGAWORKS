import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso em KG: ");
        Double peso = scanner.nextDouble();

        System.out.println("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("O calculo do seu IMC utilizando os valores " + peso + "Kg e " + altura + "M, é de: " + imc);
    }
}
