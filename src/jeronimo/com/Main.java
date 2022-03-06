package jeronimo.com;

public class Main {
    public static void main(String[] args){
      /*Conta normal*/
        Conta conta = new Conta();
        Conta conta1 = new Conta();

        conta.setNomeCliente("Jerónimo Paulo Pinto");
        conta.setNumeroConta("000023454b0");
        conta.setSaldo(300);

        conta.depositar(200);

        if(conta.sacar(30)){
            System.out.println("Sacou com sucesso, novo saldo"+conta.getSaldo());
        }else{
            System.out.println("Sem sucesso,");

        }
        if(conta.transferencia(conta1, 200)){
            System.out.println("Transferencia feita com sucesso, novo saldo"+conta.getSaldo());
        }else{
            System.out.println("Transferencia sem sucesso,");

        }

        System.out.println(""+conta);

        /*Conta Corrente*/
        System.out.println("--------------Conta Corrente---------------");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumeroConta("234254354556");
        contaCorrente.setSaldo(200);
        contaCorrente.setLimite(300);

        if(contaCorrente.sacar(23.5)){
            System.out.println("Sacou com sucesso, novo saldo"+contaCorrente.getSaldo());
        }else{
            System.out.println("Sem sucesso,");
        }
        if(contaCorrente.sacar2(20)){
            System.out.println("Sacou com sucesso, novo saldo"+contaCorrente.getSaldo());
        }else{
            System.out.println("Sem sucesso, excedeu o limite");
        }
        contaCorrente.depositar(200.4);

        if(contaCorrente.transferencia(conta1, 200)){
            System.out.println("Transferencia feita com sucesso, novo saldo"+contaCorrente.getSaldo());
        }else{
            System.out.println("Transferencia sem sucesso,");
        }

        System.out.println(""+contaCorrente);

        /*Conta Poupança*/
        System.out.println("-----------Conta Poupança-------------");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Jerónimo Pinto");
        contaPoupanca.setNumeroConta("234254354556");
        contaPoupanca.setSaldo(400);
        contaPoupanca.setDiaRedimento(6);

        System.out.println( contaPoupanca.calculoRendimento(0.3));
        contaPoupanca.depositar(200.4);
        if(contaPoupanca.sacar(23.5)){
            System.out.println("Sacou com sucesso, novo saldo"+contaPoupanca.getSaldo());
        }else{
            System.out.println("Sem sucesso,");
        }
        if(contaPoupanca.transferencia(conta1, 200)){
            System.out.println("Transferencia feita com sucesso, novo saldo"+contaPoupanca.getSaldo());
        }else{
            System.out.println("Transferencia sem sucesso,");
        }

        System.out.println(""+contaPoupanca);

    }
}
