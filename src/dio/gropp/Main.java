package dio.gropp;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fernando");
        cliente.setSobrenome("Gropp");
        cliente.setIdade(49);
        cliente.imprimirClientes();
        //instancia o objeto ContaCorrente
        //o construtor desse objeto ja gera uma agencia e uma contacorrente
        Conta cc = new ContaCorrente(cliente, "CC");
        Conta poupanca = new ContaPoupanca(cliente, "Poupança");

        cc.depositar(100);
        poupanca.depositar(500);
        cc.transferir(100, poupanca);
        poupanca.sacar(250);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
