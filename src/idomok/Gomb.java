/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idomok;


public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString()+" Sugar:"+sugar;
    }

    @Override
    public double terfogat() {
       return (sugar*sugar*sugar)*4.0*Math.PI;
    }
    

    

   
    
    
}
