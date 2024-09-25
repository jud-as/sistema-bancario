import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Conta> listaContas = new ArrayList<>();

        int aux = 0;

        for(Cliente cliente : DataLists.getListaClientes()) {
            listaContas.add(ServiceConta.criarContaCliente(cliente));
            System.out.println(cliente);
        }
        for(Funcionario funcionario : DataLists.getListaFuncionarios()) {
            listaContas.addAll(ServiceConta.criarContasFuncionario(funcionario));
        }

        for(Loja loja : DataLists.getListaLojas()) {
            listaContas.add(ServiceConta.criarContaLoja(loja));
            loja.setFuncionarios(DataLists.getListaFuncionarios().subList(aux, aux + 2));
            aux += 2;
        }
        for (Loja loja : DataLists.getListaLojas()) {
            System.out.println(loja.getFuncionarios());
        }
        for (Conta conta : listaContas) {
            System.out.println(conta);
        }

        ServicePagamento.realizarTransferencia(listaContas.get(3), listaContas.get(18), Util.gerarValorAleatorio(200, 500));
        ServicePagamento.realizarTransferencia(listaContas.get(8), listaContas.get(19), Util.gerarValorAleatorio(200, 500));

        System.out.println(Util.doubleToString(listaContas.get(3).getSaldo()));
        System.out.println(Util.doubleToString(listaContas.get(18).getSaldo()));
        System.out.println(Util.doubleToString(listaContas.get(8).getSaldo()));
        System.out.println(Util.doubleToString(listaContas.get(19).getSaldo()));


    }
}
