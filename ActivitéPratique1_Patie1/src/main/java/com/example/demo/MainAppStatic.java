package com.example.demo;

public class MainAppStatic {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();         // création directe
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);               // injection via setter
        System.out.println(metier.calcul());
    }
}
