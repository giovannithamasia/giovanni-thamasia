package exerciciosmanutencao.ex4;

public class Produto {

    private String nomeProduto;
    private double precoUnitario;

    public Produto(String nomeProduto, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


}
