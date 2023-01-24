package com.ahmetbeyaz.cdi;



import jakarta.enterprise.inject.Produces;

import java.util.ArrayList;
import java.util.List;

public class InProduces {

    @Produces //üretiyor
    public List<String>  getList(){

        List<String>  liste=new ArrayList<>();
        liste.add("java");
        liste.add("c#");
        liste.add("phyton");
        return  liste;

    }
}
