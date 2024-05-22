public class ContaCorrente extends Conta {
    private static final double TAXA_OPERACAO = 0.10;

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_OPERACAO;
        super.sacar(valorComTaxa);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        double valorComTaxa = valor + TAXA_OPERACAO;
        super.transferir(contaDestino, valorComTaxa);
    }
}
