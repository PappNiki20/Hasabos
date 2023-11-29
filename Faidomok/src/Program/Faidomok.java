package Program;

import faidomok.Faidom;
import faidomok.Gomb;
import faidomok.Hasab;
import java.util.ArrayList;
import java.util.List;

public class Faidomok {

    public static void main(String[] args) {
        new Faidomok().run();
    }

    private List<Faidom> idomok;

    public Faidomok() {
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (Faidom h : idomok) {

            osszSuly += ((Faidom) h).suly();

        }
        return osszSuly;
    }

    public double osszGombSuly() {
        double osszSuly = 0;
        for (Faidom h : idomok) {
            if (h instanceof Gomb) {
                osszSuly += ((Gomb) h).suly();
            }
        }
        return osszSuly;
    }

    public Faidom minV() {
        Faidom min = (Faidom) idomok.get(0);
        double minim = idomok.get(0).terfogat();

        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat() < minim) {
                minim =idomok.indexOf(i);
            }
        }

        System.out.println("Legkisebb: " + min);
    return min;
    }
   


public Faidom maxV() {
        return null;
    }

    public void run() {
        
        List<Faidom> lista;
        lista = new ArrayList<Faidom>();
        Gomb g1 = new Gomb(3);
        Gomb g2 = new Gomb(7);
        Hasab h1 = new Hasab(2, 4, 7);
        Hasab h2 = new Hasab(3, 2, 5);
        lista.add(0, g1);
        lista.add(1, g2);
        lista.add(2, h1);
        lista.add(3, h2);
       idomok = lista;
        
         System.out.println("A programben lévő Idomok: ");
      
        for (Faidom h : idomok) {
            System.out.println(h.terfogat());
        }
        System.out.println("A gömbök összsúlya: " +osszGombSuly());
         System.out.println("A faidomok összsúlya: " +osszSuly());
          System.out.println("A Legkisebb terfogat: " +minV());
    }

}
