public class Funcionario extends Entidade implements Comparable<Funcionario> {

    public Funcionario(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }


    @Override
    public int compareTo(Funcionario other) {
        return this.getCpf().compareTo(other.getCpf());
    }
}
