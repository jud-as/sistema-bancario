import java.util.PriorityQueue;
import java.util.Queue;

public class ServiceLoja {

    public static void pagarFuncionarios(Loja loja) {

        Queue<Funcionario> funcionarios = new PriorityQueue<>(); // Cria estutura de fila
        funcionarios.addAll(loja.getFuncionarios()); // Adiciona funcionários a fila
        Conta contaComercial = ServiceConta.buscarConta(Main.listaContas, loja.getNumeroConta()[2]);

        while (contaComercial.getSaldo() >= 1400 && !funcionarios.isEmpty()) {
            Funcionario funcionarioAuxiliar = funcionarios.poll();
            if (funcionarioAuxiliar != null) {
                // Busca das contas da loja e funcionários associados
                Conta contaCorrenteFuncionario = ServiceConta.buscarConta(Main.listaContas, funcionarioAuxiliar.getNumeroConta()[0]);
                Conta contaInvestimentosFuncionario = ServiceConta.buscarConta(Main.listaContas, funcionarioAuxiliar.getNumeroConta()[1]);

                // Pagamento de funcionários
                contaCorrenteFuncionario.setSaldo(contaCorrenteFuncionario.getSaldo() + 1400);
                contaComercial.setSaldo(contaComercial.getSaldo() - 1400);

                // Transferência de 20% do salário para conta de investimentos
                double valorInvestimento = 1400 * 0.2;
                contaInvestimentosFuncionario.setSaldo(contaInvestimentosFuncionario.getSaldo() + valorInvestimento);
                contaCorrenteFuncionario.setSaldo(contaCorrenteFuncionario.getSaldo() - valorInvestimento);

                // Recoloca o funcionário ao final da fila
                funcionarios.add(funcionarioAuxiliar);
            }
        }
    }
}