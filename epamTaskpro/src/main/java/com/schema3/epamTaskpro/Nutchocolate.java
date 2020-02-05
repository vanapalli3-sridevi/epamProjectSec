package com.schema3.epamTaskpro;

class Nutchocolate extends Chocolates implements Gift{
    Nutchocolate(int quantity,int calories){
    super(quantity,calories);
}
    public void name(){
        System.out.println("Nutchocolate is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "NutChocolate";
   }
}