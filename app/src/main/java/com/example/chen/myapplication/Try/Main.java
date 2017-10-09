package com.example.chen.myapplication.Try;

/**
 * Created by chen on 2017/10/4.
 */

public class Main {
    public static  void  main(String[] args){
        System.out.print("this is main method 单一职责原则\n");
        CustomChart customChart=new CustomChart();
        customChart.setDao(new CustomDao());
        customChart.disPlay();
        System.out.print("\nthis is main method 开放封闭原则\n");
        CharDisplayManger charDisplayManger=new CharDisplayManger();
        charDisplayManger.display(new PieChart());
        charDisplayManger.display(new BarChart());
        System.out.print("\nthis is main method 里氏替换原则\n");
        Soldier soldier=new Soldier();
        soldier.killEnemy(new Rifle());
        soldier.killEnemy(new HandGun());
        System.out.print("\nthis is main method 依赖倒置原则\n");



    }
}
