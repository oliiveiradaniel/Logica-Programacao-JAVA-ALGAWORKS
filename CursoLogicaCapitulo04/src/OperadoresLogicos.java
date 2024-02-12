public class OperadoresLogicos {

    public static void main(String[] args) {
        Boolean carrinhoMaiorQue100 = true;
        Boolean periodoDePromocao = true;
        Boolean jaFezCompraNaLoja = true;
        Boolean pagamentoAVista = true;
//        Integer teste1 = 1;
//        Integer teste2 = 1;

//        Boolean testecomparar = teste1 == 1 && teste2 == 1; // pode tambem comparar numeros ou resultados diretamente

//        Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;

//        Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;

//        Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;

//        Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;

        Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;

        if(aplicarDesconto) {
            System.out.println("Sim! Aplique o desconto");
        } else {
            System.out.println("Não aplique o desconto");
        }


    }
}
