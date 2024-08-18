# Simulação de Conta Bancária

Este projeto simula operações básicas de conta bancária, como consultar saldo, depositar dinheiro e sacar dinheiro usando Java.

## Classes

### 1. `Conta`
Esta classe representa uma conta bancária com as seguintes funcionalidades:
- **Construtor**: Inicializa a conta com um saldo inicial.
- **Métodos**:
  - `depositar(double valor)`: Deposita um valor especificado na conta.
  - `sacar(double valor)`: Saca um valor especificado da conta, se houver saldo suficiente.
  - `consultarSaldo()`: Retorna o saldo atual da conta.

### 2. `ConsultarSaldo`
Esta classe contém o método `main` para consultar o saldo de uma conta inicializada com um saldo de R$ 1000.

### 3. `Depositar`
Esta classe contém o método `main` para depositar R$ 500 em uma conta inicializada com um saldo de R$ 1000 e, em seguida, consultar o saldo.

### 4. `Sacar`
Esta classe contém o método `main` para sacar R$ 200 de uma conta inicializada com um saldo de R$ 1000 e, em seguida, consultar o saldo.
