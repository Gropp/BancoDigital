package dio.gropp;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ContaCorrente extends Conta {
    //como na classe Conta pusemos cliente como argumento para criar uma conta, precisamos de um construtor que referencie esse argumento, que é descrito na classe pai, por isso o super
    public ContaCorrente(Cliente cliente, String tipo){
        super(cliente, tipo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** EXTRATO CONTA CORRENTE ***");
        super.imprimirSaldos();
    }
}
