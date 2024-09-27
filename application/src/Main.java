import java.util.ArrayList;

public class Main {

    public static ArrayList<Conta> listaContas = new ArrayList<>();

    public static void main(String[] args) {

        int aux = 0;
        Conta contaCorrente;
        Conta contaInvestimentos;
        Conta contaComercial;

        try {
            for (Cliente cliente : DataLists.getListaClientes()) {
                contaCorrente = ServiceConta.criarContaCliente(cliente);
                cliente.setNumeroConta(new int[]{contaCorrente.getNumeroConta(), 0, 0});
                listaContas.add(contaCorrente);
                System.out.println("Conta criada para cliente: " + cliente.getNome() + " - Conta: " + contaCorrente.getNumeroConta());
            }
            for (Funcionario funcionario : DataLists.getListaFuncionarios()) {
                ArrayList<Conta> contasFuncionario = ServiceConta.criarContasFuncionario(funcionario);
                contaCorrente = contasFuncionario.get(0);
                contaInvestimentos = contasFuncionario.get(1);
                funcionario.setNumeroConta(new int[]{contaCorrente.getNumeroConta(), contaInvestimentos.getNumeroConta(), 0});
                listaContas.add(contaCorrente);
                listaContas.add(contaInvestimentos);
                System.out.println("Contas criadas para funcionário: " + funcionario.getNome() + " - Conta Corrente: " + contaCorrente.getNumeroConta() + ", Conta Investimentos: " + contaInvestimentos.getNumeroConta());
            }
            for (Loja loja : DataLists.getListaLojas()) {
                contaComercial = ServiceConta.criarContaLoja(loja);
                loja.setFuncionarios(DataLists.getListaFuncionarios().subList(aux, aux + 2));
                aux += 2;
                loja.setNumeroConta(new int[]{0, 0, contaComercial.getNumeroConta()});
                listaContas.add(contaComercial);
                System.out.println("Conta criada para loja: " + loja.getNome() + " - Conta Comercial: " + contaComercial.getNumeroConta());
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar contas.");
            e.printStackTrace();
        }

        // Criar e iniciar uma Thread para cada cliente
        ArrayList<Thread> threads = new ArrayList<>();
        for (Cliente cliente : DataLists.getListaClientes()) {
            Thread thread = new Thread(new ClienteProcessor(cliente, listaContas));
            threads.add(thread);
            thread.start();
        }

        // Aguardar todas as Threads terminarem
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Método para printar contas na tela:
        for (Conta conta : listaContas) {
            System.out.println(conta.toString());
        }

        for (Loja loja : DataLists.getListaLojas()) {
            for (Funcionario funcionario : loja.getFuncionarios()) {
                System.out.println(funcionario.toString());
            }
        }
    }
}