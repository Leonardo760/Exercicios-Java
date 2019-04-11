/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma.de.dois.valores;
import java.util.Scanner;
/**
 *
 * @author LEONARDOCARVALHOPINH
 */
public class SomaDeDoisValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o 1° valor: ");
        x = entrada.nextInt();
            System.out.println("Digite o 2° Valor: ");
        y = entrada.nextInt();
        int z = x + y;
        if (z > 10) {
            System.out.println(z);
        }
    }
    
}
