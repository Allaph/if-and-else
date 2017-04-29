/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoaula06;

import java.util.Scanner;

/**
 *
 * @author absyd
 */
public class Videoaula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, soma;//declaração de variáveis  
        
        Scanner s = new Scanner(System.in);//instancia do objeto de leitura de dados
        
        System.out.println("Informe o primeiro número:");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();
        
        soma = num1 + num2;
        
        //estrutura de repetição
        
        if(soma > 10){//estrutura de condição "se"
            System.out.println("A soma é maior do que 10. \nO valor da soma é: "+ soma);
        }
        else if (soma < 10){
            System.out.println("A soma é menor do que 10. \nO valor da soma é: "+ soma);
        }
        else{//estrutura de condição "senão
            System.out.println("A soma é igual a 10");
        }
    }
    //obs: \n serve para quebra de linha.
}
