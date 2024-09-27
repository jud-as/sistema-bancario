import java.util.ArrayList;
import java.util.List;

public class Loja extends Entidade {

    private static final String cpf = "N/A";

    public Loja(String nome, String email, String cnpj) {
        super(nome, email, cpf);
        this.cnpj = cnpj;
    }
    private List<Funcionario> funcionarios;
    private String cnpj;

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
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
