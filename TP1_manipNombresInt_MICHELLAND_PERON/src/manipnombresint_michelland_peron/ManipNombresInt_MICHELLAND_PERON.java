/*
EX1
MICHELLAND / PERON
TP1_Syntaxe de base
07/10
TP1A2
*/
package manipnombresint_michelland_peron;

import java.util.Scanner;

/**
 *
 * @author miche
 */
public class ManipNombresInt_MICHELLAND_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entrer le premier nombre :");
        int entier1 = sc.nextInt();
        System.out.println(" Le premier nombre est : "+entier1);
        System.out.println(" Entrer le second nombre :");
        int entier2 = sc.nextInt();
        System.out.println(" Le second nombre est : "+entier2);
        int k = entier1+entier2;
        int l= entier1-entier2;
        int m= entier1*entier2;
        System.out.println(" Somme : "+k);
        System.out.println(" Difference : "+l);
        System.out.println(" Produit : "+m);
        int quot=entier1/entier2;
        float reste=entier1%entier2;
        System.out.println(" Quotien : "+quot+ "et le reste : "+reste);
    }
    
}
