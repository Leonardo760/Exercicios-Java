/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo;
import java.util.Scanner;
/**
 *
 * @author LEONARDOCARVALHOPINH
 */
public class DescontoINSS{
    
    public static void main(String[] args) {
        float x=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario da pessoa: ");
            x = entrada.nextFloat();
        if (x<=600){
            System.out.println("O valor a ser descontado é: R$0,00!");
        } else if (x>600 & x<=1200){
            x=(20*x) / 100;
            System.out.println(x);
        } else if (x>1200 & x<=2000){
            x= (25*x) / 100;
            System.out.println("O valor a ser descontado é: R$"+x+"!");
        } else {
            x= (30*x) / 100;
            System.out.println("O valor a ser descontado é: R$"+x+"!");
        }
            
    }
}