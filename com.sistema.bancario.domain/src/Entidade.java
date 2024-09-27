public class Entidade {

    private String nome;
    private String email;
    private String cpf;
    private int[] numeroConta = new int[3]; //  Todas as entidades possuem 3 contas:
    //"Conta-Corrente", "Conta-Investimentos" e "Conta-Comercial", respectivamente.

    public Entidade(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int[] getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int[] numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + "\nemail: " + email + "\ncpf: " + cpf;
    }
}
