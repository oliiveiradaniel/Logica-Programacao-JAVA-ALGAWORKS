import java.util.Scanner;

public class Exercicio03 {
    final static Integer NOTA_MINIMA = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua nota entre 0 e 100: ");
        int nota = scanner.nextInt();

        boolean aprovado = nota >= NOTA_MINIMA;

        if(aprovado) {
            System.out.println("Voce foi aprovado!");
        } else {
            System.out.println("Infelizmente voce foi reprovado.");
        }
        scanner.close();
    }
}
