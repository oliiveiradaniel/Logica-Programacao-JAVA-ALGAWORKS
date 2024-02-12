public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        Integer numero = 10;
        System.out.println("Numero Antes: " + numero);

        numero++; //pode ser usado como ++numero
        System.out.println("Numero depois: " + numero);

        //se feito ++numero, primeiro faz a soma e depois atribui a variavel
        //se feito numero++, primeiro atribui a variavel e depois faz a soma

        Integer numero2 = 10;
        --numero2;
        System.out.println("Número: " + numero2);

        //se feito --numero, primeiro faz a subtração e depois atribui a variavel
        //se feito numero--, primeiro atribui a variavel e depois faz a subtração
    }
}
