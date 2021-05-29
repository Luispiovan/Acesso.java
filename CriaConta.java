
// INF-304 Laboratório de Java
// CriaConta.java 

class ContaCor {
    static float saldoAtual;  // atributo a ser oferecido acesso

    public void creditaValor(float val) {  // acesso à escrita de saldo
        saldoAtual = saldoAtual + val;
    }

    public static float getSaldo() {  // acesso à leitura do saldo
        return saldoAtual;
    }

}

public class CriaConta {
    public static void main(String[] args) {

        ContaCor conta = new ContaCor();   // cria objeto conta

        conta.saldoAtual = 10.0f;         // inicializa saldo

        System.out.println("Saldo : " + conta.saldoAtual);
    }
} 
