package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
	@Autowired
    private IDao dao;

    // Injection via setter (couplage faible)
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public String calcul() {
        return "Date récupérée du DAO : " + dao.getDate();
    }
}
