/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// o pacote é criado na hora da criação do projeto
package testadeclaracaoscanner.testadeclaracaoscanner;

// importamos a classe scanner
import java.util.Scanner;
/**
 *
 * @author hermes
 */

public class TestaDeclaracaoScanner {
    public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    while(sc.hasNext()){
      i++;
      System.out.println("Token: "+sc.next());
    }
    sc.close(); //Encerra o programa
  }
    
}
