public class Banco {

    public synchronized void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.getSaldo() >= valor) {

                // Transferência Genérica
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);

                // Condição para pagamento de Loja -> Funcionários
                if (contaDestino.getTipoConta().equals("Conta-Comercial")) { // Verificação ocorre sempre que uma conta comercial recebe saldo.
                    Loja loja = (Loja) contaDestino.getEntidade();
                    ServiceLoja.pagarFuncionarios(contaDestino, loja.getFuncionarios());
                }
                System.out.println("Transferência realizada da conta " + contaOrigem.getNumeroConta() + " para a conta " + contaDestino.getNumeroConta() + " no valor de " + Util.doubleToString(valor));
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}