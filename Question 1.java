/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author hanna
 */
public class Main {

    public static void main(String[] args) {
        int[] counts = {0, 0, 0, 0, 0, 0, 0,0, 0, 0};
        
        int[] bonus = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10, 11, 12 ,13, 14, 15};
        
        for (int i = 0; i < 15; i++) {
            bonus[i]++;
        }
        
        int[] bestScores = {10, 20, 30, 40, 50};
         for (int i = 0; i < 5; i++){
            
            System.out.print(bestScores[i] + " ");
         }
             
    }
}

