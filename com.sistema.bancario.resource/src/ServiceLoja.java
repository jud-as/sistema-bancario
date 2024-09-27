import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceLoja {

    public static void pagarFuncionarios(Conta contaComercial, List<Funcionario> funcionarios) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario != null) {

                if(contaComercial.getSaldo() >= 1400) {
                    Conta contaCorrenteFuncionario = ServiceConta.buscarConta(Main.listaContas, funcionario.getNumeroConta()[0]);
                    Conta contaInvestimentosFuncionario = ServiceConta.buscarConta(Main.listaContas, funcionario.getNumeroConta()[1]);

                    contaCorrenteFuncionario.setSaldo(contaCorrenteFuncionario.getSaldo() + 1400);
                    contaComercial.setSaldo(contaComercial.getSaldo() - 1400);
                    System.out.println("Pagamento de R$1400,00 realizado para o funcionário " + funcionario.getNome());

                    double valorInvestimento = 1400 * 0.2;
                    contaInvestimentosFuncionario.setSaldo(contaInvestimentosFuncionario.getSaldo() + valorInvestimento);
                    contaCorrenteFuncionario.setSaldo(contaCorrenteFuncionario.getSaldo() - valorInvestimento);
                    System.out.println("Transferência de R$" + valorInvestimento + " para a conta de investimentos do funcionário " + funcionario.getNome());
                }
                else{
                    break;
                }

            }
        }
    }
}