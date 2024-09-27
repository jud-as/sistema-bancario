import java.util.Objects;

public class ServicePagamento {

    public static void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.getSaldo() >= valor) {

                // Transferência Genérica
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);

                // Condição para pagamento de Loja -> Funcionários
                if (contaDestino.getTipoConta().equals("Conta-Comercial")) {
                    ServiceLoja.pagarFuncionarios((Loja) contaDestino.getEntidade());
                }

            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}