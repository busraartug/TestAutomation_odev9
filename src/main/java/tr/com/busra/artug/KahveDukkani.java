package tr.com.busra.artug;

import java.util.ArrayList;
import java.util.List;

public class KahveDukkani {

    private List<String> kahveCesitleri;
    private List<String> indirimliCesitler;

        public KahveDukkani(){
            kahveCesitleri = new ArrayList<>();
            kahveCesitleri.add("Filtre");
            kahveCesitleri.add("Latte");
            kahveCesitleri.add("Espresso");
            kahveCesitleri.add("Cappuccino");

            indirimliCesitler = new ArrayList<>();
            indirimliCesitler.add("Filtre");
            indirimliCesitler.add("Latte");
        }
        public void kahveSiparisiAl(String kahveSecimi) throws Exception{
            searchForCoffee(kahveSecimi);
        }

        private void searchForCoffee(String kahveSecimi) throws Exception {
            boolean kahveBulundu = false;

            for(String kahve : indirimliCesitler) {
                if(!kahveSecimi.equals(kahve))
                {
                    continue;
                } else {
                    kahveBulundu = true;
                    break;
                }
            }

            if(!kahveBulundu) {
                throw new Exception("Kahve Bulunamadı.");
            } else {
                System.out.println("Kahve Bulundu.");
            }
        }

}
