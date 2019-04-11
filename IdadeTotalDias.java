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
public class IdadeTotalDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0,y=0,z=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade(anos): ");
        x = entrada.nextInt();
        System.out.println("Digite sua idade(meses): ");
        y = entrada.nextInt();
        System.out.println("Digite sua idade(dias): ");
        z = entrada.nextInt();
        int a = x * 365;
        int b = y * 30;
        int t = a + b + z;
        System.out.println(""+x+" Anos "+y+" Meses "+z+" Dias = "+t+" Dias");
    }
    
}
    
    
    
