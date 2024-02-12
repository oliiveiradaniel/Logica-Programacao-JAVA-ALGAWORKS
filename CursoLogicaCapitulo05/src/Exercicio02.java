import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando variaveis
        Double mediaSalarial = 2000.0;

        // pedindo informação ao usuario
        System.out.print("Informe a meta de faturamento anual: ");
        Double metaFaturamento = scanner.nextDouble();

        System.out.print("Informe o faturamento anual: ");
        Double faturamentoReal = scanner.nextDouble();

        scanner.close();

        //logica
        Boolean ganhamBonus = faturamentoReal >= metaFaturamento;
        Boolean ganhamBonusMenor = faturamentoReal >= (metaFaturamento * 0.8);

        if (ganhamBonus) {
            mediaSalarial = mediaSalarial + mediaSalarial;
            System.out.print("Parabens! A empresa bateu a meta esperada, o seu salario vai ser de: R$" + mediaSalarial);
        } else if (ganhamBonusMenor) {
            mediaSalarial = mediaSalarial + (mediaSalarial * 0.8);
            System.out.print("Infelizmente a empresa não bateu a meta esperada, então o seu bonus sera de 80%, o seu salario vai ser de: R$" + mediaSalarial);
        } else {
            System.out.println("Infelizmente a empresa não bateu nenhuma meta, voce receberá o seu salario comum de: R$");
        }
    }
}
