package com.example.demo;

public class MainAppDynamic {
    public static void main(String[] args) throws Exception {
        String daoClass = "com.example.demo.DaoImpl";
        String metierClass = "com.example.demo.MetierImpl";

        IDao dao = (IDao) Class.forName(daoClass).getDeclaredConstructor().newInstance();
        MetierImpl metier = (MetierImpl) Class.forName(metierClass).getDeclaredConstructor().newInstance();

        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
