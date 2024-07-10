package entities;

public interface ContaInterface {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaInterface contaDestino);

    void imprimirExtrato();

}
