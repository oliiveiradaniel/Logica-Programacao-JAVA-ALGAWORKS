package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();

        System.out.println("Informe as suas tarefas do dia seguinte: ");

        String parar = "";
        int i = 0;

        while (!parar.equals("x")) {
            System.out.print("Tarefa " + i + ": ");
            String tarefa = scanner.nextLine();
            tarefas.add(tarefa);

            System.out.println("Quer adicionar outra atividade? [y - Sim / x - Não]");
            parar = scanner.nextLine();
            i++;
        }

        Path arquivo = Paths.get("C:\\Users\\danie\\OneDrive\\AlgaWorks\\arquivo.txt");
        Files.write(arquivo, tarefas);

        List<String> lerTarefas = Files.readAllLines(arquivo);

        for (int y = 0; y < lerTarefas.size(); y++) {
            String tarefa = lerTarefas.get(y);
            System.out.println(tarefa);
        }

        System.out.println("Fim!");

        scanner.close();
    }
}
