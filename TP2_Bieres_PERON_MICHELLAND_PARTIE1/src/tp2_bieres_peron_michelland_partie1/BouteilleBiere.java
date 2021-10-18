/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_peron_michelland_partie1;

/**
 *
 * @author guilh
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
}  
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie, boolean ouvert) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = ouvert;
}
public void Décapsuler() {
    if (ouverte == false){
        System.out.println("Biere ouverte BRAVO! ");
        ouverte=true; 
    }
    else {
        System.out.println("erreur : biere déjà ouverte ");
        ouverte=true;
    }
} 
@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "\noui" ;
    else chaine_a_retourner += "\nnon" ;
        return chaine_a_retourner ;
}
}

