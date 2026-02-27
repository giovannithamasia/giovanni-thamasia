package exerciciosmanutencao.ex1;

/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 *
 * Não há forma de incluir novos cálculos (ex: desconto) sem alterar o método.
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
        CalculadoraDePreco calculadora = new CalculadoraDePreco();

        CalcularDesconto desconto = new CalcularDesconto();
        CalcularImposto imposto = new CalcularImposto();

        System.out.println(calculadora.calcular(100,desconto));
        System.out.println(calculadora.calcular(100,imposto));

    }

}
