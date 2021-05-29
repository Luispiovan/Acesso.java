
// INF-304 Laboratório de Java
// MetodoAcesso.java 

//class ContaCor {
//  private float saldoAtual;  // atributo a ser oferecido acesso
//
//  void creditaValor (float val) {  // acesso à escrita de saldo
//    saldoAtual= saldoAtual + val;
//  }
//
//  float getSaldo() {  // acesso à leitura do saldo
//    return saldoAtual;
//  }
//
//}

public class MetodoAcesso { 
    public static void main(String[] args) {
    
        ContaCor conta = new ContaCor();     // cria objeto conta        

        conta.creditaValor(20.0f); // usa método de acesso
        System.out.println("Saldo : " + conta.getSaldo()); 

        conta.creditaValor(30.0f); // usa método de acesso
        System.out.println("Saldo : " + conta.getSaldo()); 

    }
} 
