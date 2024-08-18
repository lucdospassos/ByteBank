public class Sacar {
    public static void main(String[] args) {
        Conta conta = new Conta(1000); // Saldo inicial de R$ 1000
        conta.sacar(200); // Sacar R$ 200
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
