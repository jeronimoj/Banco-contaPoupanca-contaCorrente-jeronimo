package jeronimo.com;

public class Conta {

    private String nomeCliente;
    private double saldo;
    private  String numeroConta;



    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferencia(Conta cont2, double valor){

        if(this.saldo>= valor){
            this.sacar(valor);
            cont2.depositar(valor);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                ", numeroConta='" + numeroConta + '\'' +
                '}';
    }
}
