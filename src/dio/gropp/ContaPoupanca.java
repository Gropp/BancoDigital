package dio.gropp;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, String tipo){
        super(cliente, tipo);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("*** EXTRATO CONTA POUPANCA ***");
        super.imprimirSaldos();
    }
}
