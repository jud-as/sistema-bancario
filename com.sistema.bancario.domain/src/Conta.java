public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private double saldo = 0;
    private Entidade entidade;
    private String tipoConta = "";

    public Conta(Entidade entidade) {
        this.numeroConta = contadorDeContas;
        this.entidade = entidade;
        contadorDeContas++;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "\nConta: " + numeroConta + "\nSaldo: " + Util.doubleToString(saldo) + "\nNome: " + this.entidade.getNome() + "\nTipo de Conta: " + tipoConta;
    }
}
