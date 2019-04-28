/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulatie;

/**
 *
 * @author David PC
 */
public class Vehicul {
    public int nrVehicul;
    public int nrRoti;
    public String culoare;
    public String marca;
    public int capacitate;
    public int viteza = 0;
    
    public void pornire(){
        System.out.println("Masina a fost pornita");
    }
    public void oprire(){
        System.out.println("oprit");
        viteza = 0;
    }
    public void accelerare(int vit){
        viteza += vit;
        System.out.println("Vehiculul a accelerat cu " + vit + ". Viteza actuala este " + viteza);
    }
    public void decelerare(int vit){
        if(viteza >= vit){
            viteza -= vit;
            System.out.println("Vehiculul a decelerat cu " + vit + ". Viteza actuala este " + viteza);
        } else {
            viteza = 0;
            System.out.println("Viteza de decelerare este mai mare decat viteza curenta. Vehiculul stationeaza");
        }
    }
    
    public void afiseazavehicul(){
        System.out.println("Vehiculul " + nrVehicul + " are " + nrRoti + " roti, culoarea " + culoare + ", marca " + marca + " si capacitatea cilindrica " + capacitate);
        
        
    }
}
