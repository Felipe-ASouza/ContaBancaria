public class Conta {
    String titular;
    int conta;
    String agencia;
    double saldo;


    public Conta(String titular, int conta, String agencia, double saldo) {
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;


    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double sacar) {
        if (sacar > saldo){
            System.out.println("Você não tem saldo suficiente, seu saldo é de: " + saldo);
            return;
        }
        if (sacar > 0){
            saldo = saldo - sacar;
            System.out.println("O saque foi realizado com sucesso, seu novo saldo é: " + saldo);
            return;
        }
        System.out.println("A conta não foi movimentada.");
    }
    public void depositar(double deposito){
        if (deposito > 0 ){
            System.out.println("Seu deposito no valor de: " + deposito + " foi realizado com sucesso.");
            saldo += deposito;
            return;
        }
        System.out.println("O valor dos depositos não podem ser inferiores a 0.");
    }
    public void rendimentoMensal(){
        if (saldo > 0){
            double calc = (1.0024 * saldo);
            saldo += calc;
            System.out.println("O rendimento desse mês foi 0.24%, saldo atual: " + saldo);
        }
    }


}
