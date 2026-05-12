package aula1011;
import java.util.ArrayList;

public class Menu {
    public void inicio(){
        System.out.println("1 adicionar");
        System.out.println("2 remover");
        System.out.println("3 editar");
        System.out.println("4 listar");
        System.out.println("0 sair");

        Integer opcao = Integer.parseInt(IO.readln("digite uma opcao: "));
        switch (opcao){
            case 1:
                this.adicionarCliente();
                break;
            case 2:
                this.removerCliente();
                break;
            case 3:
//                this.editarCliente();
                break;
            case 4:
                this.listarClientes();
                break;
            case 0:
                break;
            default:

        }
    }
    public void listarClientes(ArrayList<Cliente> clientes){
        for (int i = 0; i < ; i++) {
            System.out.println("indice:" + i);
            System.out.println(clientes.get(i).toString());
        }
    }
    public void adicionarCliente(){
        String nome = IO.readln("escreva o nome: ");
        String cpf = IO.readln("escreva o cpf: ");
        String dtNasc = IO.readln("escreva a data de nascimento");
        do {
            Integer adicionarEndereco = Integer.parseInt(IO.readln("deseja adicionar mais um endereco? (1 se sim)"));
            
        }while(adicionarEndereco == 1);
    }

    public void removerCliente(){
        System.out.println("");

    }

}
