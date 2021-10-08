/*
PERON MICHELLAND
TP1 A2
SYNTAXE DE BASE
04/10/2021
 */
package TP1_EXO3_MICHELLAND_PERON;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class TP1_EXO3_MICHELLAND_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();        
        int n = generateurAleat.nextInt(100);  
        Scanner sc = new Scanner(System.in);  
        int facile = generateurAleat.nextInt(25);
        int moyen = generateurAleat.nextInt(50);
        int difficile = generateurAleat.nextInt(100);
        int compteur;
        compteur=0;
        System.out.println("Choisissez le niveau de difficulté entre 1 et 3");
        int difficulté = sc.nextInt();
        
        if (difficulté==1) {
            System.out.println("Vous avez choisi le niveau FACILE");
            System.out.println("Rentrez un nombre entre 0 et 25");
                     
            while (1==1) {                 
                int nombre1 = sc.nextInt();
                compteur=compteur+1;
        
                if (nombre1 > 25) {                     
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }
                if (nombre1 < 0) {
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }                 
                if (0 < nombre1 & nombre1 < 25) {
                    if (facile == nombre1) {
                        System.out.println("Gagné");
                        System.out.println(compteur);
                    }     
                if (facile > nombre1) {
                    System.out.println("Trop petit");
                }                     
                if (facile < nombre1) { 
                    System.out.println("Trop grand");
                }
                if (facile > 3*nombre1) {
                    System.out.println("Vraiment trop petit");
                }
                if (facile < nombre1/3) {
                    System.out.println("vraiment trop grand");
                }           
                }
            }
        }                 
        if (difficulté==2) {
            System.out.println("Vous avez choisi le niveau MOYEN saisissez un nombre entre 0 et 50");
            System.out.println("Rentrez un nombre entre 0 et 50");
            while (1==1) { 
                int nombre1 = sc.nextInt();
                compteur=compteur+1;                         
                if (nombre1 > 50) {
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }                                 
                if (nombre1 < 0) {                     
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }                 
                if (!(0 < nombre1 & nombre1< 50)) { 
                } else {
                    if (moyen == nombre1) {
                        System.out.println("Gagné");
                        System.out.println(compteur);
                    }                     
                    if (moyen > nombre1) {
                        System.out.println("Trop petit");
                    }
                    if (moyen < nombre1) { 
                        System.out.println("Trop grand");
                    } 
                    if (moyen > 3*nombre1) {
                        System.out.println("Vraiment trop petit");
                    }
                    if (moyen < nombre1/3) {  
                        System.out.println("Vraiment trop grand");
                    }
                }             
            }         
        }                 
        if (difficulté==3) { 
            System.out.println("Vous avez choisi le niveau DIFFICILE saisissez un nombre entre 0 et 100");
            System.out.println("Rentrez un nombre entre 0 et 100");
            while (1==1) {
                int nombre1 = sc.nextInt();
                compteur=1+compteur;                         
                if (nombre1 > 100) {                     
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }                                 
                if (nombre1 < 0) {       
                    System.out.println("Rentrez un chiffre compris entre 0 et 25");
                }                             
                if (0 < nombre1 & nombre1< 100) { 
                    if (difficile == nombre1) {  
                        System.out.println("Gagné");     
                        System.out.println(compteur);            
                    }                    
                    if (difficile > nombre1) { 
                        System.out.println("Trop petit");  
                    } 
                    if (difficile < nombre1) {  
                        System.out.println("Trop grand");
                    }
                    if (difficile > 3*nombre1) {
                        System.out.println("Vraiment trop petit");   
                    }                     
                    if (difficile < nombre1/3) {  
                        System.out.println("Vraiment trop grand");     
                    }                   
                }             
            }         
        }   
    }
}