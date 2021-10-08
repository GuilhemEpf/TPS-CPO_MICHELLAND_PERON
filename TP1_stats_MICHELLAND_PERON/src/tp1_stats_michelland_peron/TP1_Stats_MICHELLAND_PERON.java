/*
EX4
MICHELLAND / PERON
TP1_Syntaxe de base
07/10
TP1A2
 */
package tp1_stats_michelland_peron;
      
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class TP1_Stats_MICHELLAND_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float m=0;
        Random Aleatoire= new Random();
        int Tableau[]= new int[6];
        System.out.println("Entrer un nombre (entier) : ");
        Scanner sc = new Scanner(System.in);
        m=sc.nextFloat();
        for (double i=0; i<m ; i++){
            int n = Aleatoire.nextInt(6);
            Tableau[n]+=1;
        }
        for (int i=0 ; i<Tableau.length ; i++){
            System.out.print((Tableau[i]/m)*100+" ; ");
        }
    }
    
}
