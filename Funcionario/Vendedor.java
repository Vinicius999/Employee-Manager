package Funcionario;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return comissao * getSalario_base();
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
