package jeronimo.com;

import java.util.Calendar;

public class ContaPoupanca extends Conta {

    private int diaRedimento;

    public int getDiaRedimento() {
        return diaRedimento;
    }

    public void setDiaRedimento(int diaRedimento) {
        this.diaRedimento = diaRedimento;
    }

    @Override
    public String toString() {
        return "ContaPoupança{" +
                "rendimento='" + getDiaRedimento() + '\'' +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", saldo=" + getSaldo() +
                ", numeroConta='" + getNumeroConta() + '\'' +
                '}';
    }

    public boolean calculoRendimento(double taxaRendimento) {
        Calendar calendar = Calendar.getInstance();

        if(diaRedimento == calendar.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
            return true;
        }else{
            return false;
        }
        }
    }
