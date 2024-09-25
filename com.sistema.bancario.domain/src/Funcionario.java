public class Funcionario {

    String nome;
    int cpf;
    Conta contaCorrente;
    Conta contaInvestimento;


    public Funcionario(String nome, int cpf, Conta contaCorrente, Conta contaInvestimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaCorrente = contaCorrente;
        this.contaInvestimento = contaInvestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Conta getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(Conta contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }
}
