public class Contatos {
    private String nome;
    private String telefone;
    private String email;

    //Construtor:
    public Contatos(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //Getters & Setters:
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "=== Nome: " + nome +
                "\nNº Telefone: " + telefone +
                "\nE-mail: " + email;
    }
}
