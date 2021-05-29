
// INF-304 Laboratório de Java
// StaticVar.java 

//class ContaCor {
//  // primeiro teste sem o <static>, depois o insira
//  private float saldoAtual;
//
//  void creditaValor (float val) {
//    saldoAtual = saldoAtual + val;
//  }
//
//  float getSaldo() {  // acesso à leitura do saldo
//    return saldoAtual;
//  }
//
//}

public class StaticVar { 
    public static void main(String[] args) {
    
        ContaCor conta1 = new ContaCor();     // cria um objeto conta    
        ContaCor conta2 = new ContaCor();    

        conta1.creditaValor(10.0f); // armazena 10
        System.out.println("Saldo : " + conta1.getSaldo()); 

        conta2.creditaValor(5.0f); // e mais 5
        System.out.println("Saldo : " + conta2.getSaldo()); 

    }
} 
