package exerciciosmanutencao.ex1;

public class CalcularImposto implements Calculos{


    @Override
    public double calcular(double preco) {
        double porcentagem = 10;

        double imposto = preco*(porcentagem/100);

        return preco+imposto;
    }
}
