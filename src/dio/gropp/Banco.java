package dio.gropp;

import java.util.List;

public class Banco {

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    private String nome;
    //o banco é composto por contas
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirLista() {
        contas.forEach(System.out::println);
    }
}
