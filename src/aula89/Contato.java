package aula89;

public class Contato {
    private String nome;
    private String email;
    private ArrayList<Telefone> numeros = new ArrayList<>();

    public Contato() {
    }

    public Contato(String nome, String email, ArrayList<Telefone> numeros) {
        this.nome = nome;
        this.email = email;
        this.numeros = numeros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Telefone> numeros) {
        this.numeros = numeros;
    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
