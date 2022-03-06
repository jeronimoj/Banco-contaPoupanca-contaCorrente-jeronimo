package jeronimo.com;

public class ContaCorrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "rendimento='" + getLimite() + '\'' +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", saldo=" + getSaldo() +
                ", numeroConta='" + getNumeroConta() + '\'' +
                '}';
    }
    public boolean sacar2(double valor){
        double saldoLimite = this.getSaldo() + limite;
        if((saldoLimite-valor)>=0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            return false;
        }

    }
}
