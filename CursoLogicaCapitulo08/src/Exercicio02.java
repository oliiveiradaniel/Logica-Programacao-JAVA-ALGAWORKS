import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        exibirValoresDoArray(cursos);

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        exibirValoresDoArray(formasPagamento);

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimirCursoEPagamento(cursoEscolhido, formaPagamentoEscolhida);

        scanner.close();
    }

    //metodo com parametros
    static void exibirValoresDoArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] " + array[i]);
        }
    }

    static void imprimirCursoEPagamento(String curso, String pagamento) {
        System.out.println("O curso escolhido foi " + curso + " e a forma de pagamento é " + pagamento);
    }

    //metodos
    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }

    static void encerrarProgramaPorCausaDaPosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
}