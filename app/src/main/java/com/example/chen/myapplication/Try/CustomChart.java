package com.example.chen.myapplication.Try;

/**
 * Created by chen on 2017/10/4.
 */

class CustomChart {
    CustomDao dao;

    public void setDao(CustomDao dao) {
        this.dao = dao;
    }

    public  void  disPlay(){
        for (Custom custom: dao.findCusttomers()){
            System.out.print("customer: "+custom.name);
        }
    }
}
