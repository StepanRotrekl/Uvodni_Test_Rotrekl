import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SpravaMazlicku {

    public static double vypocetPrumernehoVeku(List<Mazlicek>seznam){
        if(seznam.isEmpty()){ return 0; }
        double soucet = 0;
        for(Mazlicek mazlicek : seznam){
            soucet += mazlicek.getVek();
        }
        return soucet / seznam.size();
    }

    public static double vypocetPrumerneVahy(List<Mazlicek>seznam) {
        if (seznam.isEmpty()) {
            return 0;
        }
        double soucet = 0;
        for (Mazlicek mazlicek : seznam) {
            soucet += mazlicek.getVaha();
        }
        return soucet / seznam.size();
    }

    public static Mazlicek najdiMazlickaPodleJmena(String jmeno, List<Mazlicek>seznam){
        for(Mazlicek mazlicek : seznam){
            if(mazlicek.getJmeno().equalsIgnoreCase(jmeno)){
                return mazlicek;
            }
        }
        return null;

    }

    public static Mazlicek filtrujMazlickyPodleDruhu(String druh, List<Mazlicek>seznam){
        List<Mazlicek> vysledek = new ArrayList<>();
        for(Mazlicek mazlicek : seznam){
            if(mazlicek.getDruh().equalsIgnoreCase(druh)){
                vysledek.add(mazlicek);
            }
        }
        return vysledek.get(0);
    }




}
