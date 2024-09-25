import java.util.ArrayList;

public class ServiceConta {

    public static Conta criarContaCliente(Cliente cliente) {
        Conta conta = new Conta(cliente);
        conta.setSaldo(2000);
        conta.setTipoConta("Conta-Corrente.");
        System.out.println("Conta criada com sucesso!");
        return conta;
    }

    public static ArrayList<Conta> criarContasFuncionario(Funcionario funcionario) {

        Conta contaCorrente = new Conta(funcionario);
        Conta contaInvestimentos = new Conta(funcionario);
        contaCorrente.setTipoConta("Conta-Corrente");
        contaInvestimentos.setTipoConta("Conta-Investimentos");
        System.out.println("Contas criadas com sucesso!");
        return new ArrayList<>() {{
            add(contaCorrente);
            add(contaInvestimentos);
        }};
    }

    public static Conta criarContaLoja(Entidade loja) {

        Conta contaComercial = new Conta(loja);
        contaComercial.setTipoConta("Conta-Comercial");
        System.out.println("Conta criada com sucesso!");

        return contaComercial;
    }


}
