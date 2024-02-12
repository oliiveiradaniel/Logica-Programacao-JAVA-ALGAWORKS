import java.util.Scanner;

public class RetornandoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        exibirValoresDoArray(cursos);

        Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

        Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);


        if (!posicaoValida) {
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        exibirValoresDoArray(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, formasPagamento);

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

    static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
        imprimirEContinuarNaMesmaLinha(texto);
        Integer numero = scanner.nextInt();

        return numero;
    }
    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirEContinuarNaMesmaLinha(String texto) {
        System.out.print(texto);
    }

    static void exibirValoresDoArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            imprimir("[" + i + "] " + array[i]);
        }
    }

    static void imprimirCursoEPagamento(String curso, String pagamento) {
        imprimir("O curso escolhido foi " + curso + " e a forma de pagamento é " + pagamento);
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] array) {
        Boolean valida = posicao >= 0 && posicao < array.length;
        return valida;
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
