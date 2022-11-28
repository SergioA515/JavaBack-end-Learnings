/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectJava;
import java.util.Scanner;
import models.Product;
/**
 *
 * @author Sena
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String answer = "n";
        double price=0;
        double sumatory;
        int total=0;
        Product prod;
        System.out.println();
        String name=scan.nextLine();
        System.out.println("Su nombre es "+ name );
        if(name=="Pendejo"){
            System.out.println("Hola "+ name);
        }
    }
}
