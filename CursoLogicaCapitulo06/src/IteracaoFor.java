public class IteracaoFor {
    public static void main(String[] args) {
        //dentro do for(criar variavel com valor(Ex: int i = 0); inserir uma expressão booleana(Ex: i < 5); colocar o que vai ser executado em cada volta(Ex: i++))

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + "Uma frase qualquer.");

//        Double[] carrinhoDeCompras = new Double[]{50.0, 50.0, 50.0}; //para criar um array, colocamos [] no inicio e []{} no final
//        Double total = 0.0;
//
//        for (int i = 0; i < carrinhoDeCompras.length; i++) { //para descobrir o tamanho do array, colocamos o metodo .length
//            total += carrinhoDeCompras[i]; //a mesma coisa que total = total + carrinhoDeCompras[i]
//        }
//        System.out.println("Total: " + total);

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                System.out.println("Vai parar!");
//              break;
//            }
//            System.out.println("Iteração: " + i);
//        }
        //depois do break no for, ele começa fora do for


        Integer[] produtos = new Integer[]{100, 225, 300};

        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];
            System.out.println("Produto de código: " + produto);

            if (produto.equals(225)) {
                System.out.println("Produto encontrado!");
                break;
            }
        }





    }
}
