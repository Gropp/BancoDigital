package dio.gropp;

public class Cliente {

    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    protected void imprimirClientes() {
        System.out.println("-------------------------------------------");
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Sobrenome: %s", this.sobrenome));
        System.out.println(String.format("idade: %d", this.idade));
        System.out.println("-------------------------------------------");
    }
}
