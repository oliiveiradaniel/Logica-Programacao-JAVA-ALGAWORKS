import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];


        System.out.println("Informe as suas 5 tarefas mais importantes do seu dia!");
        Integer numeroTarefa = 1;

        for (int i = 0; i < tarefas.length; i++) {
            System.out.print(numeroTarefa + "° - ");
            tarefas[i] = scanner.next();
            numeroTarefa++;
        }

        scanner.close();

        System.out.println("As suas tarefas mais importantes são: ");
        Integer numeroTarefa2 = 1;

        for (int i = 0; i < tarefas.length; i++) {
            System.out.print(numeroTarefa2 + "° - ");
            System.out.println(tarefas[i]);
            numeroTarefa2++;
        }
    }
}
