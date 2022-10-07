package Funcionario;

public class Principal {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        Gerente g01 = new Gerente("Raquel minha dona", 11111, 10000);
        Vendedor v01 = new Vendedor("Vinicius Silva", 22222, 20000, 10);
        Assistente a01 = new Assistente("Jeine de Souza", 33333, 5000);

        gerenciador.AddFuncionario(g01);
        gerenciador.AddFuncionario(v01);
        gerenciador.AddFuncionario(a01);
        
        System.out.println("\nTestando funções 'AddFuncionario' e 'imprimirFuncionario':");
        System.out.println(gerenciador.imprimirFuncionario(11));

        System.out.println("\nTestando funções 'folhaSalarial', 'imprimirTodos' e 'RemoverFuncionario':");
        gerenciador.imprimirTodos();
        System.out.println(gerenciador.folhaSalarial());
        gerenciador.removerFuncionario(22222);
        gerenciador.imprimirTodos();
            
    }
}
