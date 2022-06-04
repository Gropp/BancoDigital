package dio.gropp;
//uma classe abstrata nao pode ser instanciada
//com isso garantimos que somente os herdeiros alterem suas propriedades
public abstract class Conta implements IConta {

    //criar uma constante com o numero da agencia
    //protected protege porem é enxergado nas classes filhas
    //privado somente a propria classe enxerga
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //encapsulando o acesso as propriedades
    //agencia e numero so devem ser alterados durante a criacao, por isso os setters devem ser cuidadosamente
    //vamos usar o protected para poder acessar essas propriedades na classe filha
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipo;

    //metodo dentro da classe base para inserir a agencia e a conta automaticamente
    public Conta(Cliente cliente, String tipo) {
        //quando chamar esse metodo, já cria uma agencia e conta padroes e relaciona o cliente
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    //metodo para acesso dos filhos para imprimir saldos
    protected void imprimirSaldos() {
        System.out.println(String.format("Cliente: %s %s", this.cliente.getNome(), this.cliente.getSobrenome()));
        System.out.println(String.format("Tipo: %s", this.tipo));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("-------------------------------------------");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    //chamada dos metodos existentes na inteface IConta
    @Override
    public void sacar(double valor) {

        //subtrai do saldo o valor retirado
        saldo -= valor;
        System.out.println(">>> SAQUE <<<");
        System.out.println(String.format("valor sacado: %.2f", valor));
        imprimirSaldos();
    }

    @Override
    public void depositar(double valor) {

        //adiciona ao saldo o valor depositado
        saldo += valor;
        System.out.println(">>> DEPOSITO <<<");
        System.out.println(String.format("valor depositado: %.2f", valor));
        imprimirSaldos();
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        //chama a funcao sacar para diminuir o valor do saldo
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println(">>> TRANSFERENCIAS <<<");
        System.out.println(String.format("valor transferido: %.2f", valor));
        imprimirSaldos();
    }
}
