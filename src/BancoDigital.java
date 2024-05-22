public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva");
        ContaCorrente cc = new ContaCorrente("12345-6");
        ContaPoupanca cp = new ContaPoupanca("78910-1", 0.05);

        cliente1.adicionarConta(cc);
        cliente1.adicionarConta(cp);

        cc.depositar(1000);
        cp.depositar(500);

        cc.sacar(100);
        cp.aplicarJuros();

        cc.transferir(cp, 200);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}
