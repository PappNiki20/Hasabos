
package faidomok;

abstract public class Faidom {
   static private double fajsuly = 0.8;
   public double suly(){
     double suly = terfogat()*fajsuly;
     return suly;
   }
  abstract public double terfogat();
    @Override
    public String toString() {
        return "Faidom{" + '}';
    }
    
}
