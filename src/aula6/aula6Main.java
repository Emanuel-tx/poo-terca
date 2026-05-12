
import aula6.Cliente;

void main(){
    ArrayList<Cliente> clientDatabase = new ArrayList<>();
    Boolean rodando = true;
    while (rodando){
        System.out.println("0:Sair do programa \n1:Registrar um cliente \n2:Listar clientes \n3:Remover um cliente \n4:Editar dados de um cliente");
        Integer opcao = Integer.parseInt(IO.readln("O que deseja fazer? "));

        switch (opcao){
            case 0:
                rodando = false;
                break;
            case 1:
                salvarCliente(clientDatabase);
                break;
            case 2:
                listarClientes(clientDatabase);
                break;
            case 3:
                removerCliente(clientDatabase);
                break;
            case 4:
                editarCliente(clientDatabase);
                break;
            default:
                System.out.println("ERRO: digite uma opcao valida");
                break;
        }
    }
}


public void salvarCliente(ArrayList<Cliente> clientes){
    String nome = IO.readln("digite o nome:");
    String cpf = IO.readln("digite o cpf:");
    Float saldo = 0f;
    Cliente cliente = new Cliente(nome, cpf, saldo);
    clientes.add(cliente);

}
public void listarClientes(ArrayList<Cliente> client){
    for (int i = 0;i<client.size();i++){
        System.out.println(client.get(i));
    }
}
public void removerCliente(ArrayList<Cliente> clientes){
    String cpfPedido = IO.readln("Digite o CPF do cliente que deseja remover da lista:");
    for (int i = 0; i < clientes.size(); i++) {
        Cliente client = clientes.get(i);
        String cpfClient = client.getCpf();
        String clientName = client.getNome();
        if (cpfClient.equals(cpfPedido)){
            System.out.printf("Deseja deletar o cliente %s? (digite 1 se sim)", clientName);
            int simNao = Integer.parseInt(IO.readln());
            if (simNao == 1){
               clientes.remove(i);
                System.out.printf("Cliente %s deletado com sucesso \n", clientName);
                return;
            }
        }
    }
    System.out.println("Cliente nao encontrado \n");
}
public void editarCliente(ArrayList<Cliente> clientes){
    String cpfPedido = IO.readln("Digite o CPF do cliente que deseja editar o registro:");
    for (int i = 0; i < clientes.size(); i++) {
        Cliente client = clientes.get(i);
        String cpfClient = client.getCpf();
        if (cpfClient.equals(cpfPedido)){
            System.out.println(client);
            System.out.println("1: Editar CPF\n2:Editar nome\nQualquer outro numero: Cancelar edicao");
            int opcao = Integer.parseInt(IO.readln("O que deseja editar?"));
            switch(opcao){
                case 1:
                    String cpfNovo = IO.readln("Digite o novo CPF: ");
                    client.setCpf(cpfNovo);
                    System.out.println("Cliente editado com sucesso");

                    break;
                case 2:
                    String nomeNovo = IO.readln("Digite o novo nome: ");
                    client.setNome(nomeNovo);
                    System.out.println("Cliente editado com sucesso");
                    break;
                default:
                    System.out.println("Edicao cancelada");
                    break;
            }
            return;
        }
    }
    System.out.println("Cliente nao encontrado");
}