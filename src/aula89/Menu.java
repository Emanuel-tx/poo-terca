package aula89;
import java.util.ArrayList;
public class Menu {
    public void entrarMenu(){

        int opcao;
        do {
            IO.println("1: adicionar\n2: remover\n3: editar\n4: listar \n0: sair");
            opcao = Integer.parseInt(IO.readln());
            switch (opcao){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }
        }while(opcao != 0);
    }
    public void adicionarContato(ArrayList<Contato> contatos){
        String nome = IO.readln("digite o nome: ");
        String email = IO.readln("digite o email: ");
        Contato contato = new Contato(nome, email);
        contatos.add(contato);
    }

    public void menuTelefones(Contato contato){
        int opcao;
        do {
            IO.println("1: adicionar\n2: remover\n3: editar\n4: listar \n0: sair");
            opcao = Integer.parseInt(IO.readln());
            switch (opcao){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }
        }while(opcao != 0);
    }
    public void adicionarTelefones(Contato contato){
        Integer codigo = Integer.parseInt(IO.readln("digite o codigo: "));
        String numero = IO.readln("digite o numero: ");
        String descricao = IO.readln("digite a descricao: ");
        Telefone telefone = new Telefone(codigo, numero, descricao);
        contatos.add();
    }
}


