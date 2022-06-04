package dio.gropp;
//classe abstrata com todos os metodos abstratos
//TUDO NA INTERFACE É PUBLICO ENTAO NAO PRECISA POR PUBLIC NOS METODOS
//A INTERFACE NAO DEIXA COLOCAR CORPO NO METODO É SÓ REFERENCIA
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    //polimorfismo - Conta pode ser conta fisica ou conta juridica
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
