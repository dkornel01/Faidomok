/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idomok;

import faidomok.FaIdomok;

public abstract class FaIdom {
    private double fajsuly=0.8;

    public FaIdom() {
        
    }
    
    public abstract double terfogat();
    
    public double suly(){
        return fajsuly*terfogat();
    }

    @Override
    public  String toString() {
        return "---FaIdom" + "{ fajsuly=" + fajsuly+"}";
    }
    
    
}
