package com.schema3.epamTaskpro;

class Candy extends Chocolates implements Gift{
    Candy(int quantity,int calories){
    super(quantity,calories);
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
}