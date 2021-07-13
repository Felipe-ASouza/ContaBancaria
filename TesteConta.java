public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta("Felipe Alexandre",2246,"004",200);
        conta.depositar(200);
        conta.sacar(20);
        conta.rendimentoMensal();
    }
}
