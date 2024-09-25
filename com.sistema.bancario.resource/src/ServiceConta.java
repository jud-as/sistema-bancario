


public class ServiceConta {

    public Conta criarContaCliente(Cliente cliente) {
        Conta conta = new Conta(cliente);
        conta.setSaldo(2000);
        System.out.println("Conta criada com sucesso!");
        return conta;
    }

}
