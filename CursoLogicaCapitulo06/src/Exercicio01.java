public class Exercicio01 {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < numeros.length; i++) {
            //Integer numAtual = numeros[i];
            Integer modulo = i % 3;
            if (modulo.equals(0)) {
                System.out.println("Esse numero é divisivel por 3: " + i);
            }
        }
    }
}
