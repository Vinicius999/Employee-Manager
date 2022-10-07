package Funcionario;

public class Principal {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        Gerente geren1 = new Gerente("nome01", 11, 1000);
        Assistente vende1  = new Assistente("nome02", 22, 1100);

        gerenciador.AddFuncionario(geren1);
        gerenciador.AddFuncionario(vende1);

        System.out.println(gerenciador.imprimirFuncionario(11));

        gerenciador.imprimirTodos();
            
    }
}
