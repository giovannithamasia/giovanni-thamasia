package exerciciosmanutencao.ex2;

/**
 * 2)
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.
 *
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).
 *
 * Não há validação para valores negativos em depositar e sacar.
 *
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public void depositar(double valor) {
        if (valor<0){
            throw new IllegalArgumentException("Deposito invalido! Valor negativo");
        }

        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor>saldo){
            throw new IllegalArgumentException("Valor maior que o saldo disponivel");
        }

        if (valor<0){
            throw new IllegalArgumentException("Saque invalido! Valor negativo");
        }

        saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()){
            throw new IllegalArgumentException("Titular invalido");
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo<0){
            throw new IllegalArgumentException("Saldo negativo");
        }
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaBancaria b1 = new ContaBancaria("Paulo",100);

        b1.depositar(100);

        System.out.println(b1.getSaldo());
    }
}