public class Depositar {
    public static void main(String[] args) {
        Conta conta = new Conta(1000); // Saldo inicial de R$ 1000
        conta.depositar(500); // Depositar R$ 500
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
