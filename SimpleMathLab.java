/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemathlab;

import java.util.Scanner;




public class SimpleMathLab {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Number1;
        int Number2;
        int Sum;
        int Difference;
        int Product;
        int Quotient;

        System.out.print( "Enter a number: ");
        Number1 = input.nextInt();

        System.out.print( "Now enter another number: ");
        Number2 = input.nextInt();
      
        Sum = Number1 + Number2;
        Difference = Number1 - Number2;
        Product = Number1 * Number2;
        Quotient = Number1 / Number2;

        System.out.printf( "\nThe sum of these two numbers is %d.\n"
                + "The difference of these two numbers is %d.\n"
                + "The product of these two numbers is %d.\n"
                + "The quotient of these two numbers is %d.\n", Sum, Difference, Product, Quotient);

        }
}
