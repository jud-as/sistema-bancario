public class Conta {

    private static int contadorDeContas = 1;
    private int numeroConta;
    private double saldo = 0;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = contadorDeContas;
        this.cliente = cliente;
        contadorDeContas++;
    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nConta: " + numeroConta + "\nSaldo: " + saldo + "\nCliente: " + this.cliente.getNome();
    }
}
