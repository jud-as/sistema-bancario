public class ServicePagamento {

    private static Banco banco = new Banco();

    public static void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        banco.realizarTransferencia(contaOrigem, contaDestino, valor);
    }
}