package com.example.solid.dip;

import com.example.solid.dip.Database;

public class MySQLDatabase implements Database {

    @Override
    public void saveOrder(){
        System.out.println("saving");
    }
}