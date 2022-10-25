import java.util.List;

public class Universidade {
    String nome;
    List<Funcionario> funcionarios;

    public Universidade(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    void adicionarFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    void gerarFolhaDePagamento() {
        for (Funcionario funcionario :  this.funcionarios) {
            funcionario.calcularSalario();
        }
    }


    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }



    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}