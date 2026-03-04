package exerciciosmanutencao.ex4;

public class Resumo {

    public void imprimirResumo(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente().getNomeCliente());
        System.out.println("Email: " + pedido.getCliente().getEmailCliente());
        System.out.println("Produto: " + pedido.getProduto().getNomeProduto());
        System.out.println("Preço unitário: " + pedido.getProduto().getPrecoUnitario());
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Total: " + pedido.calcularTotal());
    }
}
