public class Vetores2Dimensoes {
    public static void main(String[] args) {
        Double[] faturamentoJaneiro = new Double[]{1500.0, 2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1600.0, 2500.0, 1800.0};


        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro}; //array de 2 dimensoes

        Double[][][] faturamentoQuinquenal = new Double[][][]{faturamentoAnual}; //array de 3 dimensoes

        Double[][][][] faturamentoDecada = new Double[][][][]{faturamentoQuinquenal}; //array de 4 dimensoes



//        for (int i = 0; i < faturamentoAnual.length; i++) {
//            System.out.println("Mês: " + (i + 1));
//
//            //Double[] mes = faturamentoAnual[i];
//
//            for(int y = 0; y < faturamentoAnual[i].length; y++) {
//                //o primeiro [] entra no primeiro array, no segundo [] voce entra dentro do segundo array, ambos pode devolver os valores das posições.
//                Double dia = faturamentoAnual[i][y];// Double dia = mes[y];
//                System.out.println("Dia " + (y + 1) + ": " + dia);
//            }
//        }
    }
}
