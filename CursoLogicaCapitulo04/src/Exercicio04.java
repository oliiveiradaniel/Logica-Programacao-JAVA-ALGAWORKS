import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variaveis
        Integer idadeMinima = 55;
        Integer contribuicaoMinima = 25;

        //perguntando ao usuario
        System.out.print("Insira a sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Insira o seu tempo de contribuição: ");
        Integer tempoContribuicao = scanner.nextInt();

        //logica
        Boolean podeAposentar = idade >= idadeMinima && tempoContribuicao >= contribuicaoMinima;

        if(podeAposentar) {
            System.out.println("Parabens! Voce já pode se aposentar.");
        } else {
            System.out.println("Infelizmente voce ainda não possui os requisitos minimos para se aposentar.");
        }





    }
}
