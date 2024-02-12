/*
Crie uma programa que vai, simplesmente, mostrar os dados de um pedido de vendas no console.

O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido. Essa classe terá 4 atributos: código, subtotal, desconto e total.

No método main do programa você vai criar uma variável que poderá chamar de pedido, do tipo Pedido, e instanciar ela. Coloque os valores de cada atributo,
da variável pedido, como achar melhor.

Feito isso, mostre todas essas propriedades no console. Não esqueça de encapsular cada propriedade antes de exibir os dados no console.
Isso é para que você não use as variáveis diretamente e sim os métodos getters e setters.

Depois dessa primeira etapa, você fará o seguinte... Remova a propriedade total da classe Pedido.

-------------------------- fazer a partir daqui -----------------------------------

Vai dar um erro nos métodos getTotal e setTotal. No método getTotal mude a implementação de forma que o retorno dele seja a subtração da propriedade subtotal
pela propriedade desconto.

O método setTotal você pode, simplesmente, deixá-lo vazio, pois, não será mais útil.
Em um caso real, ele seria removido de todo o programa aos poucos e sem a necessidade de urgência.

PS: O exercício é feito em dois passos para que você perceba a importância do encapsulamento.
 */

package Exercicio03;

public class Pedido {

    String codigo;

    Double subtotal;

    //Double total;

    Double desconto;

    //getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        Double total = subtotal - desconto;
        return total;
    }

    public void setTotal(Double total) {
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
