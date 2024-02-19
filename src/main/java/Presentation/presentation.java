package Presentation;

import Metier.MetierImpl;
import ext.DaoImpl2;
public class presentation {
    public static void main(String[] args){
        // Injection des dependances par instanciation statique => new => couplage fort
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Résultat : "+metier.calcul());
    }
}
