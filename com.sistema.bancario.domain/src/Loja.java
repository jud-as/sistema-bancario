import java.util.ArrayList;

public class Loja {
    int cnpj;
    Conta contaLoja;
    ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public Loja(ArrayList<Funcionario> listaFuncionarios, Conta contaLoja, int cnpj) {
        this.listaFuncionarios = listaFuncionarios;
        this.contaLoja = contaLoja;
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Conta getContaLoja() {
        return contaLoja;
    }

    public void setContaLoja(Conta contaLoja) {
        this.contaLoja = contaLoja;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
}
