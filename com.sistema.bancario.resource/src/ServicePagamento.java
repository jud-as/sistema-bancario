public class ServicePagamento {

    public static void realizarTransferencia(Conta contaOrigem, Conta contaDestino,  double valor){
        if(contaOrigem  != null || contaDestino != null){
            assert contaOrigem != null;
            if(contaOrigem.getSaldo() >= valor) {
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);
                System.out.println("Transferência realizada com sucesso!");
            }else{
                System.out.println("Saldo insuficiente!");
                return;
            }

        }else{
            System.out.println("Conta de origem não encontrada.");
            return;
        }

    }


}
