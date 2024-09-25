public class Funcionario extends Entidade{


    public Funcionario(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }
    private final static double salario = 1400;

    public static double getSalario() {
        return salario;
    }



}
