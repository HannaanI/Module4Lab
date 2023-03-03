/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variableargument;

/**
 *
 * @author hannaan
 */
public class VariableArgument {
   
        
     public static int product(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public static void main(String[] args) {
       int a1 = 10;
       int a2 = 20;
       int a3 = 30;
       int a4 = 40;
       int a5 = 50;
       int a6 = 60;
       
       System.out.print("product of a1 and a2:  " + product(a1, a2) + "\n" );
       System.out.print("product of a1 and a3: " + product(a1, a3) + "\n"  );
       System.out.print("product of a1 and a4: " + product(a1, a4) + "\n"  );
       System.out.print("product of a1, a2, and a6: " + product(a1, a2, a6) + "\n"  );
       System.out.print("product of a1, a2, a5, a4: " + product(a1, a2, a5, a4) + "\n"  );
       System.out.print("product of a3 and a2: " + product(a3, a2) );
       
       
    }
}
