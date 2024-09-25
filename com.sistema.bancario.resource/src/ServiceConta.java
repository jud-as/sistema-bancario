import java.util.ArrayList;

public class ServiceConta {

    public static Conta criarContaCliente(Cliente cliente) {
        Conta conta = new Conta(cliente);
        conta.setSaldo(2000);
        conta.setTipoConta("Conta-Corrente.");
        return conta;
    }

    public static ArrayList<Conta> criarContasFuncionario(Funcionario funcionario) {
        Conta contaCorrente = new Conta(funcionario);
        Conta contaInvestimentos = new Conta(funcionario);
        contaCorrente.setTipoConta("Conta-Corrente");
        contaInvestimentos.setTipoConta("Conta-Investimentos");
        return new ArrayList<>() {{
            add(contaCorrente);
            add(contaInvestimentos);
        }};
    }

    public static Conta criarContaLoja(Entidade loja) {
        Conta contaComercial = new Conta(loja);
        contaComercial.setTipoConta("Conta-Comercial");
        return contaComercial;
    }

    public static Conta buscarConta(ArrayList<Conta> listaContas, int numeroConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
