import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer notaMinimaEmCadaMateria = 60;
        Double notaMinimaParaPassar = 150.0;
        Double notaTotal;

        System.out.print("Informe a sua nota em Portugues: ");
        Double notaPortugues = scanner.nextDouble();

        System.out.print("Informe a sua nota em Matematica: ");
        Double notaMatematica = scanner.nextDouble();

        scanner.close();

        if (notaPortugues >= notaMinimaEmCadaMateria && notaMatematica >= notaMinimaEmCadaMateria) {
            notaTotal = notaMatematica + notaPortugues;
            if (notaTotal >= notaMinimaParaPassar) {
                System.out.println("Parabens! Voce foi aprovado.");
            } else {
                System.out.println("Infelizmente voce foi reprovado.");
            }
        } else {
            System.out.println("Infelizmente voce foi reprovado.");
        }

    }
}
