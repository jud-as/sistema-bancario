import java.util.ArrayList;

public class ClienteProcessor implements Runnable {
    private Cliente cliente;
    private ArrayList<Conta> listaContas;

    public ClienteProcessor(Cliente cliente, ArrayList<Conta> listaContas) {
        this.cliente = cliente;
        this.listaContas = listaContas;
    }

    @Override
    public void run() {
        Conta contaCliente = ServiceConta.buscarConta(listaContas, cliente.getNumeroConta()[0]);
        Conta contaLoja1 = ServiceConta.buscarConta(listaContas, 19); // Conta Comercial HeyListen
        Conta contaLoja2 = ServiceConta.buscarConta(listaContas, 20); // Conta Comercial Livraria Cultura & Saber

        if (contaCliente != null && contaLoja1 != null && contaLoja2 != null) {
            ServicePagamento.realizarTransferencia(contaCliente, contaLoja1, Util.gerarValorAleatorio(200, 500));
            ServicePagamento.realizarTransferencia(contaCliente, contaLoja2, Util.gerarValorAleatorio(200, 500));
        } else {
            System.out.println("Conta de origem ou destino não encontrada para cliente: " + cliente.getNome());
        }
    }
}