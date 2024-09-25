import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Conta> listaContas = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Conta conta = new ServiceConta().criarContaCliente(new Cliente("Cliente " + i, 1234, 123456789));
            listaContas.add(conta);
            listaClientes.add(conta.getCliente());
        }

        System.out.println("Lista de Clientes: ");
        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }
        System.out.println("\nLista de Contas: ");
        for(Conta conta : listaContas){
            System.out.println(conta);
        }



    }
}
