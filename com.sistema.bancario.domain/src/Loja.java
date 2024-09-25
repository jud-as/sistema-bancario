import java.util.ArrayList;

public class Loja extends Entidade {

    private static final String cpf = "N/A";

    public Loja(String nome, String email, String cnpj) {
        super(nome, email, cpf);
        this.cnpj = cnpj;
    }
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private String cnpj;

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncnpj: " + cnpj + "\nFuncionarios: " + funcionarios;
    }
}
