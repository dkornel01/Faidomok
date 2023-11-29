
package faidomok;

import idomok.FaIdom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;


public class FaIdomok {
    private ArrayList<FaIdom>idomok;
    public FaIdomok() {
        idomok=new ArrayList<>(5);
        idomok.add(new Gomb(3));
        idomok.add(new Gomb(2));
        idomok.add(new Hasab(3,4,5));
        idomok.add(new Hasab(1,1,1));
        idomok.add(new Hasab(4,4,4));
        run();
    }

    public void run() {
        System.out.println(idomok.get(0).toString());
        System.out.println(idomok.get(1).toString());
        System.out.println(idomok.get(2).toString());
        System.out.println(idomok.get(3).toString());
        System.out.println(idomok.get(4).toString());
        System.out.println(osszSuly()+ "ossz suly");
        System.out.println(osszGombSuly()+" oszz gomb suly");
        System.out.println(minV()+" minimum térfogat");
        System.out.println(maxV()+ "maximum térfogat");
           
    }
    public double osszSuly(){
        double suly=0;
            for (int i=0;i<idomok.size();i++){
                FaIdom egy = idomok.get(i);
                suly+=egy.suly();
            }
            return suly;
    }
    public double osszGombSuly(){
         double suly=0;
            for (int i=0;i<idomok.size();i++){
                FaIdom egy =idomok.get(i);
                if (egy instanceof Gomb){
                suly+=egy.suly();
                }
            }
            return suly;
    }
    public double minV(){
        FaIdom egy = idomok.get(0);
         double min=egy.terfogat();
            for (int i=1;i<idomok.size();i++){
                egy = idomok.get(i);
                if (min>egy.terfogat()){
                    min=egy.terfogat();
                }
            }
            return min ;
    }
    public double maxV(){
         double max=0;
            for (int i=0;i<idomok.size();i++){
                FaIdom egy = idomok.get(i);
                if (max<egy.terfogat())
                    max=egy.terfogat();
            }
            return max;
    }
}
