package Funcionario;

public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salario_base;

    public Funcionario(String nome, int matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    public abstract double calculaSalario();

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    // ToString
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", salario_base=" + salario_base + "]";
    }

    
}