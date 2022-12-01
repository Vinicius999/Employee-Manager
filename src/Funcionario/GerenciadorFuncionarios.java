package Funcionario;

import java.util.ArrayList;

public class GerenciadorFuncionarios {

    ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

    public void AddFuncionario(Funcionario f) {
        for (Funcionario funcionario: lista) {
            if (f.getMatricula() == funcionario.getMatricula()) {
                System.out.println("Matrícula já existente.");
                break;
            }
        }
        lista.add(f);
    }

    public void removerFuncionario(int matricula) {
        for (Funcionario f: lista) {
            if (matricula == f.getMatricula()) {
                lista.remove(f);
                return;
            }
        }
        System.out.println("Funcionario não encontrado");
    }

    public Funcionario imprimirFuncionario(int matricula) {
        for (Funcionario f: lista) {
            if (matricula == f.getMatricula()) {
                return f;
            }
        }
        return null; 
    }

    public void imprimirTodos() {
        for (Funcionario f: lista) {
            System.out.println(f);
        }
    }

    public double folhaSalarial() {
        double sum = 0;
        for (Funcionario f: lista) {
            sum += f.calculaSalario();
        }

        return sum;
    }

}
