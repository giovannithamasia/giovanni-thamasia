package exerciciosmanutencao.ex1;

/**
 * 1)
 * O IMPOSTO está fixo em 10%, dificultando adaptação a novas regras.
 *
 * Violação do princípio aberto/fechado.
 *
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco  {

    private static final double IMPOSTO = 0.10;

    public static double calcular(double preco){
        double resultado = preco;
        resultado = resultado * (preco*IMPOSTO);
        return resultado;
    }


    public static void main(String[] args) {
        System.out.println(calcular(100));
    }

}
