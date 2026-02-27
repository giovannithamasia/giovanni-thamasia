package exerciciosmanutencao.ex1;

public class CalcularDesconto implements Calculos{

    @Override
    public double calcular(double preco) {
        double porcentagem = 20;

        double desconto = preco* (porcentagem/100);
        return preco-desconto;
    }
}
