package exerciciosmanutencao.ex1;

/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 *
 * Violação do princípio aberto/fechado.
 *
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco  {

   public double calcular(double preco,Calculos calculo){
       return calculo.calcular(preco);
   }

    public static void main(String[] args) {

       CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

       CalcularImposto imposto = new CalcularImposto();

        System.out.println(calculadoraDePreco.calcular(100,imposto));

    }

}
