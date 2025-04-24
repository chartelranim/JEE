package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component("dao")
public class DaoImpl implements IDao {
    public String getDate() {
        return LocalDate.now().toString(); 
    }
}