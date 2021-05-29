
// INF-300 Laboratório de Java
// TestaAcesso.java 

//class ContaCor {
//  float saldoAtual;  // atributo a ser oferecido acesso
//}

public class TestaAcesso { 
    public static void main(String[] args) {
    
        ContaCor conta = new ContaCor();     // cria objeto conta
         
        conta.saldoAtual = 10.0f;         

        System.out.println("Saldo : " + conta.saldoAtual); 

    }
} 
