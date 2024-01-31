package tr.com.busra.artug;
public class Main {
    public static void main(String[] args) {
        KahveDukkani kahveDukkani = new KahveDukkani();


        try {
            kahveDukkani.kahveSiparisiAl("Latte");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            kahveDukkani.kahveSiparisiAl("Espresso");
        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }
    }
