package com.schema3.epamTaskpro;

class Candy extends Chocolates implements Gift{
    Candy(int quantity,int calories,int wei){
    super(quantity,calories,wei);
    }
    public void name(){
        System.out.println("Candy is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
         return "Candy";
    }
    public int getweight(){
        return wei;
    }
}