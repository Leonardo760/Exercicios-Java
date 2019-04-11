/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagem0a20;
import java.util.Scanner;
        

public class Contagem0a20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0,y=0;
        Scanner entrada = new Scanner(System.in);
        while (x<=20) {
        System.out.println(x);
        x++;
        System.out.println("Se deseja parar digite 0 senão digite 1: ");
        y = entrada.nextInt();
            if (y == 0) {
                break;
            }
        }
            
    }
    
}
