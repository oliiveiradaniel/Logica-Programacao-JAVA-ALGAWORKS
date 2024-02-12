public class VetoresMaisDe2Dimensoes {
    public static void main(String[] args) {
        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[]{1500.0, 2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1600.0, 2500.0, 1800.0};

        //criando um array de 2 dimensões, só aceita array de 1 dimensão dentro dele
        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

        //System.out.println("Faturamento do dia 1° de Janeiro: " + faturamentoAnual[0][0]);
        //System.out.println("Faturamento do dia 3° de Fevereiro: " + faturamentoAnual[1][2]);

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            //Double[] mes = faturamentoAnual[i];

            for(int y = 0; y < faturamentoAnual[i].length; y++) {
                //o primeiro [] entra no primeiro array, no segundo [] voce entra dentro do segundo array, ambos pode devolver os valores das posições.
                Double dia = faturamentoAnual[i][y];// Double dia = mes[y];
                System.out.println("Dia " + (y + 1) + ": " + dia);
            }
        }
    }
}
