import java.util.ArrayList;

public class DataLists {

    private static ArrayList<Cliente> listaClientes = new ArrayList<>(){{
        add(new Cliente("Gabriel", "gabriel2004@gmail.com", "49279173912"));
        add(new Cliente("Cecilia", "ceciliagames@gmail.com", "89062974720"));
        add(new Cliente("Lucas", "luk4soficial@outlook.com", "12792834390"));
        add(new Cliente("Eduardo", "dudupandinha@hotmail.com", "05729184350"));
        add(new Cliente("Ramiro", "ramiroadvogado@gmail.com", "90467812145"));
        add(new Cliente("Leticia", "leticiabunny@gmail.com", "98704172315"));
        add(new Cliente("Manoela", "manu082@hotmail.com", "67512810127"));
        add(new Cliente("Jose", "josegodofredo1972@hotmail.com", "05172944605"));
        add(new Cliente("Zulmira", "zulmiracozinha@gmail.com", "01297055103"));
        add(new Cliente("Pedro", "saturnolocal@gmail.com", "78945612390"));

    }};

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>(){{
        add(new Funcionario("Joao", "joao.sampaio.f@banco.com.br", "79150991475"));
        add(new Funcionario("Maria", "maria.fonseca.f@banco.com.br", "07252413115"));
        add(new Funcionario("Juliana", "juliana.correia.f@banco.com.br", "76152912150"));
        add(new Funcionario("Henrique", "henrique.vidal.f@banco.com.br", "99112947170"));
    }};

    private static ArrayList<Loja> listaLojas = new ArrayList<>(){{
        add(new Loja("HeyListen", "site@heylisten.com.br", "2345678000190"));
        add(new Loja("Livraria Cultura & Saber", "atendimento@culturaesaber.com.br", "98765432000112"));
    }};

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void setListaClientes(ArrayList<Cliente> listaClientes) {
        DataLists.listaClientes = listaClientes;
    }

    public static ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        DataLists.listaFuncionarios = listaFuncionarios;
    }

    public static ArrayList<Loja> getListaLojas() {
        return listaLojas;
    }

    public static void setListaLojas(ArrayList<Loja> listaLojas) {
        DataLists.listaLojas = listaLojas;
    }


}
