
// INF-304 Laboratório de Java
// StaticMetodo.java 

//class ContaCor {
//  static private float saldoAtual;  // atributo a ser oferecido acesso
//
//  void creditaValor (float val) {
//    saldoAtual = saldoAtual + val;
//  }
//
//  static float getSaldo() {  // método estático
//    return saldoAtual;
//  }
//
//}

public class StaticMetodo { 
    public static void main(String[] args) {
    
        ContaCor conta = new ContaCor();     // cria um objeto conta    

        conta.creditaValor(10.0f); // armazena 10
        System.out.println("Saldo : " + ContaCor.getSaldo()); 
    }
} 
