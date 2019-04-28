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
public class Aplicatie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicul veh1 = new Vehicul();
        veh1.nrVehicul = 1;
        veh1.capacitate = 2000;
        veh1.culoare = "roz";
        veh1.marca = "matiz";
        veh1.nrRoti = 4;
        
        veh1.afiseazavehicul();
        veh1.pornire();
        veh1.accelerare(20);
        veh1.decelerare(20);
        veh1.accelerare(100);
        veh1.decelerare(20);
        veh1.decelerare(90);
        veh1.accelerare(10);
        veh1.oprire();
    }
    
}
