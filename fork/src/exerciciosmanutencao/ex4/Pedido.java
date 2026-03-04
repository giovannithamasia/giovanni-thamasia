package exerciciosmanutencao.ex4;


/**
 * 4)
 *
 * Múltiplas responsabilidades na mesma classe.
 *
 * A classe Pedido cuida de:
 *
 * Dados do cliente (nome, email).
 *
 * Dados do produto (nome, preço).
 *
 * Lógica de cálculo (total do pedido).
 *
 * Apresentação (impressão no console).
 *
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 *
 *
 * Os atributos não pertencem todos ao mesmo “conceito”:
 *
 * Cliente ≠ Produto ≠ Pedido.
 *
 * Alterações em cliente ou produto impactam diretamente o pedido.
 *
 *
 * Não é possível reutilizar Cliente ou Produto em outro contexto.
 *
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.
 *
 * Um produto não pode ser compartilhado entre pedidos.
 *
 */
public class Pedido {

    private Produto produto;
    private Cliente cliente;
    private int quantidade;

    public Pedido(Produto produto, Cliente cliente,int quantidade) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPrecoUnitario() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args){
        Cliente cl1 = new Cliente("Lima","lima@gmail.com");
        Produto prod1 = new Produto("Tinta",100);

        Resumo resumo = new Resumo();

        Pedido pedido = new Pedido(prod1,cl1,10);

        resumo.imprimirResumo(pedido);

    }
}
