import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        for(Cliente cliente : DataLists.getListaClientes()) {
            ServiceConta.criarContaCliente(cliente);
            System.out.println(cliente);
        }
        for(Funcionario funcionario : DataLists.getListaFuncionarios()) {
            ServiceConta.criarContasFuncionario(funcionario);
            System.out.println(funcionario);
        }
        for(Loja loja : DataLists.getListaLojas()) {
            ServiceConta.criarContaLoja(loja);
            System.out.println(loja);
        }



    }
}
