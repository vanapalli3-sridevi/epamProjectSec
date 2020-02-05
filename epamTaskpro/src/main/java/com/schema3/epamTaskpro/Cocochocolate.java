package com.schema3.epamTaskpro;

class Cocochocolate extends Chocolates implements Gift{
    Cocochocolate(int quantity,int calories){
    super(quantity,calories);
    }
    public void name(){
        System.out.println("Chocolate is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "Cocochocolate";
   }
}