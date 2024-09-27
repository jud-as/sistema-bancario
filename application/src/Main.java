import javax.xml.crypto.Data;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //  Variável estática global para armazenar contas criadas em tempo de execução.
    public static ArrayList<Conta> listaContas = new ArrayList<>();

    public static void main(String[] args) {

        //  Declaração de variáveis e listas auxiliares.
        int aux = 0;
        Conta contaCorrente;
        Conta contaInvestimentos;
        Conta contaComercial;

        try {
            for(Cliente cliente : DataLists.getListaClientes()) { // Criação de contas para clientes, Associação de numero de conta.
                contaCorrente = ServiceConta.criarContaCliente(cliente);
                cliente.setNumeroConta(new int[]{contaCorrente.getNumeroConta(), 0, 0});
                listaContas.add(contaCorrente);
            }
            for(Funcionario funcionario : DataLists.getListaFuncionarios()) { // Criação de contas para funcionários, Associação de numero de conta.

                contaCorrente = ServiceConta.criarContasFuncionario(funcionario).getFirst();
                contaInvestimentos = ServiceConta.criarContasFuncionario(funcionario).getLast();
                funcionario.setNumeroConta(new int[]{contaCorrente.getNumeroConta(), contaInvestimentos.getNumeroConta(), 0});
                listaContas.add(contaCorrente);
                listaContas.add(contaInvestimentos);
            }
            for(Loja loja : DataLists.getListaLojas()) { // Criação de contas para lojas, Associação de numero de conta.
                contaComercial = ServiceConta.criarContaLoja(loja);
                loja.setFuncionarios(DataLists.getListaFuncionarios().subList(aux, aux + 2)); // Associação de funcionários a loja usando sublistas.
                aux += 2;
                loja.setNumeroConta(new int[]{0, 0, contaComercial.getNumeroConta()});
                listaContas.add(contaComercial);
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar contas.");
        }

        // Transferências de valores aleatórios entre contas de clientes e lojas.
        int i = 0;
        for (Cliente cliente : DataLists.getListaClientes()) {
            ServicePagamento.realizarTransferencia(ServiceConta.buscarConta(listaContas, cliente.getNumeroConta()[0]), ServiceConta.buscarConta(listaContas, 27), Util.gerarValorAleatorio(200, 500));
            ServicePagamento.realizarTransferencia(ServiceConta.buscarConta(listaContas, cliente.getNumeroConta()[0]), ServiceConta.buscarConta(listaContas, 28), Util.gerarValorAleatorio(200, 500));
        }


        // Método para printar contas na tela:

        for (Conta conta : listaContas) {
            System.out.println(conta.toString());
        }


    }

}
