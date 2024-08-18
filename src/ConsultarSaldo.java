public class ConsultarSaldo {
    public static void main(String[] args) {
        Conta conta = new Conta(1000); // Saldo inicial de R$ 1000
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
