package com.schema3.epamTaskpro;
class Wrafferchocolate extends Chocolates implements Gift{
    Wrafferchocolate(int quantity,int calories){
    super(quantity,calories);
    }
    public void name(){
        System.out.println("Wrafferchocolate is gifed");
    }
    public int getquantity(){
        return quantity;
    }
    public String getname(){
        return "Wrafferchocolate";
   }
}